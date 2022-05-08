package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.CurrencyPage;

public class CurrencySelectTest extends TestBase {
	
	CurrencyPage currencyObject ; 
	String currency = "Euro";
	CheckoutPage checkObject;
	
	@Test
	public void UserchangeCurrencySucsessfuly() 
	{
		currencyObject = new CurrencyPage(driver);
		currencyObject.selectcurrency(currency);
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}

}
