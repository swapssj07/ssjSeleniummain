package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.GoogleJavaSearch;

public class GooglejavaSearch {
		WebDriver driver;
		
		@BeforeMethod
		public void launch()
		{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test
		public void tc1() throws InterruptedException
		{
			GoogleJavaSearch a=new GoogleJavaSearch(driver);
			a.sendText("java");
			Thread.sleep(2000);
		//	a.scroll(driver);
			a.nextClick(driver);
		}
		
		@AfterMethod
		public void close()
		{
			driver.close();
		}
}


////POM