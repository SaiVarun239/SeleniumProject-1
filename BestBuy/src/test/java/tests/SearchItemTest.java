package tests;

import org.testng.annotations.Test;

import base.Base;
import pageobjects.LandingPage;
import pageobjects.SearchItemPage;

public class SearchItemTest extends Base{

	@Test
	public void SearchandAdd() {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickonUnitedStates();
		landingpage.searchbar(prop.getProperty("item"));
		SearchItemPage searchitempage = new SearchItemPage(driver);
		searchitempage.clickOnSearchButton();
		searchitempage.clickOnItem();
		searchitempage.clickonAddtoCart();
		searchitempage.clickonGotoCart();
		
	}
}
