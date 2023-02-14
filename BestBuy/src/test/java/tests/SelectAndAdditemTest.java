package tests;

import org.testng.annotations.Test;

import base.Base;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.SelectAndAdditemPage;

public class SelectAndAdditemTest extends Base {

  @Test
  public void selectandadditemtest() {
	  
	  LandingPage landingpage = new LandingPage(driver);
	  landingpage.clickonUnitedStates();
	  SelectAndAdditemPage SP = new SelectAndAdditemPage(driver);
	  SP.clickonMenubutton();
	  SP.clickonVideogamesButton();
	  SP.clickonXboxOneButton();
	  SP.clickonXboxOneGameButton();
	  SP.clickonItemButton();
	  SP.clickonAddtoCartButton();
	  SP.clickonGotoCartButton();
	  SP.clickonCheckoutButton();
	  LoginPage login = new LoginPage(driver);
	  login.enterEmailAddress(prop.getProperty("email"));
	  login.enterPassword(prop.getProperty("password"));
	  login.clickOnLoginButton();
	  //SP.clickonContinueasGuestButton();
	  //SP.enterEmailAddress(prop.getProperty("email"));
	  //SP.enterPhoneNumber(prop.getProperty("telephone"));
	  SP.clickonContinueTopaymentButton();
	  SP.enterCardNumber(prop.getProperty("card"));
	  SP.clickonPlaceYourOrderButton();
  }
	
}
