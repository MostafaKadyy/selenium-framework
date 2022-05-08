package steps;

import static org.testng.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class UserRegistration extends TestBase {
	HomePage homeObject;
	UserRegistrationPage registerObject;


	
	@Given("the user in the home page")
	public void the_user_in_the_home_page() {
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
	}

	@When("he click on register link")
	public void he_click_on_register_link() {
		assertTrue(driver.getCurrentUrl().contains("register"));
	}

//	@When("	And   he entered  	\"firsName\" , \"lastName\", \"email\", \"companyName\" , \"password\"")
//	public void he_entered_user_data() {
//		registerObject = new UserRegistrationPage(driver);
//		registerObject.userRegisteration("scsc", "scsacs", "scassa@scascc.com", "ssacascx", "5416513aaO");
//
//	}
	
	@When("he entered  	{string} , {string}, {string}, {string} , {string}")
	public void he_entered(String firsName, String lastName, String email, String companyName, String password) {
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegisteration(firsName, lastName, email, companyName, password);
	}

	@Then("the registration page displayed sucsessfully")
	public void the_registration_page_displayed_sucsessfully() {
		registerObject = new UserRegistrationPage(driver);
		registerObject.userLogout();
	}


}
