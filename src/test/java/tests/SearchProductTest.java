package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.ProductdetailsPage;
import pages.SearchPage;

public class SearchProductTest extends TestBase {
	
	SearchPage searchObject ;
	ProductdetailsPage ProductdetailsObject ;
	String productName ="Apple MacBook Pro 13-inch"; 
	CheckoutPage checkObject;
	
	@Test
	public void userCanSearchForProduct() 
	{
		searchObject = new SearchPage(driver);
		ProductdetailsObject = new ProductdetailsPage(driver);
		searchObject.searchForProdutsName(productName);
		searchObject.submitSearchForProduct();
		searchObject.openProductBycliclkOnTilte();
		assertEquals(ProductdetailsObject.productNamebraedcrumb.getText(),productName);	

		
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}
	
}
