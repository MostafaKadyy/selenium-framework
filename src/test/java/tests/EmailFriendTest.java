package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.EmailFriendPage;
import pages.HomePage;
import pages.ProductdetailsPage;
import pages.SearchPage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class EmailFriendTest extends TestBase {
	EmailFriendPage EmailFriendObject ; 
	HomePage homeObject ;
	UserRegistrationPage registerObject ;
	loginPage loginpageObject ;
	SearchPage searchObject ;
	ProductdetailsPage ProductdetailsObject ;
	String firstNme ="mostafa";
	String lastName ="mahmoud";
	String myEmail ="kadssy@mmail.com";
	String companyName ="hamda";
	String password ="1234aa";	
	String productName ="MacBook"; 
	String fmail ="hamada@bbn.com";
	String msg="happy birthday to you motherfucker" ;
	CheckoutPage checkObject;


	@Test (priority = 1)
	public void userCanTestSucessfully()
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegisteration(firstNme, lastName, myEmail, companyName, password);
//		assertTrue(registerObject.sucessmssg.getText().contains("completed"));	
	}

	@Test(dependsOnMethods ="userCanTestSucessfully")
	public void searchProductUsingAutoSuggest() 
	{
		try {
			searchObject=new SearchPage(driver);
			searchObject.searchForProdutsName(productName);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			searchObject.searchByAutocmplete();
			ProductdetailsObject = new ProductdetailsPage(driver);
			assertTrue(ProductdetailsObject.productNamebraedcrumb.getText().contains(productName));

		} catch (Exception e) {
			System.out.println("error while search for: "+productName+" due to >>"+e.getMessage());
		}
	}

	@Test(dependsOnMethods = "searchProductUsingAutoSuggest")
	public void userEmailFriendSucsessfully () 
	{
		EmailFriendObject = new EmailFriendPage(driver);
		EmailFriendObject.openEmailFrindPage(fmail, msg);
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}

}
