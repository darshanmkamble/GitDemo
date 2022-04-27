package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgTwo {
	@Test(groups = { "Smoke" })
	public void goodbye() {
		System.out.println("goodbye");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("Write all database cleaning operations here");
	}
}
