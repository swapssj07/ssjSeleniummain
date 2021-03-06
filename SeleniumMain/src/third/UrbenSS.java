package third;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbenSS {
	public static void main(String[] args) throws InterruptedException , IOException{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	
		
		List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a=new Actions(driver); 
		for (WebElement menuName : menues) {
			String man = menuName.getText();
			System.out.println(menuName.getText());
			a.moveToElement(menuName).build().perform();
			ScrennShot2.take(driver, man);
			Thread.sleep(1000);
		}
		driver.close();
}
	
}