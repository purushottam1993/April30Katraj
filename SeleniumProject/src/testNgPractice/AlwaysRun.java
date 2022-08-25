package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlwaysRun {
	
	@Test(priority=1)
	public void login() {
		System.out.println("login method");
		SoftAssert soft = new SoftAssert();
		Assert.assertEquals(false, true);
		soft.assertAll();
	}
	@Test(priority=2)
	public void home() {
		System.out.println("method home");
	}
	@Test(priority=3,dependsOnMethods="login",alwaysRun=true)
	public void feed() {
		System.out.println("method feed");
	}

}
