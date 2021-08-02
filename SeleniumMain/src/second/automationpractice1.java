package second;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automationpractice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
		Actions a=new Actions(driver); 
		WebElement prod=driver.findElement(By.xpath("//div[@itemtype='http://schema.org/Product']"));
			a.moveToElement(prod).build().perform();
			driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
			driver.findElement(By.xpath("//span[@title='Close window']")).click(); 
			WebElement cart=driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
				a.moveToElement(cart).build().perform();
			System.out.println(driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']")).getText());
}
}