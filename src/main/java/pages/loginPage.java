package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageBase {

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "Email")
	WebElement emailTextBox;
	
	@FindBy(id = "Password")
	WebElement PasswordTextBox;
	
	@FindBy(css = "button.button-1.login-button")
	WebElement loginBtn;
	
	@FindBy(linkText = "Log out")
	public WebElement logoutlink;

	public void userLogin (String email , String password) 
	{
		clearElement(emailTextBox);
		sendTxtElementTxt(emailTextBox,email);
		sendTxtElementTxt(PasswordTextBox, password);
		clickButton(loginBtn);
	}
}
