package testNgsequenceofTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSequence {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("before Suit");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method");
	}
	@Test
	public void test() {
		System.out.println("test execution");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	

}
