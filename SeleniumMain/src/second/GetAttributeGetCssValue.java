package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetAttributeGetCssValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		System.out.println(droppable.getCssValue("background-color"));
		Actions a= new Actions(driver);
		a.dragAndDrop(draggable, droppable).perform();
		Thread.sleep(2000);
		System.out.println(droppable.getText());
		System.out.println(droppable.getCssValue("background-color"));
		System.out.println(droppable.getCssValue("border"));
		System.out.println(droppable.getCssValue("font"));
}
}

