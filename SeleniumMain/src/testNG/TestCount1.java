package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCount1 {
	
/*	@Test(invocationCount = 6)
		public void TC01() {
			Reporter.log("hiii", true);
		}
	*/
	
	@Test(priority = 2)
	public void TC01() {
		Reporter.log("hiii1", true);
	}
	
	@Test(priority = 1)
	public void TC02() {
		Reporter.log("hiii2", true);
	}
	
	@Test(priority = -2)
	public void TC03() {
		Reporter.log("hiii3", true);
	}
	
	@Test(priority = 3, enabled = false)
	public void TC04() {
		Reporter.log("hiii4", true);
	}
	
}
