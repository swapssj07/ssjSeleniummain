package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch1 {
		@FindBy(name="q")
		private WebElement search;
		
		public GoogleSearch1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void sentText(String text) {
			search.sendKeys(text, Keys.ENTER);
		}		
}
