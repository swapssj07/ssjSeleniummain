import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urben21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sofa", Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Weston Half Leather Sofa (Camel Italian Leather)']")).click();
		driver.findElement(By.xpath("//a[@data-gacategory='Sofa_Prod_Page']")).click();
		driver.findElement(By.xpath("//button[@class='button full']")).click();
		System.out.println(driver.getTitle());
	}
}