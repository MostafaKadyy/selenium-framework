package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends PageBase{

	public MyaccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText ="Change password")
	WebElement changePasswordLink;
	
	@FindBy(id ="OldPassword")
	WebElement cOldPasswordTextBox;
	
	@FindBy(id ="NewPassword")
	WebElement NewPasswordTextBox;
	
	@FindBy(id ="ConfirmNewPassword")
	WebElement ConfirmNewPasswordTextBox;
	
	@FindBy(xpath  = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
	WebElement changePasswordBtn;
	
	
	
	
	public void openChangePasswordpage(String oldpassword , String newpassword) 
	{
		clickButton(changePasswordLink);
		sendTxtElementTxt(cOldPasswordTextBox, oldpassword);
		sendTxtElementTxt(NewPasswordTextBox, newpassword);
		sendTxtElementTxt(ConfirmNewPasswordTextBox, newpassword);
		clickButton(changePasswordBtn);
	}

	
}
