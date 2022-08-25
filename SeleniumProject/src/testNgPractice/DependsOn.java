package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsOn {
	@Test
	public void login() {
	  System.out.println("login method");
		SoftAssert sof = new SoftAssert();
		Assert.assertEquals(false, true);
		sof.assertAll();
	}
	@Test(priority=2,dependsOnMethods="login")
	public void home() {
		System.out.println("method home");
	}

    @Test(priority=3) 
    public void feed() {
	 System.out.println("method feed");
    }

}
