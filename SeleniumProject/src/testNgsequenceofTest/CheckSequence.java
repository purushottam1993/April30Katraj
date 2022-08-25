package testNgsequenceofTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckSequence {

	@Test
	public void testcase1() {
		System.out.println("test case 1 is run");
	}
	
	@Test(priority=2)
	public void atestcase2() {
		System.out.println("test case 2 is run");
	}
	@Test(priority=-1)
	public void testcase3() {
		System.out.println("test case 3 is run");
	}

	@Test(priority=-1)
	public void testcase4() {
		Reporter.log("Checking reporter", false);
		
	}
	
}
	
