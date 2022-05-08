package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.ProductdetailsPage;
import pages.SearchPage;

public class SearchProductByAutocompleteTest extends TestBase {
	
	SearchPage searchObject ;
	ProductdetailsPage ProductdetailsObject ;
	String productName ="MacBook"; 
	CheckoutPage checkObject;
	@Test
	public void searchProductUsingAutoSuggest() 
	{
		try {
			searchObject=new SearchPage(driver);
			searchObject.searchForProdutsName(productName);
			searchObject.searchByAutocmplete();
			ProductdetailsObject = new ProductdetailsPage(driver);
			assertTrue(ProductdetailsObject.productNamebraedcrumb.getText().contains(productName));
			
		} catch (Exception e) {
			System.out.println("error while search for: "+productName+" due to >>"+e.getMessage());
		}		
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}
}
