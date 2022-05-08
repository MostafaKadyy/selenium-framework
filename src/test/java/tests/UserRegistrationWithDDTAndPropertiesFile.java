package tests;

import org.testng.annotations.Test;

import data.LoadProperties;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationWithDDTAndPropertiesFile extends TestBase
{	
	HomePage homeObject;
	UserRegistrationPage registerObject;
	String fName = LoadProperties.userdata.getProperty("firstName");
	String lName = LoadProperties.userdata.getProperty("lastName");
	String email = LoadProperties.userdata.getProperty("email");
	String companyName = LoadProperties.userdata.getProperty("companyName");
	String password = LoadProperties.userdata.getProperty("password");


	@Test(priority = 1)
	public void userCanRegisterSucessfully()
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegisteration(fName, lName, email, companyName, password);
		registerObject.userLogout();
	}
}
