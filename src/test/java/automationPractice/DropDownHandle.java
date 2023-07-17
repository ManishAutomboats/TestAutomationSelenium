package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // browser version and driver version

		WebDriver driver = new ChromeDriver(); // browser launch

		driver.get("https://www.newlook.com/uk/login"); // URL launch

		driver.manage().window().maximize();
		
		
WebElement dropDown=driver.findElement(By.xpath("//select[@id='titleCode']"));
		
		Select s =new Select(dropDown);
		
		s.selectByVisibleText("Mrs.");
		
	WebElement test=	driver.findElement(By.xpath(""));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",test );

		//s.selectByIndex(3);
		
	//	s.selectByValue("net");
		
		
//	WebElement multiDrop= driver.findElement(By.xpath("//select[@id='ide']"));
//	
//	Select s1= new Select(multiDrop);
//	 
//	  s1.selectByVisibleText("NetBeans");
//	  s1.selectByIndex(0);
//	  s1.selectByValue("vs");
		 
	WebElement ele=	 driver.findElement(By.cssSelector("input#email"));
	
	                driver.findElement(By.cssSelector("input ng-pristine ng-empty ng-valid-email ng-invalid ng-invalid-required ng-valid-maxlength ng-valid-duplicate ng-touched"));
	  
		driver.findElement(By.cssSelector("[name='email']"));
	}

}
