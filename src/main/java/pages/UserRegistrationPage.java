package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase
{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(id = "gender-male")
	WebElement genderRadioBtnMale;
	
	@FindBy(id = "gender-female")
	WebElement genderRadioBtnFmal;
	
	@FindBy(id = "FirstName")
	WebElement firstNameTextBox;
	
	@FindBy(id = "LastName")
	WebElement lastNameTextBox;
	
	@FindBy(id = "Email")
	WebElement emailTextBox;
	
	@FindBy(id = "Company")
	WebElement CompanyNameTextBox;
	
	@FindBy(id = "Password")
	WebElement PasswordTextBox;
	
	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmPasswordTextBox;
	
	@FindBy(id = "register-button")
	WebElement registerButton;
	

	
	@FindBy(css = "a.button-1.register-continue-button")
	WebElement contBtn ;
	
	@FindBy(linkText="Log out")
	public WebElement logOutBtn;
	
	
	public void userRegisteration
	(String firstName, String lastName ,String email ,String compnyName ,String password)
	{
		clickButton(genderRadioBtnMale);
		sendTxtElementTxt(firstNameTextBox, firstName);
		sendTxtElementTxt(lastNameTextBox, lastName);
		sendTxtElementTxt(CompanyNameTextBox, compnyName);
		sendTxtElementTxt(emailTextBox, email);
		sendTxtElementTxt(PasswordTextBox, password);
		sendTxtElementTxt(ConfirmPasswordTextBox, password);
		clickButton(registerButton);
		clickButton(contBtn);
	}
	
	public void userLogout() 
	{
		clickButton(logOutBtn);
	}
	
	
	

}
