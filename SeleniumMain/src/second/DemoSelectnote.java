package second;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DemoSelectnote {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/My%20Laptop/Documents/DemoSelect2.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("b"));
		Select s=new Select(ele);
		if(s.isMultiple()) {
			s.selectByVisibleText("rosogola");
			s.selectByIndex(3);
		}
		
//------		
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("==========");
		List<WebElement> sopt =s.getAllSelectedOptions();
		for(WebElement opt : sopt) {
			System.out.println(opt.getText());
		}
}
}
