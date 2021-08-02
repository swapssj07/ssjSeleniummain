package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class facebirth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByValue("5");
		WebElement mon = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(mon);
		s1.selectByVisibleText("Sep");
	//	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	//	Select s2 = new Select(year);
	//	s2.selectByVisibleText("2005");
		 List<WebElement> month=s1.getOptions();
		 for (WebElement val : month) {
			 System.out.println(val.getText());
		}
	}
}
