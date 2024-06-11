package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import pages.CategoriesPage;
import pages.MenuPage;
import pages.MyAccountPage;
import pages.OrderPage;
import selenium.utils.BaseTest;

public class PlaceOrderTest extends BaseTest {
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
	public void SearchTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.SearchLink);
		OrderPage orderPage = new OrderPage(driver);
		menuPage.sendKeys(menuPage.SearchLink, "Pretzels");
		orderPage.click(orderPage.SearchPretzelLink);
	}
	
	@Test(priority=3)
	public void AddToCartTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.SearchLink);
		OrderPage orderPage = new OrderPage(driver);
		orderPage.click(orderPage.AddToCartBtn);
		
		assertTrue(orderPage.cartMsg.getText().equals("“Rold Gold Tiny Twists Pretzels” has been added to your cart."));
		
		
	}
	
	@Test(priority=4)
	public void ViewCartTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.SearchLink);
		OrderPage orderPage = new OrderPage(driver);
		orderPage.click(orderPage.CartBtn);
		
	
}
	
	@Test(priority=5)
	public void IncreaseQuantTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.SearchLink);
		OrderPage orderPage = new OrderPage(driver);
		orderPage.click(orderPage.QuantityBtn);
		
	
}
}
