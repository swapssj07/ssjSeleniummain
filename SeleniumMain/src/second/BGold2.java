package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BGold2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> menues = driver.findElements(By.xpath("//a[@title='Coins']"));
		Actions a=new Actions(driver); 
		for (WebElement menuName : menues) {
			System.out.println(menuName.getText());
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			List<WebElement> menues2 = driver.findElements(By.xpath("//span[@data-p='all-jewellery-goldcoins-plain-gold,m']"));
			Actions a2=new Actions(driver); 
			for (WebElement menuName2 : menues2) {
				System.out.println(menuName2.getText());
				a.moveToElement(menuName2).build().perform();
				Thread.sleep(2000);
				List<WebElement> menues3 = driver.findElements(By.xpath("//span[@data-p='gold-coins-weight-50gms,m']"));
				Actions a3=new Actions(driver); 
				for (WebElement menuName3 : menues3) {
					System.out.println(menuName3.getText());
					a.moveToElement(menuName3).build().perform();
					Thread.sleep(2000);	
					menuName3.click();
		}
			
}
}
}
}