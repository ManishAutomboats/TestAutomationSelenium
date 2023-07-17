package automationPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) {
		// https://www.hyrtutorials.com/p/alertsdemo.html

		WebDriverManager.chromedriver().setup(); // browser version and driver version

		WebDriver driver = new ChromeDriver(); // browser launch

		driver.get("https://demoqa.com/alerts"); // URL launch

		driver.manage().window().maximize();
		
WebElement clickMeBtn=driver.findElement(By.cssSelector("button#promtButton"));
           JavascriptExecutor js= (JavascriptExecutor)driver;
           js.executeScript("arguments[0].click();",clickMeBtn);
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          
        Alert a=  driver.switchTo().alert();
        
          a.sendKeys("Automation");
         String value= a.getText();
         System.out.println(value);
      
          a.accept();
		
		
		
	}

}
