package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id ="FullName")
	WebElement FullNameTxt;

	@FindBy(id = "Email")
	WebElement EmailTxt;

	@FindBy(id = "Enquiry")
	WebElement EnquiryTxt;

	@FindBy(name = "send-email")
	WebElement sumittBtn;


	public void fillEnquery 
	(String fullname , String email , String enquery) 
	{
		sendTxtElementTxt(FullNameTxt,fullname);
		sendTxtElementTxt(EmailTxt, email);
		sendTxtElementTxt(EnquiryTxt, enquery);
		clickButton(sumittBtn);
	}
}
