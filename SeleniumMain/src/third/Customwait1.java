package third;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customwait1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20Laptop/Documents/new2.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait ww= new WebDriverWait(driver, 10);
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.id("iamtextbox")).isDisplayed();
			}
		});
		driver.findElement(By.id("iamtextbox")).sendKeys("swapnil");
}
}