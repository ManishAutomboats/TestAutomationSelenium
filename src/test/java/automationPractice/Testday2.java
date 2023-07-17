package automationPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testday2 {
	

	
@Test
	public void validateCartIcon() {
		System.out.println("cart");
	}
	
	@Test(groups="smoke")
	public void validateSearch() {
		System.out.println("Search");
	}
	@Test
	public void validatePersonIcon() {
		System.out.println("PersonIcon");
	}

}
