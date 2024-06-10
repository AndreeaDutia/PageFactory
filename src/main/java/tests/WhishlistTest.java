package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import pages.MenuPage;
import pages.MyAccountPage;
import selenium.utils.BaseTest;

public class WhishlistTest extends BaseTest{
	String user = PropertiesFileProcessor.readPropertiesFile("user", "login.properties");
	String pass = PropertiesFileProcessor.readPropertiesFile("pass", "login.properties");

	
	@Test(priority =1)
	public void validLoginTest() {
		
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.myAccountLink);
		
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.loginInApp(user, pass);
	
		assertTrue(myAccountPage.myAccountContent.isDisplayed());
		
		
	}
	
	@Test(priority=2)
	public void FirstProductTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.CategoriesLink);
	}
}
