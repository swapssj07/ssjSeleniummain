package second;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class USales {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		List<WebElement> menues = driver.findElements(By.xpath("//li[@class='topnav_item saleunit']"));
		Actions a=new Actions(driver); 
		for (WebElement menuName : menues) {
			System.out.println(menuName.getText());
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			List<WebElement> menues2 = driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/descendant::span[text()='Wooden Sofa Sets']"));
			Actions a2=new Actions(driver); 
			for (WebElement menuName2 : menues2) {
				System.out.println(menuName2.getText());
				a.moveToElement(menuName2).build().perform();
				Thread.sleep(2000);
				menuName2.click();
}
}
		driver.findElement(By.xpath("//div[@class='btn-wrap col-md-12']")).click();
		Set<String> tabs=driver.getWindowHandles();
		for(String tab :tabs) {
			driver.switchTo().window(tab);
		}
		driver.findElement(By.xpath("//button[@data-id='77931']")).click();
		driver.findElement(By.xpath("//img[@alt='Urban Ladder - Online furniture store']")).click();
		driver.findElement(By.xpath("//div[@id='cart-badge']")).click();
}
}
