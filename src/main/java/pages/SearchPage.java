package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {



	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	WebElement searchBar ;

	@FindBy(css = "button.button-1.search-box-button" )
	WebElement searchBtn ;

	@FindBy(css = "h2.product-title")
	WebElement producttitle;

	@FindBy(id = "ui-id-1")
	List<WebElement> searchlist ;

	public void searchForProdutsName(String productName) 
	{
		sendTxtElementTxt(searchBar, productName);

	}
	
	public void submitSearchForProduct() 
	{
		clickButton(searchBtn);
	}
	
	public void openProductBycliclkOnTilte() 
	{
		clickButton(producttitle);	
	}
	
	public void searchByAutocmplete() 
	{
		clickButton(searchlist.get(0));
	}
}
