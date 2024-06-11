package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import pages.CategoriesPage;
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
		
		CategoriesPage categoriesPage = new CategoriesPage(driver);
		categoriesPage.click(categoriesPage.fruitsCateg);
		categoriesPage.click(categoriesPage.melon);
		categoriesPage.click(categoriesPage.whislist1);
		categoriesPage.click(categoriesPage.closeBtn);
	}
	
	@Test(priority=3)
	public void SecondProductTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.CategoriesLink);
		
		CategoriesPage categoriesPage = new CategoriesPage(driver);
		categoriesPage.click(categoriesPage.brekfastCateg);
		categoriesPage.click(categoriesPage.egg);
		categoriesPage.click(categoriesPage.whislist2);
		categoriesPage.click(categoriesPage.closeBtn);
	}
	
	@Test(priority=4)
	public void ThirdProductTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.CategoriesLink);
		
		CategoriesPage categoriesPage = new CategoriesPage(driver);
		categoriesPage.click(categoriesPage.biscuitsCateg);
		categoriesPage.click(categoriesPage.almond);
		categoriesPage.click(categoriesPage.whislist3);
		categoriesPage.click(categoriesPage.closeBtn);
	}
	
	@Test(priority=5)
	public void FourthProductTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.CategoriesLink);
		
		CategoriesPage categoriesPage = new CategoriesPage(driver);
		categoriesPage.click(categoriesPage.beveragesCateg);
		categoriesPage.click(categoriesPage.lemonade);
		categoriesPage.click(categoriesPage.whislist4);
		categoriesPage.click(categoriesPage.closeBtn);
		
	}
	
	@Test(priority=6)
	public void WhishlistTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.CategoriesLink);
		
		CategoriesPage categoriesPage = new CategoriesPage(driver);
		categoriesPage.click(categoriesPage.viewWishlist);
		
		
		assertTrue(categoriesPage.melonName.getText().equals("Fresh Produce Melons Each"));
		//assertTrue(categoriesPage.melonAddCartBtn.getText().equals("Add to Cart"));
		
		assertTrue(categoriesPage.eggName.getText().equals("Vital Farms Pasture-Raised Egg Bites Bacon & Cheddar"));
		//assertTrue(categoriesPage.eggAddCartBtn.getText().equals("Add to Cart"));
	
		assertTrue(categoriesPage.almondName.getText().equals("Shimmer Pastel Almond Blend"));
		//assertTrue(categoriesPage.almondAddCartBtn.getText().equals("Add to Cart"));
		
		assertTrue(categoriesPage.lemonadeName.getText().equals("Zevia Kidz Strawberry Lemonade Zero Calorie Soda"));
		//assertTrue(categoriesPage.lemomadeAddCartBtn.getText().equals("Buy product"));
	
		
	}
	
	@Test(priority=7)
	public void AddToCartTest() {
		MenuPage menuPage =  new MenuPage(driver);
		menuPage.click(menuPage.CategoriesLink);
		
		CategoriesPage categoriesPage = new CategoriesPage(driver);
		categoriesPage.click(categoriesPage.viewWishlist);
		
		categoriesPage.click(categoriesPage.selectAll);
		categoriesPage.click(categoriesPage.addToCart);
		categoriesPage.click(categoriesPage.applyBtn);
				
		assertTrue(categoriesPage.notAddedToCartMsg.isDisplayed());
		assertTrue(categoriesPage.CartNo.getText().equals("3"));		
		
}
}
