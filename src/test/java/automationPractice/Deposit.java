package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deposit {

	@Test
	public void depostCash() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void test() {
		System.out.println("test first");
	}
	@Test
	public void test1() {
		System.out.println("test");
	}
	@Test
	public void test2() {
		System.out.println("test");
	}
	@Test
	public void test3() {
		System.out.println("test");
	}
	@Test
	public void test4() {
		System.out.println("test");
	}
	
	
	
}
