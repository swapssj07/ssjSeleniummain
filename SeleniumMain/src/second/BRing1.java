package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BRing1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings",Keys.ENTER);
		Thread.sleep(2000);
	//	List<WebElement> menues = driver.findElements(By.xpath("//span[@class='title style-fill i-right']"));
		Actions a=new Actions(driver); 
		//for (WebElement menuName : menues) {
		//	System.out.println(menuName.getText());
		WebElement price=driver.findElement(By.xpath("//span[@class='title style-fill i-right']"));
			a.moveToElement(price).build().perform();
			Thread.sleep(2000);
			
			List<WebElement> menues2 = driver.findElements(By.xpath("//span[@id='pchkbox']"));
			Actions a2=new Actions(driver); 
			for (WebElement menuName2 : menues2) {
			WebElement count=driver.findElement(By.xpath("//span[@id='pchkbox']"));
				System.out.println(count.getText());
				a.moveToElement(menuName2).build().perform();
				Thread.sleep(2000);
				driver.close();
}

	}
}