package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
		@Test(groups = "smoke")
		public void TC01() {
			Reporter.log("hi1", true);
		}
		@Test(groups = "functional", dependsOnGroups = "smoke")
		public void TC02() {
			Reporter.log("hi2", true);
		}
		@Test(groups = "smoke")
		public void TC03() {
			Reporter.log("hi3", true);
		}
		@Test(groups = "integration", dependsOnGroups = "functional")
		public void TC04() {
			Reporter.log("hi4", true);
		}
		@Test(groups = "functional", dependsOnGroups = "smoke")
		public void TC05() {
			Reporter.log("hi5", true);
		}
		@Test(groups = "system", dependsOnGroups = "integration")
		public void TC06() {
			Reporter.log("hi6", true);
		}
		@Test(groups = "integration", dependsOnGroups = "functional")
		public void TC07() {
			Reporter.log("hi7", true);
		}
		@Test(groups = "system", dependsOnGroups = "integration")
		public void TC08() {
			Reporter.log("hi8", true);
		}
}
