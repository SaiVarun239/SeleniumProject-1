package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class LandingPage extends Utility {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//img[@alt='United States'])[1]")
	WebElement ClickonUnitedStates;
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement Searchbar;

	@FindBy(xpath="//button[@data-lid='hdr_signin']")
	WebElement myAccountdropdown;
	
	@FindBy(xpath="//a[@href='/identity/global/createAccount']")
	WebElement createAccount;
	
	@FindBy(xpath="//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement signinOption;
	
	 public void clickonUnitedStates () {
			
		 ClickonUnitedStates.click(); 
	}
	 
	 public void searchbar(String searchtext) {
			
		 Searchbar.sendKeys(searchtext);
			
		}
		
    public void clickOnMyAccountDropMenu () {
		
    	myAccountdropdown.click();
	}
	
	public void createAccount() {
		
		createAccount.click();
	}
	
    public void SigninOption() {
		
    	signinOption.click();
	}
}
