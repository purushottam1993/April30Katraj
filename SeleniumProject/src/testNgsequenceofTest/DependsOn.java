package testNgsequenceofTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsOn {
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
     @Test(priority=3,dependsOnMethods="login") //if any test are depends on prerequisite method and if that 
     public void feed() {       //method is failed then,current method is get skipped...
	 System.out.println("method feed");
     }

}
