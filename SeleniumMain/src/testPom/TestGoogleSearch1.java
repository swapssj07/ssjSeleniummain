package testPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.GoogleSearch1;

public class TestGoogleSearch1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		GoogleSearch1 gs =new GoogleSearch1(driver);
		gs.sentText("java");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		gs.sentText("testng");
}
	
}