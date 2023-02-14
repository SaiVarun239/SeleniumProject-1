package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SelectAndAdditemPage extends Utility {

	WebDriver driver;
	
	public SelectAndAdditemPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
   }
	
	@FindBy(xpath="//button[@aria-label='Menu']")
	WebElement MenuButton;
	
	@FindBy(xpath="//button[@data-id='node-650']")
	WebElement VideoGamesButton;
	
	@FindBy(xpath="//button[@data-id='node-617']")
	WebElement XboxOne;
	
	@FindBy(linkText="Xbox One Games")
	WebElement XboxOneGames;
	
	@FindBy(linkText="PGA Tour 2K23 Standard Edition - Xbox One")
	WebElement Item;
	
	@FindBy(xpath="//button[@data-sku-id='6517872']")
	WebElement AddToCart;
	
	@FindBy(xpath="//a[contains(text(),'Go to Cart')]")
	WebElement GotoCart;
	
	@FindBy(xpath="//button[@data-track='Checkout - Top']")
	WebElement CheckOut;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement ContinueAsGuest;
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
	WebElement EmailField;
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement PhoneNumberField;
	
	@FindBy(xpath="//span[contains(text(),'Payment')]")
	WebElement ContinueToPayment;
	
	@FindBy(xpath="//input[@id='number']")
	WebElement CardnumberField;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement PlaceYourOrder;
	
	 public void clickonMenubutton () {
			
		 MenuButton.click();
	}
	 
	 public void clickonVideogamesButton () {
			
		 VideoGamesButton.click();
	}
	 
	 public void clickonXboxOneButton () {
			
		 XboxOne.click();
	}
	 
	 public void clickonXboxOneGameButton () {
			
		 XboxOneGames.click();
	}
	 
	 public void clickonItemButton () {
			
		 Item.click();
	}
	 
	 public void clickonAddtoCartButton () {
			
		 AddToCart.click();
	}
	 
	 public void clickonGotoCartButton () {
			
		 GotoCart.click();
	}
	  
	public void clickonCheckoutButton () {
			
		CheckOut.click();
	}
	
    public void clickonContinueasGuestButton () {
		
    	ContinueAsGuest.click();
	} 
    
    public void enterEmailAddress(String emailText) {
    	
    	EmailField.sendKeys(emailText);
 	
   }
    
    public void enterPhoneNumber(String numberText) {
    	
    	PhoneNumberField.sendKeys(numberText);
 	
   }
    
    public void clickonContinueTopaymentButton () {
		
		ContinueToPayment.click();
	} 
	 
    public void enterCardNumber(String card) {
    	
    	CardnumberField.sendKeys(card);
   }
	 
    public void clickonPlaceYourOrderButton () {
		
    	PlaceYourOrder.click();
	} 
	 
}
