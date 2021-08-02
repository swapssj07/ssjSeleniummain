import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook19 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement user =driver.findElement(By.id("email"));
		user.sendKeys("swapnil");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("12345");
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

}
