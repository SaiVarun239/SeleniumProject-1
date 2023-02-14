package tests;

import org.testng.annotations.Test;

import base.Base;
import pageobjects.LandingPage;
import pageobjects.SignupPage;

public class SignupTest extends Base {
	
	@Test
	public void registrationfields() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		landingpage.clickOnMyAccountDropMenu();
		landingpage.createAccount();
		SignupPage signuppage = new SignupPage(driver);
		signuppage.enterFirstName(prop.getProperty("firstname"));
		signuppage.enterLastName(prop.getProperty("lastname"));
		signuppage.enterEmailAddress(generateNewEmailTimeStamp());
		signuppage.enterPassword(prop.getProperty("password"));
		signuppage.enterPasswordConfirm(prop.getProperty("password"));
		signuppage.enterTelephone(prop.getProperty("telephone"));
		signuppage.CreateAccountcnfButton();
		
	}
	
}
