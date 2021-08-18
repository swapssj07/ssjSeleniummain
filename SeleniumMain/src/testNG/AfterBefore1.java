package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterBefore1 {
	WebDriver driver;
	
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Beforemethod", true);
}
	@AfterMethod
	public void close() {
		driver.close();
		Reporter.log("Aftermethod", true);
	}
	
	@Test
	public void tc1() {
		WebElement ele= driver.findElement(By.name("q"));
		ele.sendKeys("java", Keys.ENTER);
		Reporter.log("hello1", true);
	}
	
	@Test
	public void tc2() {
		WebElement ele= driver.findElement(By.name("q"));
		ele.sendKeys("selenium", Keys.ENTER);
		Reporter.log("hello2", true);
	}
}