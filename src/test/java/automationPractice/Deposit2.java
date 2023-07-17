
package automationPractice;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Deposit2 {
	
	@Test(groups="smoke",priority=1)
	public void cash() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("cash");
		Assert.assertTrue(true);
	}
@Test(dependsOnMethods ="cash")
	public void card() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("card");
	}
@Test
public void paytm() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("paytm");
	Assert.assertTrue(false);
}

}
