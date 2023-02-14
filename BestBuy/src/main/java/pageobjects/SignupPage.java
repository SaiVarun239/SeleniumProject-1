package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SignupPage extends Utility {

	WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="firstName")
	private WebElement firstnamefield;
	
	@FindBy(id="lastName")
	private WebElement lastnamefield;
	
	@FindBy(id="email")
	private WebElement emailaddressfield;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	private WebElement Passwordfield;
	
	@FindBy(xpath="//input[@name='reenterPassword']")
	WebElement ConfirmPasswordfield;
	
	@FindBy(id="phone")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement CreateAccountcnfButton;
	
    public void enterFirstName(String firstNameText) {
		
    	firstnamefield.sendKeys(firstNameText);
		
	}
    
    public void enterLastName(String lastNameText) {
		
    	lastnamefield.sendKeys(lastNameText);
		
	}
    
    public void enterEmailAddress(String emailAddressText) {
		
    	emailaddressfield.sendKeys(emailAddressText);
		
	}
    
    public void enterPassword(String passwordText) {
		
    	Passwordfield.sendKeys(passwordText);
		
	}
	
	public void enterPasswordConfirm(String passwordText) {
		
		ConfirmPasswordfield.sendKeys(passwordText);
		
	}
    
    public void enterTelephone(String telephoneText) {
		
    	PhoneNumber.sendKeys(telephoneText);
		
	}
    
    public void CreateAccountcnfButton() {
		
		CreateAccountcnfButton.click();
	}
}
