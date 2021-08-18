package testNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
	
	@Test
	public void tc() {
		String act = "ABC";
		String exp = "ABC";
		Assert.assertEquals(act, exp);
		Reporter.log("Matched", true);
		List<Object> lst1 = new ArrayList<>();
		lst1.add("ABC");
		lst1.add(123);
		lst1.add(true);
		lst1.add(55.6);
		List<Object> lst2 = new ArrayList<>();
		lst2.add("ABC");
		lst2.add(123);
		lst2.add(true);
		lst2.add(55.6);
		Assert.assertEquals(lst1, lst2);
		Reporter.log("matched2", true);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("ABC", "abc");
		Reporter.log("matched SA", true);
		sa.assertAll();
	}
}
