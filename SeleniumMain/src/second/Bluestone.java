package second;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("ring",Keys.ENTER);
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();
		Set<String> tabs=driver.getWindowHandles();
		for(String tab :tabs) {
			driver.switchTo().window(tab);
		}
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		WebElement msg= driver.findElement(By.xpath("//div[@class='formErrorContent\']"));
		System.out.println( ( msg.getText()));
}
}