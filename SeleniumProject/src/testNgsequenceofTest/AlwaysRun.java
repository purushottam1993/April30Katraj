package testNgsequenceofTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlwaysRun {

	@Test(priority=1)
	public void login() {
		System.out.println("login method");
		SoftAssert sof = new SoftAssert();
		sof.assertEquals(false, true);
		sof.assertAll();
	}

 
     @Test(priority=2)
     public void home() {           
	 System.out.println("method home");
	 
   }
     @Test(priority=3,dependsOnMethods="login",alwaysRun=true) 
     public void feed() {           
	 System.out.println("method feed");
     }

}//if we use enabled=true in place of alwaysRun=true then however its depends on some other method
//and that method get failed then current method get skipped
