package testPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.BlueStone1;

public class TestBlueStone1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		BlueStone1 b=new BlueStone1(driver);
		b.ringHover(driver);
		b.diamondClick();
		b.fRingClick();
		b.switchTab(driver);
		b.buyNowClick();
		
		System.out.println(b.fetchErrT());
}
}