package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.BottomlinksPage;
import pageobjects.LandingPage;

public class BottomlinksTest extends Base {

	@Test(priority=1)
	public void Bottomlink1() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinksPage bottomlink = new BottomlinksPage(driver);
		bottomlink.verifythedisplayofAdvertisewithus();
		Assert.assertTrue(bottomlink.verifythedisplayofAdvertisewithus(), "Advertise with Us");
	}
	
	@Test(priority=2)
	public void Bottomlink2() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinksPage bottomlink = new BottomlinksPage(driver);
		bottomlink.verifythedisplayofAffiliateprogram();
		Assert.assertTrue(bottomlink.verifythedisplayofAffiliateprogram(), "Affiliate Program");
	}
	
	@Test(priority=3)
	public void Bottomlink3() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinksPage bottomlink = new BottomlinksPage(driver);
		bottomlink.verifythedisplayofDiscoverAndLearn();
		Assert.assertTrue(bottomlink.verifythedisplayofDiscoverAndLearn(), "Discover & Learn");
	}
	
	@Test(priority=4)
	public void Bottomlink4() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinksPage bottomlink = new BottomlinksPage(driver);
		bottomlink.verifythedisplayofProductrecalls();
		Assert.assertTrue(bottomlink.verifythedisplayofProductrecalls(), "Product Recalls");
	}
	
	@Test
    public void Bottomlink5() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		BottomlinksPage bottomlink = new BottomlinksPage(driver);
		bottomlink.verifythedisplayofTradeInProgram();
		Assert.assertTrue(bottomlink.verifythedisplayofTradeInProgram(), "Trade-In Program");
	}
}
