package third;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiAlert3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']/div[@class='popup_menu_icon']/div[@class='menu_icon']")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='productVersion']")).getText());
		
}
}