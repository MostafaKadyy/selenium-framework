package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductdetailsPage;
import pages.ReviewPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class ReviewTest extends TestBase {

	HomePage homeObject;
	UserRegistrationPage registerobject ; 
	SearchPage searchOject ; 
	ReviewPage reviewObject ;
	ProductdetailsPage productDetailsObject ;
	CheckoutPage checkObject;

	@Test(priority = 1)
	public void userCanRegiset() 
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration("mostafa", "kady", "kfssdxasdy@jsjjj.com", "hamada", "1234ss");
	}

	@Test(dependsOnMethods ="userCanRegiset" )
	public void userSearchProduct() 
	{
		searchOject = new SearchPage(driver);
		searchOject.searchForProdutsName("mac");
		searchOject.searchByAutocmplete();
	}
	@Test(dependsOnMethods = "userSearchProduct")
	public void userAddReview() 
	{
		productDetailsObject = new ProductdetailsPage(driver);
		reviewObject = new ReviewPage(driver);
		productDetailsObject.openReviewPage();
		reviewObject.writereview("importance of this product", "this is good at home");
	}
	@Test(dependsOnMethods ="userAddReview" )
	public void userCanLogout() 
	{
		reviewObject = new ReviewPage(driver);
		registerobject.userLogout();
	}
	@Test
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}
}
