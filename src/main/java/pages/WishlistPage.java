package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PageBase {

	public WishlistPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(name = "updatecart")
	public WebElement remove;
	
	@FindBy(id = "updatecart")
	WebElement updateWishlistBtn;
	
	public void removeItem() 
	{
		clickButton(remove);
	}
	public void scrolldwn() 
	{
		
	}
	
}
