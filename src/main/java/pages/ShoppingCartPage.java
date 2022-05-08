package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a.product-name")
	public WebElement produtName;

	@FindBy(css = "span.product-unit-price")
	public WebElement productPrice;

	@FindBy(id = "itemquantity11215")
	public WebElement productQty;

	@FindBy(css = "span.product-subtotal")
	public WebElement totalPrice;

	@FindBy(css = "button.remove-btn")
	WebElement removeProduct;

	@FindBy(css = "div.no-data")
	public WebElement cartIsEmpty;
	
	@FindBy(id = "updatecart")
	public WebElement updateCartBtn;
	
	@FindBy(id = "termsofservice")
	WebElement termsofserviceRadioBtn;
	
	@FindBy(id = "checkout")
	WebElement checkoutBtn;
	
	@FindBy(css  = "button.button-1.checkout-as-guest-button")
	WebElement checkASguestBtn;
	
	
	

	public void addQty(String no) 
	{
		clearElement(productQty);
		sendTxtElementTxt(productQty, no);
	}
	public void updateCart() 
	{
		clickButton(updateCartBtn);
	}

	public void removeProduct() 
	{
		clickButton(removeProduct);
	}
	
	public void accepttermsofservice() 
	{
		clickButton(termsofserviceRadioBtn);
	}
	
	public void opencheckoutPage() 
	{
		clickButton(checkoutBtn);
	}
	public void checkAsGuest() 
	{
		clickButton(checkASguestBtn);
	}


}
