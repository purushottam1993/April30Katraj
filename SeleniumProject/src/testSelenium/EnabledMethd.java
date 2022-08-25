package testSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledMethd {
	@Test(priority=1)
	public void UrlMethd(){
	System.out.println("login method");
	Assert.assertEquals(false, true);
	}
	@Test(priority=2,dependsOnMethods="UrlMethd",alwaysRun=true)
	public void home(){
		System.out.println("method hme");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("logout method");
	}

}
