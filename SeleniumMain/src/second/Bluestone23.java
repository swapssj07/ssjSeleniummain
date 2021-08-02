package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone23 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
			Thread.sleep(2000);
			List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
			Actions a=new Actions(driver); 
			for (WebElement menuName : menues) {
				System.out.println(menuName.getText());
				a.moveToElement(menuName).build().perform();
				Thread.sleep(1000);
}
}
}