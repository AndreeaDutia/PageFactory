package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.utils.SeleniumWrappers;

public class OrderPage extends SeleniumWrappers{

	public OrderPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Rold Gold Tiny Twists ']")
	public WebElement SearchPretzelLink;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement AddToCartBtn;
	
	@FindBy(xpath = "//div[contains(@class, 'woocommerce-message') and @role='alert']")
	public WebElement cartMsg;
	
	@FindBy(xpath = "//i[@class='klbth-icon-shopping-bag']")
	public WebElement CartBtn;
	
	@FindBy(xpath = "//div[@class='quantity-button plus']")
	public WebElement QuantityBtn;
	
	
	
}
