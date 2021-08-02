package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BRing4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings",Keys.ENTER);
		
		List<WebElement> menues = driver.findElements(By.xpath("//span[@title='Click for More Filters']"));
		Actions a=new Actions(driver); 
		for (WebElement menuName : menues) {
		//	System.out.println(menuName.getText());
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			menuName.click();
			
			List<WebElement> menues2 = driver.findElements(By.xpath("//span[@data-displayname='22k']"));
			Actions a2=new Actions(driver); 
			for (WebElement menuName2 : menues2) {
				System.out.println(menuName2.getText());
				a.moveToElement(menuName2).build().perform();
				Thread.sleep(2000);
}
}
	}
}