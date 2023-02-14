package tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Base;


public class BrokenLinkCheckTest extends Base {

	@Test
	public void BrokenLinkTest() {
		 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are = " + links.size());

		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			verifyLinks(url);
		}

		driver.quit();
	}

	public static void verifyLinks(String linkUrl) {

		try {
			URL link = new URL(linkUrl);
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.setConnectTimeout(5000);
			httpConn.connect();

			if (httpConn.getResponseCode() >= 404) {
				System.out.println(linkUrl + " - " + httpConn.getResponseMessage() + " is broken link");
			} else {
				System.out.println(linkUrl + " - " + httpConn.getResponseMessage());
			}
		}

		catch (Exception e) {

		}
	}

}
