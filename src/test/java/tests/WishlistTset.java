package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductdetailsPage;
import pages.SearchPage;
import pages.WishlistPage;

public class WishlistTset extends TestBase{

	SearchPage searchObject ;
	ProductdetailsPage ProductdetailObject ;
	HomePage homeobject;
	WishlistPage wishlistobject;
	CheckoutPage checkObject;

	@Test(priority = 1)
	public void searchForproduct() 
	{
		searchObject = new SearchPage(driver);
		searchObject.searchForProdutsName("mac");
		searchObject.searchByAutocmplete();
	}

	@Test(dependsOnMethods = "searchForproduct")
	public void addItemToWishist() 
	{
		ProductdetailObject = new ProductdetailsPage(driver);
		ProductdetailObject.addToWishlist();
	}
	@Test(dependsOnMethods = "addItemToWishist")
	public void openwishlistPage() 
	{
		homeobject= new HomePage(driver);
		homeobject.openWishlistpage();
	}
	@Test(dependsOnMethods = "openwishlistPage")
	public void removeItemFromWishlist() 
	{
		wishlistobject = new WishlistPage(driver);
		wishlistobject.removeItem();
		
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}

}
