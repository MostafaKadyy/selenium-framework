package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.CheckoutPage;
import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class UserRegistrationWithDDTAndFakeData extends TestBase {
	HomePage homeObject;
	UserRegistrationPage registerObject;
	loginPage loginpageObject;
	CheckoutPage checkObject;
	Faker fake = new Faker();
	String fName = fake.name().firstName();
	String lName = fake.name().lastName();
	String email = fake.internet().emailAddress();
	String companyName = fake.company().name();
	String password = fake.number().digits(9).toString();

	@Test(priority = 1)
	public void userCanRegisterSucessfully() {
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegisteration(fName, lName, email, companyName, password);
		System.out.println("user data are : "+fName+"-"+lName+email+"-"+companyName+"-"+password+"-");
		registerObject.userLogout();
	}
}
