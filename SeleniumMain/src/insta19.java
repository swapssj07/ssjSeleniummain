import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta19 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("sunny");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123456789");
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
	}
}
