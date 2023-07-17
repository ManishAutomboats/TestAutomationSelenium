package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoanTestcases {
	
	
	@Test
	public void auto() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		System.out.println("Testuser");
		System.out.println(Thread.currentThread().getId());
		Assert.assertTrue(true);
	}
	}


