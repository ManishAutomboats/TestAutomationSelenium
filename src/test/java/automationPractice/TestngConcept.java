package automationPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Test;


public class TestngConcept implements ITestListener {
	
	@Test(groups="smoke",priority=3)
	public static void loginUser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		System.out.println("login user");
		System.out.println(Thread.currentThread().getId());
		Assert.assertTrue(true);
	}
	
		
		
	

}
