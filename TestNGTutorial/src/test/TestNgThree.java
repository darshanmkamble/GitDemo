package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgThree {

	@Parameters({ "URL", "APIKey/username" })
	@Test
	public void webCarLogin(String urlName, String key) {
		// Selenium code
		System.out.println("Web Car Login");
		System.out.println(urlName);
		System.out.println(key);
	}

	@Test
	public void mobileCarLogin() {
		// Appium code
		System.out.println("Mobile Car Login");
	}

	@Test(dataProvider = "getData")
	public void mobileCarSignOut(String username, String password) {
		// Appium code
		System.out.println("Mobile Car Login");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(groups = { "Smoke" })
	public void mobileCarSignIn() {
		// Appium code
		System.out.println("Mobile Car Login");
	}

	@Test(dependsOnMethods = { "webCarLogin" })
	public void loginAPI() {
		// REST API automation
		System.out.println("Login Car API");
	}

	@BeforeSuite
	public void setGlobals() {
		System.out.println("I am the number one!");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executes before class!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executes after class!");
	}

	@DataProvider
	public Object[][] getData() {
		// 1st combination - username password - good credit history
		// 2nd combination - 2nd username password - no credit history
		// 3rd combination - fraudulent credit history
		Object[][] data = new Object[3][2];

		// 1st set
		data[0][0] = "firstUserName";
		data[0][1] = "firstPassword";

		// 2nd set
		data[1][0] = "secondUserName";
		data[1][1] = "secondPassword";

		// 3rd set
		data[2][0] = "thirdUserName";
		data[2][1] = "thirdPassword";

		return data;
	}
}
