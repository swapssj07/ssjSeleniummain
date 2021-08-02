package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("q"));
		System.out.println(search.isDisplayed());
		System.out.println(search.isEnabled());
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link :links) {
			System.out.println(link.getText());
		}
}
}