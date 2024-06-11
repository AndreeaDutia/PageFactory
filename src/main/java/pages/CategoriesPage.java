package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.utils.SeleniumWrappers;

	public class CategoriesPage extends SeleniumWrappers{

		public CategoriesPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//span[text()='ALL CATEGORIES']")			
	public WebElement categories;
	
	@FindBy(xpath = "//i[@class='klbth-icon-apple-juice']")			
	public WebElement fruitsCateg;
	
	@FindBy(xpath = "//a[@title='Fresh Produce Melons Each']")
	public WebElement melon;
	
	@FindBy (xpath = "//div[contains(@class, 'tinv-wraper woocommerce tinv-wishlist tinvwl-shortcode-add-to-cart') and @data-product_id='401']")
	public WebElement whislist1;
	
	@FindBy(xpath = "//a[contains(text(), 'Fresh Produce Melons Each')]")
	public WebElement melonName;
	
	@FindBy(xpath = "//button[contains(@name, 'tinvwl-add-to-cart') and @value='727']")
	public WebElement melonAddCartBtn;
	
	@FindBy(xpath = "//i[@class='klbth-icon-boiled-egg']")			
	public WebElement brekfastCateg;
	
	@FindBy(xpath = "//a[@title='Vital Farms Pasture-Raised Egg Bites Bacon & Cheddar']")
	public WebElement egg;
	
	@FindBy (xpath = "//div[contains(@class, 'tinv-wraper woocommerce tinv-wishlist tinvwl-shortcode-add-to-cart') and @data-product_id='221']")
	public WebElement whislist2;
	
	@FindBy(xpath = "//a[contains(text(), 'Vital Farms Pasture-Raised Egg Bites Bacon & Cheddar')]")
	public WebElement eggName;
	
	@FindBy(xpath = "//button[contains(@name, 'tinvwl-add-to-cart') and @value='731']")
	public WebElement eggAddCartBtn;
	
	
	@FindBy(xpath = "//i[@class='klbth-icon-candy']")			
	public WebElement biscuitsCateg;
	
	@FindBy(xpath = "//a[@title='Shimmer Pastel Almond Blend']")
	public WebElement almond;
	
	@FindBy (xpath = "//div[contains(@class, 'tinv-wraper woocommerce tinv-wishlist tinvwl-shortcode-add-to-cart') and @data-product_id='266']")
	public WebElement whislist3;
	
	@FindBy(xpath = "//a[contains(text(), 'Shimmer Pastel Almond Blend')]")
	public WebElement almondName;
	
	@FindBy(xpath = "//button[contains(@name, 'tinvwl-add-to-cart') and @value='733']")
	public WebElement almondAddCartBtn;
	
	
	@FindBy(xpath = "//i[@class='klbth-icon-cup']")			
	public WebElement beveragesCateg;
	
	@FindBy(xpath = "//a[@title='Zevia Kidz Strawberry Lemonade Zero Calorie Soda']")
	public WebElement lemonade;
	
	@FindBy (xpath = "//div[contains(@class, 'tinv-wraper woocommerce tinv-wishlist tinvwl-shortcode-add-to-cart') and @data-product_id='196']")
	public WebElement whislist4;
	
	@FindBy(xpath = "//a[contains(text(), 'Zevia Kidz Strawberry Lemonade Zero Calorie Soda')]")
	public WebElement lemonadeName;
	
	@FindBy(xpath = "//button[contains(@name, 'tinvwl-add-to-cart') and @value='726']")
	public WebElement lemonadeAddCartBtn;
	
	@FindBy (xpath = "//button[@class='button tinvwl_button_close']")
	public WebElement closeBtn;
	
	@FindBy (xpath = "//a[@href='https://keyfood.ro/wishlist/']")
	public WebElement viewWishlist;
	
	@FindBy (xpath = "//input[@title='Select all for bulk action']")
	public WebElement selectAll;

	@FindBy (xpath = "//option[@value='add_selected']")
	public WebElement addToCart;
	
	@FindBy (xpath = "//button[@value='product_apply']")
	public WebElement applyBtn;
	
	@FindBy(xpath = "//ul[@class='woocommerce-error']")
	public WebElement notAddedToCartMsg;
	
	@FindBy(xpath = "//span[@class='cart-count-icon']")
	public WebElement CartNo;
	

	}

	

	
	