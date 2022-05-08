package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductdetailsPage extends PageBase {

	public ProductdetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "strong.current-item")
	public WebElement productNamebraedcrumb;
	
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[2]")
	WebElement reviewLink ;
	
	@FindBy(id = "add-to-wishlist-button-4")
	WebElement wishlistBtn;
	
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")
	WebElement addToCompareBtn;
	
	@FindBy(linkText = "product comparison")
	WebElement comparisonPage;
	
	@FindBy(id = "add-to-cart-button-4")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
	WebElement cartLink;
	
	
	public void openReviewPage () 
	{
		clickButton(reviewLink);

	}
	public void addToWishlist() 
	{
		clickButton(wishlistBtn);
	}
	public void addItemToCompare() 
	{
		clickButton(addToCompareBtn);
	}
	public void opncomparisonPage() 
	{
		clickButton(comparisonPage);
	}
	public void waitUntiladdFirstItemTocomparison() 
	{
		waitTime(comparisonPage);
	}
	public void addProductToCart() 
	{
		clickButton(addToCartBtn);
	}
	public void openShoppingCartpage() 
	{
		clickButton(cartLink);
	}
	
}
