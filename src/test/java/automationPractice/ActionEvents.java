package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvents {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // browser version and driver version

		WebDriver driver = new ChromeDriver(); // browser launch

		driver.get("https://www.browserstack.com/"); // URL launch

		driver.manage().window().maximize();

		WebElement productMenu = driver.findElement(By.cssSelector("button#products-dd-toggle"));

		Actions a = new Actions(driver);
		       a.doubleClick(productMenu);
		       a.contextClick(productMenu);
		       a.dragAndDrop(productMenu, productMenu);

		a.moveToElement(productMenu).build().perform();

		WebElement liveMenu = driver.findElement(By.cssSelector("[aria-label='Live']"));
		liveMenu.click();

		WebElement searchIcon = driver.findElement(By.cssSelector("[aria-label='Search']"));
		searchIcon.click();
		WebElement searchInput = driver.findElement(By.cssSelector("input#doc-search-box-input"));
		searchInput.sendKeys("Test");
		a.sendKeys(Keys.ENTER).build().perform();
	}
}
