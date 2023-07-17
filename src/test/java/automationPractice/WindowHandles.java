package automationPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // browser version and driver version

		WebDriver driver = new ChromeDriver(); // browser launch

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); // URL launch

		driver.manage().window().maximize();

		String parentId = driver.getWindowHandle(); // parent id // A
		System.out.println(parentId);

		WebElement Btn = driver.findElement(By.cssSelector("button#newTabsBtn"));
		Btn.click();

		Set<String> allWindows = driver.getWindowHandles(); // parentId+ all child ID // A B C

		for (String s : allWindows) {

			if (!parentId.equals(s)) {
				driver.switchTo().window(s);
			String title=driver.getTitle();
				if(title.contains("AlertsDemo")) {
					
				WebElement clickBtn=driver.findElement(By.cssSelector("button#alertBox"));
				clickBtn.click();
			Alert a=	driver.switchTo().alert();
			  a.accept();
				           break;
				           
				           // eauals- 100% text compare
				           // contains- partial text compare
				           
				}
				
			
			}

		}
		

	}

}
