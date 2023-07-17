package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {
 
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup(); // browser version and driver version

		WebDriver driver = new FirefoxDriver(); // browser launch

		driver.get("https://www.saucedemo.com/"); // URL launch
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("//input[@id='user-namegdfg']"));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("standard_user");
		
	
		WebElement passsword = driver.findElement(By.xpath("//input[@id='password']"));
		passsword.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));

        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.textToBePresentInElement(userName, "test"));

	}

}
