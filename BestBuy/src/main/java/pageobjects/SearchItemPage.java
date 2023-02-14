package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SearchItemPage extends Utility {

	
WebDriver driver;
	
	public SearchItemPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
   }
	@FindBy(xpath="//button[@title='submit search']")
	WebElement searchbutton;
	
	
	@FindBy(xpath="(//a[@href='/site/hot-wheels-9-pack-vehicles-styles-may-vary/6228293.p?skuId=6228293'])[1]")
	WebElement clickonItem;
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART']")
	WebElement AddtoCart;
	
	@FindBy(xpath="//a[contains(text(),'Go to Cart')]")
	WebElement GotoCart;
	
	
    public void clickOnSearchButton () {
		
    	searchbutton.click();
	}
	
    public void clickOnItem () {
		
    	clickonItem.click();
	}
	
    public void clickonAddtoCart () {
		
    	AddtoCart.click();
	}
	
    public void clickonGotoCart () {
		
    	GotoCart.click();
	}
}
