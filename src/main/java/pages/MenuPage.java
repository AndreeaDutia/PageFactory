package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{

	//public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		//this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public By myAccountLink = By.linkText("My Account")
	 * driver.findElement(myAccountLink)
	 * 
	 */

	@FindBy(linkText = "My account")
	public WebElement myAccountLink;
	
	@FindBy(xpath = "//span[text()='ALL CATEGORIES']")
	public WebElement CategoriesLink;
	
	@FindBy(linkText = "CONTACT")
	public WebElement ContactLink;
	
	@FindBy(xpath = "//input[@id='dgwt-wcas-search-input-1']")
	public WebElement SearchLink;
	
	
	
	
	

}