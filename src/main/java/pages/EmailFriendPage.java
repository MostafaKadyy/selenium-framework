package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage extends PageBase {

	public EmailFriendPage(WebDriver driver) {
		super(driver);
	}

		@FindBy(css = "button.button-2.email-a-friend-button")
		WebElement emailFriendLink ;
		
		@FindBy(id = "FriendEmail")
		WebElement FriendEmailTxt ;
		
		@FindBy(id = "PersonalMessage")
		WebElement PersonalMessageTxt;
		
		@FindBy(name = "send-email")
		WebElement sendEmailBtn ;
		
		
		public void openEmailFrindPage
		(String fmail , String msg) 
		{
			clickButton(emailFriendLink);
			sendTxtElementTxt(FriendEmailTxt, fmail);
			sendTxtElementTxt(PersonalMessageTxt, msg);
			clickButton(sendEmailBtn);
		}
}
