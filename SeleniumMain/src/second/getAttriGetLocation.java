package second;





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttriGetLocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("q"));
		System.out.println(search.isDisplayed());
		System.out.println(search.isEnabled());
		System.out.println(search.getAttribute("id"));
		org.openqa.selenium.Point loc = search.getLocation();
		System.out.println(loc.getX() + "   " + loc.getY());
		search.sendKeys("java",Keys.ENTER);
}
}