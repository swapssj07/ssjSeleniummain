package third;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(8000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
	/*	js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-200,0)");
	*/
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(-document.body.scrollHeight,0)");
		
}
}