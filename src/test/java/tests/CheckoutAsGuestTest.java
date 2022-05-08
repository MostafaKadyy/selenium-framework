package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductdetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class CheckoutAsGuestTest extends TestBase{

	SearchPage searchObject;
	ShoppingCartPage cartobject;
	CheckoutPage checkObject;
	HomePage homeobject;
	String productName="mac";
	ProductdetailsPage productDetailsObject;
	ShoppingCartPage cartObject;

	@Test(priority = 1)
	public void userCanSearchForProduct() 
	{
		searchObject=new SearchPage(driver);
		searchObject.searchForProdutsName(productName);
		searchObject.searchByAutocmplete();
	}

	@Test(dependsOnMethods = "userCanSearchForProduct")
	public void userAddProductToCart() 
	{
		productDetailsObject = new ProductdetailsPage(driver);
		productDetailsObject.addProductToCart();

	}


	@Test(dependsOnMethods = "userAddProductToCart")
	public void openCart() 
	{
		productDetailsObject = new ProductdetailsPage(driver);
		productDetailsObject.openShoppingCartpage();

	}
	@Test(dependsOnMethods = "openCart")
	public void opencheckoutpage() 
	{
		cartobject = new ShoppingCartPage(driver);
		cartobject.accepttermsofservice();
		cartobject.opencheckoutPage();	
	}
	@Test(dependsOnMethods = "opencheckoutpage")
	public void checkAsGuest() 
	{
		cartobject.checkAsGuest();	
	}

	@Test(dependsOnMethods ="checkAsGuest")
	public void fillBillingAddress() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.fillBillingAddress();

	}
	@Test(dependsOnMethods ="fillBillingAddress")
	public void groundShippingMethod() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.groundShippingMethod();
	}

	@Test(dependsOnMethods ="groundShippingMethod")
	public void creditCardPaymentMethod() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.creditCardPaymentMethod();
	}



	@Test(dependsOnMethods ="creditCardPaymentMethod")
	public void PaymentInformation() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.PaymentInformation();
	}

	@Test(dependsOnMethods ="PaymentInformation")
	public void confirmOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.confirmOrder();
	}
	

	@Test(dependsOnMethods ="confirmOrder")
	public void openOrderDetailslink() 
	{
		checkObject.openOrderDetailslink();	
	}
	
	@Test(dependsOnMethods ="openOrderDetailslink")
	public void downloadInvoic()  
	{
		checkObject= new CheckoutPage(driver);
		checkObject.downloadInvoic();
	 
	}
	@Test(dependsOnMethods ="downloadInvoic")
	public void printOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.printOrder();
	}
	
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}
}

