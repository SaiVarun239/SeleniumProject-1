package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.SelectAndAdditemPage;


public class LoginTest extends Base {

	@Test(priority=1)
	public void validlogincredentials() throws IOException {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickonUnitedStates();
		landingPage.clickOnMyAccountDropMenu();
		landingPage.SigninOption();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailAddress(prop.getProperty("email"));
		loginpage.enterPassword(prop.getProperty("password"));
		loginpage.clickOnLoginButton();
	}
	
	@Test(priority=2)
    public void Invalidlogincredentials() throws IOException {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickonUnitedStates();
		landingPage.clickOnMyAccountDropMenu();
		landingPage.SigninOption();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailAddress(prop.getProperty("email"));
		loginpage.enterPassword(prop.getProperty("invalidpassword"));
		loginpage.clickOnLoginButton();
		SelectAndAdditemPage SP = new SelectAndAdditemPage(driver);
		SP.clickonMenubutton();
	}
}
