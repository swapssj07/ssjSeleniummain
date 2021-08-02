import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("swapnil");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@name='login']")).click();
}
}