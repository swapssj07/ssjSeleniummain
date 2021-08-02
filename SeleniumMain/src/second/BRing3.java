package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BRing3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings",Keys.ENTER);
		
		List<WebElement> menues = driver.findElements(By.xpath("//section[@id='Metal-form']"));
		Actions a=new Actions(driver); 
		for (WebElement menuName : menues) {
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			
			List<WebElement> menues2 = driver.findElements(By.xpath("//span[@data-displayname='platinum']"));
			Actions a2=new Actions(driver); 
			for (WebElement menuName2 : menues2) {
				System.out.println(menuName2.getText());
				a.moveToElement(menuName2).build().perform();
				Thread.sleep(2000);
				
				
			
}
	
}
	}
}
