package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class BottomlinksPage extends Utility{

WebDriver driver;
	
	public BottomlinksPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
   }
	
	@FindBy(linkText="Trade-In Program")
	WebElement TradeInProgram;
	
	@FindBy(linkText="Advertise with Us")
	WebElement Advertisewithus;
	
	@FindBy(linkText="Product Recalls")
	WebElement Productrecalls;
	
	@FindBy(linkText="Affiliate Program")
	WebElement AffiliateProgram;
	
	@FindBy(linkText="Discover & Learn")
	WebElement DiscoverandLearn;
	
    public boolean verifythedisplayofTradeInProgram() {
		
    	return TradeInProgram.isDisplayed();
	}
	
    public boolean verifythedisplayofAdvertisewithus() {
		
    	return Advertisewithus.isDisplayed();
	}
    
    public boolean verifythedisplayofProductrecalls() {
		
    	return Productrecalls.isDisplayed();
	}
    
    public boolean verifythedisplayofAffiliateprogram() {
		
    	return AffiliateProgram.isDisplayed();
	}
    
    public boolean verifythedisplayofDiscoverAndLearn() {
		
    	return DiscoverandLearn.isDisplayed();
	} 
}

