package testimp;

import org.testng.annotations.Test;

import page.LoginPage;

public class LoginPageTest {

	LoginPage login= new LoginPage();
	
	@Test
public void loginWithValidUser() {
		login.loginWithValidUser();
		
	}
}
