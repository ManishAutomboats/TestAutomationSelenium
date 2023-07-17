package automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup(); // browser version and driver version

		WebDriver driver = new ChromeDriver(); // browser launch

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html"); // URL launch

		driver.manage().window().maximize();
		
	
		   WebElement dropDownBtn=driver.findElement(By.cssSelector("button#menu1"));
           dropDownBtn.click(); 
               
          List<WebElement> dropdownList=driver.findElements(By.cssSelector("ul.dropdown-menu li a")); // 4
          
                int listSize=dropdownList.size();
                System.out.println(listSize);
          
          
           // for Each
          
           for(WebElement ele:dropdownList) {
        	
        	    String value= ele.getText();
    
        	    if(value.equals("JavaScript")) 
        	    	ele.click();
        	    	break;
        	    }
        	   
        	   
        	   
           }
          
          
         
          
	}


