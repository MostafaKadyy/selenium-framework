package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.loginPage;

public class userLoginTest extends TestBase
{
	HomePage homepageObject;
	loginPage loginpageObject;
	String email = "mocstafa@bb.com" ;
	String password ="1234aa";
	CheckoutPage checkObject;
	
	@Test(priority = 1)
	public void userCanLoginSucesessfully()
	{
		homepageObject = new HomePage(driver);
		homepageObject.openLoginPage();
		loginpageObject =new loginPage(driver);
		loginpageObject.userLogin(email, password);
		
		
	}
	@Test(priority = 2)
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}

}
