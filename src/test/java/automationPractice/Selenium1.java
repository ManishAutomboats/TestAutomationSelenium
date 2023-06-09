package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup(); // browser version and driver version

		WebDriver driver = new FirefoxDriver(); // browser launch

		driver.get("https://www.saucedemo.com/"); // URL launch

		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");

		WebElement passsword = driver.findElement(By.xpath("//input[@id='password']"));
		passsword.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		Thread.sleep(3000);

		loginButton.click();

	}

}
