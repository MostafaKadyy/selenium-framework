package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "ShipToSameAddress")
	WebElement ShipToSameAddressRadioBtn;

	@FindBy(id = "BillingNewAddress_FirstName")	
	WebElement firstName;

	@FindBy(id = "BillingNewAddress_LastName")
	WebElement lastName;

	@FindBy(id = "BillingNewAddress_Email")
	WebElement email;

	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement country;

	@FindBy(id = "BillingNewAddress_City")
	WebElement city;

	@FindBy(id = "BillingNewAddress_Address1")
	WebElement address1;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement zip;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phoneNumber;

	@FindBy(css = "button.button-1.new-address-next-step-button")
	WebElement contuBtn1;

	@FindBy(css = "button.button-1.shipping-method-next-step-button")
	WebElement contuBtn2;

	@FindBy(id = "paymentmethod_1")
	WebElement creditCardBtn;

	@FindBy(css = "button.button-1.payment-method-next-step-button")
	WebElement contuBtn3;

	@FindBy(id = "CreditCardType")
	WebElement CreditCardType;

	@FindBy(id = "CardholderName")
	WebElement CardholderName;

	@FindBy(id = "CardNumber")
	WebElement CardNumber;

	@FindBy(id = "ExpireMonth")
	WebElement ExpireMonth;

	@FindBy(id = "ExpireYear")
	WebElement ExpireYear;

	@FindBy (id = "CardCode")
	WebElement CardCode;
	
	@FindBy (css = "button.button-1.payment-info-next-step-button")
	WebElement contnu4;
	
	@FindBy (css = "button.button-1.confirm-order-next-step-button")
	WebElement confirmBtn;
	
	@FindBy(tagName = "h1")
	public WebElement h1title;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")
	WebElement orderDetailslink;
	
	@FindBy(css = "a.button-2.pdf-invoice-button")
	WebElement downloadInvoic;
	
	@FindBy(css = "a.button-2.print-order-button")
	WebElement printOrderBtn;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[1]/a/img")
	WebElement orderCompetedBtn;

	public void fillBillingAddress () 
	{
		sendTxtElementTxt(firstName, "mostafa");
		sendTxtElementTxt(lastName, "mostafa");
		sendTxtElementTxt(email, "mostafa@scsc.com");
		selecetByTxtFromList(country,"Japan");
		sendTxtElementTxt(city, "mostafascs");
		sendTxtElementTxt(address1, "tcscscsafascs");
		sendTxtElementTxt(zip, "23266");
		sendTxtElementTxt(phoneNumber, "23263206");
		clickButton(contuBtn1);
	}
	public void groundShippingMethod () 
	{
		clickButton(contuBtn2);
	}
	
	public void creditCardPaymentMethod () 
	{
		clickButton(creditCardBtn);
		clickButton(contuBtn3);
	}
	public void PaymentInformation () 
	{
	selecetByTxtFromList(CreditCardType, "Amex");
	sendTxtElementTxt(CardholderName, "ostafa");
	sendTxtElementTxt(CardNumber, "374245455400126");
	sendTxtElementTxt(ExpireMonth, "01");
	sendTxtElementTxt(ExpireYear, "2024");
	sendTxtElementTxt(CardCode, "2135");
	clickButton(contnu4);
	}
	public void confirmOrder() 
	{
		clickButton(confirmBtn);
	}
	public void openOrderDetailslink() 
	{
		clickButton(orderDetailslink);
	}
	public void printOrder() 
	{
		clickButton(printOrderBtn);
	}
	
	public void downloadInvoic() 
	{
		clickButton(downloadInvoic);
	}
	public void orderCompeted() 
	{
		clickButton(orderCompetedBtn);
	}
	
	
	
	
	


}
