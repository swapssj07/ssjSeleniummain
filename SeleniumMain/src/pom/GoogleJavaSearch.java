package pom;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleJavaSearch {
		@FindBy(name ="q")
		private WebElement search;
		
		@FindBy(xpath = "//a[@id='pnnext']/span[text()='Next']")
		private WebElement next;
		
		public GoogleJavaSearch(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void sendText(String text)
		{
			search.sendKeys(text,Keys.ENTER);
		}
		
		public void scroll(WebDriver driver)
		{
			JavascriptExecutor j =(JavascriptExecutor) driver;
			j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		}
		public void nextClick(WebDriver driver)
		{
			int count=1;
			while(count<11)
			{
				scroll(driver);
				if(next.isDisplayed())
				{
					next.click();
					count++;
				}
			}
		}
		
}
