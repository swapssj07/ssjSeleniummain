package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GjavaSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		
		List<WebElement> menues = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		for (WebElement menuName : menues) {
			System.out.println(menuName.getText());
			Thread.sleep(2000);
			}
		driver.findElement(By.xpath("//b[text()='script']")).click();
}
}
	