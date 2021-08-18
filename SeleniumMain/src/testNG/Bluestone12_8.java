package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bluestone12_8 {
		WebDriver driver;
		
		@BeforeMethod
		public void launch() {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
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
			WebElement menues = driver.findElement(By.xpath("//a[@title='Coins']"));
			Actions a=new Actions(driver); 
				a.moveToElement(menues).build().perform();	
				WebElement menues2 =driver.findElement(By.xpath("//span[@data-p='all-jewellery-goldcoins-plain-gold,m']"));
				a.moveToElement(menues2).build().perform();
				WebElement menues3 =driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']"));
				a.moveToElement(menues3).build().perform();
		}
		}
