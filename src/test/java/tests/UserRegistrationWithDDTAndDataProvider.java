package tests;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class UserRegistrationWithDDTAndDataProvider extends TestBase
{	
	HomePage homeObject;
	UserRegistrationPage registerObject;
	loginPage loginpageObject;
	CheckoutPage checkObject;



	@Test(priority = 1,dataProvider ="registerData")
	public void userCanRegisterSucessfully(String fName,String lName,String email ,String companyName,String password)
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegisteration(fName, lName, email, companyName, password);
		registerObject.userLogout();
	}
}
