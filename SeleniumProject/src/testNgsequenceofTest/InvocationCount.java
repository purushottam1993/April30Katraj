package testNgsequenceofTest;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	public void write() {
		System.out.println("writing");
	}
	@Test(invocationCount=6)
	public void read() {
		System.out.println("reading");
	}
}
//how you can run your test case for 100Times==Using invocationCount
