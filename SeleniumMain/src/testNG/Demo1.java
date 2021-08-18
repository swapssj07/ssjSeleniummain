package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	
		@Test
		public void tc1() {
			Reporter.log("hello1", true);
		}
		
		@Test
		public void tc2() {
			Reporter.log("hello2", true);
		}
}
