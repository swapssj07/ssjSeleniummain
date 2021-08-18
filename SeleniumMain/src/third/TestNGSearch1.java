package third;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGSearch1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement ele= driver.findElement(By.name("q"));
			ele.sendKeys("java", Keys.ENTER);
			Thread.sleep(2000);
			driver.navigate().back();
			ele.sendKeys("testng",Keys.ENTER);
		}
}
