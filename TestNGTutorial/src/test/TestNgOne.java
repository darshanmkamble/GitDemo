package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgOne {

	@AfterTest
	public void finalCleanup() {
		System.out.println("Write your database closing steps here");
	}

	@Test
	public void hello() {
		System.out.println("hello");
		Assert.assertTrue(false);
	}

	@Test
	public void bye() {
		System.out.println("bye");
	}

	@AfterSuite
	public void stopExecution() {
		System.out.println("I am the last!");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executes before every method!");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Executes after every method!");
	}
}
