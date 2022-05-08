package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;

public class hoverMenuTset extends TestBase {
	HomePage homeobject;
	CheckoutPage checkObject;
	
	
	@Test
	public void userOpennootbookspage() 
	{
		homeobject = new HomePage(driver);
		homeobject.openNootbooksPage();
		

//		assertTrue(driver.getCurrentUrl()=="https://demo.nopcommerce.com/notebooks");
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}
}
