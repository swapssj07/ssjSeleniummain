import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class acti21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//b[text()='admin']"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//b[text()='manager']"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(), Keys.ENTER);
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).click();

	}
}