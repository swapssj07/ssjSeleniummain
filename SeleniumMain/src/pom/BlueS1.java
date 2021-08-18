package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueS1 {
	@FindBy(xpath="//a[@title='Coins']")
	private WebElement coins;
	
	@FindBy(xpath="//span[@data-p='all-jewellery-goldcoins-plain-gold,m']")
	private WebElement plane;
	
	@FindBy(xpath="//span[@data-p='gold-coins-weight-20gms,m']")
	private WebElement twentygm;
	
	
	@FindBy(xpath="//span[@data-p='gold-coins-weight-50gms,m']")
	private WebElement fiftygm;
	
	@FindBy(xpath="//span[@data-p='all-jewellery-goldcoins-lakshmi,m']")
	private WebElement laxmi;
	
	@FindBy(xpath="//span[@data-p='l-gold-coins-weight-2gms,m']")
	private WebElement twogmL;
	
	@FindBy(xpath="//span[@data-p='l-gold-coins-weight-5gms,m']")
	private WebElement fivegmL;
	
	@FindBy(xpath="//span[@data-p='l-gold-coins-weight-10gms,m']")
	private WebElement tengmL;
	
	
	public BlueS1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void coinHover(WebDriver driver) {
		Actions a= new Actions(driver);
		a.moveToElement(coins).perform();
	}
	
	public void planClick(WebDriver driver){
		Actions a1=new Actions(driver);
		a1.moveToElement(plane).perform();
	}
	public void twentyClick() {
		twentygm.click();
	}
	
	public void fiftyClick() {
		fiftygm.click();
	}
	
	public void laxmiClick(WebDriver driver){
		Actions a1=new Actions(driver);
		a1.moveToElement(laxmi).perform();
	}
	
	public void twoClick() {
		twogmL.click();
	}
	
	public void twoLClick() {
		twogmL.click();
	}
	
	public void fiveClick() {
		fivegmL.click();
	}
	
	public void tenClick() {
		tengmL.click();
	}
	
}
