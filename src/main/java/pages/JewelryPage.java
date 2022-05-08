package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends PageBase {

	public JewelryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "products-orderby")
	WebElement sortByList ;

	public void selectSorttype ( String value) 
	{
		selecetByTxtFromList(sortByList, value);
	}

}
