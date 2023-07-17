package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentGateway {

	@Test(groups="smoke")
	
	public void vlidateCardNumber() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("login user");
		System.out.println(Thread.currentThread().getId());
		Assert.assertTrue(true);
	}	
	}
	

