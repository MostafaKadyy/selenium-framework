package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.JewelryPage;

public class JewelerytSortByTest extends TestBase {
	HomePage homeObject ; 
	JewelryPage jewelryObject;
	String sortionType ="Price: Low to High";
	CheckoutPage checkObject;
	@Test
	public void userChangeSortionSucsessfully() 
	{
		homeObject = new HomePage(driver);
		jewelryObject = new JewelryPage(driver);
		homeObject.openJewelryLInk();
		jewelryObject.selectSorttype(sortionType);
		}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}
	

}
