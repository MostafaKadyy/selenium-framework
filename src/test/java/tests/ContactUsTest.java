package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{
	
	HomePage homeObject ;
	ContactUsPage contactusObject ; 
	String name ="mostafa elkady";
	String email ="dasd@ssc.com"; 
	String query ="madara uchiha";
	CheckoutPage checkObject;
	
	@Test
	public void userUseContactUsQuery() 
	{
		homeObject= new HomePage(driver);
		contactusObject = new ContactUsPage(driver);
		homeObject.scrolldown();
		homeObject.openContactUsPage();
		contactusObject.fillEnquery(name, email, query);
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}
	}
