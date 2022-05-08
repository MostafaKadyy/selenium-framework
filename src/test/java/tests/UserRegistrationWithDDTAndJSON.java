package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.CheckoutPage;
import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class UserRegistrationWithDDTAndJSON extends TestBase
{	
	HomePage homeObject;
	UserRegistrationPage registerObject;
	loginPage loginpageObject;
	CheckoutPage checkObject;



	@Test(priority = 1)
	public void userCanRegisterSucessfully() throws FileNotFoundException, IOException, ParseException
	{
		JsonReader reader = new JsonReader();
		reader.jsonReader();
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegisteration(reader.firstName, reader.lastName, reader.email, reader.comanyName, reader.password);
		registerObject.userLogout();
	}
}
