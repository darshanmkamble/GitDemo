package test;

import org.testng.annotations.Test;

public class TestNgFour {

	@Test
	public void webHomeLogin() {
		//Selenium code
		System.out.println("Web Home Login");
	}

	@Test(groups = { "Smoke" })
	public void mobileHomeLogin() {
		//Appium code
		System.out.println("Mobile Home Login");
	}

	@Test
	public void loginAPI() {
		//REST API automation
		System.out.println("Login Home API");
	}
}
