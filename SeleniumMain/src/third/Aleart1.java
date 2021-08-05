package third;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Aleart1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	/*	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		*/
		
	/*	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText());
		*/
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("swapnil");
		a.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@id='promptResult']")).getText());
	}
}