package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.MyaccountPage;
import pages.UserRegistrationPage;

public class UserChangePasswordTest extends TestBase {
	
	HomePage homepageObject;
	MyaccountPage myaccountObject;
	UserRegistrationPage registerObject;
	String oldpassword= "Mostafa1234";
	String newpassword="Mostafa1234";
	String firstName ="mostafa";
	String lastName = "kady";
	String email="kady@wws.com";
	String companyName="hamada";
	CheckoutPage checkObject;
	
	
	@Test(priority = 1)
	public void userCanRegisterSucessfully()
	{
		homepageObject = new HomePage(driver);
		homepageObject.openRegisterPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegisteration(firstName, lastName, email, companyName, oldpassword);	
	}
	
	@Test(dependsOnMethods = "userCanTestSucessfully")
	public void userChangePasswordSucsessfully() 
	{
		homepageObject=new HomePage(driver);
		homepageObject.openMyaccountpage();
		myaccountObject=new MyaccountPage(driver);
		myaccountObject.openChangePasswordpage(oldpassword, newpassword);
		
	}
	@Test(dependsOnMethods = "userChangePasswordSucsessfully")
	public void completeOrder() 
	{
		checkObject= new CheckoutPage(driver);
		checkObject.orderCompeted();
	}
	

}
