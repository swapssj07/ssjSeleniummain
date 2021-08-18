package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadExelTwoString2 {
		@Test(dataProviderClass = testNG.ReadExelTwoString.class, dataProvider = "readExcel")
		public void tc(String user, String pass) {
			Reporter.log(user + "  " + pass,true);
		}
}
