package third;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrennShot2 {
	
	public static void take(Object driver,String name) throws IOException{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File sss=new File("./ScreenShot/" +name+ ".png");
		Files.copy(ss, sss);

	}	
/*	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		take(driver, null);
		
	}*/
	}
