package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class LoginPage extends Utility {

   WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement emailAddressfield;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement passwordfield;
	
	@FindBy(xpath="//button[@type='submit']")
    WebElement loginbutton;
	
	

   public void enterEmailAddress(String emailText) {
	
	   emailAddressfield.sendKeys(emailText);
	
}

   public void enterPassword(String passwordText) {
	
	   passwordfield.sendKeys(passwordText);
 }
   
   public void enterInvalidPassword(String passwordText) {
		
	   passwordfield.sendKeys(passwordText);
 }
   
   public void clickOnLoginButton() {
		
	   loginbutton.click();
	}
}
