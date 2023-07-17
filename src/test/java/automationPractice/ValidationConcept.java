package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationConcept {

	public static void main(String[] args) {
		ValidationConcept v = new ValidationConcept();
		v.validLogin();

	}

	public void validLogin() {

		WebDriverManager.chromedriver().setup(); // browser version and driver version

		WebDriver driver = new ChromeDriver(); // browser launch

		driver.get("https://www.saucedemo.com/"); // URL launch

		driver.manage().window().maximize();
		
	WebElement heading=driver.findElement(By.cssSelector("div.login_logo"));
	
	          String homePageHeading= heading.getText();
	          
	          Assert.assertEquals(homePageHeading,"Swag Labst");

		WebElement userName = driver.findElement(By.cssSelector("input#user-name"));
		userName.sendKeys("standard_user");

		WebElement password = driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("secret_sauce");

		WebElement loginBtn = driver.findElement(By.cssSelector("input#login-button"));
		loginBtn.click();

		Assert.assertTrue(driver.findElement(By.cssSelector("span.title")).isDisplayed());

	}
}
