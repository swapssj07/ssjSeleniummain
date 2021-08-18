package testNG;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiExcel2 {
	List<Object> a1 = new ArrayList<>();
	List<Object> b1 = new ArrayList<>();
	@Test(dataProviderClass = testNG.ActiExcel.class,dataProvider = "readActi")
	public void tc(String a,String b)
	{
		a1.add(a);
		b1.add(b);
		Reporter.log(a + "   " +b ,true);
	}

	@Test
	public void tc1()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(a1.get(3).toString());
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(b1.get(3).toString());
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
	}
}
