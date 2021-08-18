package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependMethod {
		@Test(dependsOnMethods = "login")
		public void chat() {
			Reporter.log("Hello2", true);
		}
		
		@Test(dependsOnMethods = {"chat", "login"})
		public void logout() {
			Reporter.log("Hello3", true);
		}
		
		@Test
		public void login() {
			Reporter.log("Hello1", true);
		}
}
