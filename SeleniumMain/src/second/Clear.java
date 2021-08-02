package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//b[text()='admin']"));
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("manager");
		Thread.sleep(2000);
		user.clear();
		user.sendKeys(username.getText());
}
}