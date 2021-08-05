package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Urban23 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.urbanladder.com/");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
			Thread.sleep(2000);
			List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
			Actions a=new Actions(driver); 
			for (WebElement menuName : menues) {
				System.out.println(menuName.getText());
				a.moveToElement(menuName).build().perform();
				Thread.sleep(1000);
			}
}
}
