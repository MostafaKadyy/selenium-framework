package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		builder = new Actions(driver);
		
		
	}

	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement registerLink ;

	@FindBy(linkText = "Log in")
	WebElement loginLink;

	@FindBy(linkText = "My account")
	WebElement myAccountlink;

	@FindBy(linkText = "Contact us")
	WebElement contactUslink;
	
	@FindBy(linkText = "Jewelry")
	WebElement JewelryLInk;
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement hoverMenu;
	
	@FindBy(linkText = "Notebooks")
	WebElement NotebooksLink;
	
	@FindBy(css = "span.wishlist-label")
	WebElement wishlistLink;
	

	public void openRegisterPage() 
	{
		clickButton(registerLink);
	}

	public void openLoginPage() 
	{
		clickButton(loginLink);
	}

	public void openMyaccountpage() 
	{
		clickButton(myAccountlink);
	}
	
	public void scrolldown () 
	{
		scrollToButton();
	}

	public void openContactUsPage() 
	{
		clickButton(contactUslink);
	}
	
	public void openJewelryLInk() 
	{
		clickButton(JewelryLInk);
	}
	public void openNootbooksPage() 
	{
	
		builder.moveToElement(hoverMenu).build().perform();
		builder.moveToElement(NotebooksLink).click().build().perform();
	}
	public void openWishlistpage() 
	{
		clickButton(wishlistLink);
	}


}
