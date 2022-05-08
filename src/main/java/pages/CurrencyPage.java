package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrencyPage extends PageBase {

	public CurrencyPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "customerCurrency")
	WebElement currencyList;
	
	public void selectcurrency(String value) 
	{
		selecetByTxtFromList(currencyList, value);
	}

}
