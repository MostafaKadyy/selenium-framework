package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.ComparisonPage;
import pages.ProductdetailsPage;
import pages.SearchPage;

public class ComparisonTest extends TestBase {

	SearchPage searchObject ;
	ProductdetailsPage ProductdetailsObject ;
	String productName1 ="mac"; 
	String productName2 ="asus"; 
	ComparisonPage comparisonobject ;
	CheckoutPage checkObject;

	@Test(priority = 1)
	public void usercanAddFirstItemToproduct() throws InterruptedException 
	{
		searchObject = new SearchPage(driver);
		ProductdetailsObject=new ProductdetailsPage(driver);
		searchObject.searchForProdutsName(productName1);
		searchObject.searchByAutocmplete();
		Thread.sleep(2000);
		ProductdetailsObject.addItemToCompare();
		Thread.sleep(2000);
		
		

	}
	@Test(dependsOnMethods ="usercanAddFirstItemToproduct"  , enabled = true)
	public void usercanAddSecondItemToproduct() throws InterruptedException 
	{
		searchObject.searchForProdutsName(productName2);
		searchObject.searchByAutocmplete();
		Thread.sleep(2000);
		ProductdetailsObject.addItemToCompare();
		Thread.sleep(2000);
		

	}
	@Test(priority = 3)
	public void removeCoparisonProducts() 
	{
		comparisonobject=new ComparisonPage(driver);
		ProductdetailsObject.opncomparisonPage();
		comparisonobject.removeComparisonLis();
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}


}
