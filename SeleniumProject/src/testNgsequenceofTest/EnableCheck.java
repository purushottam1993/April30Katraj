package testNgsequenceofTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class EnableCheck {
	
	@Test(priority=1)
	public void login() {
		System.out.println("method login");
	}
	@Test(priority=2,enabled=false)//if we want to ignore perticular test case form exicution
	public void home() {           //then we can write (enabled=false)
		System.out.println("method home");
	}
	@Test(priority=3)
	public void feed() {
		System.out.println("method feed");
	}
	


}
