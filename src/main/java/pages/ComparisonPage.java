package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonPage extends PageBase
{

	public ComparisonPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a.clear-list")
	WebElement CleaListBtn;
	
	@FindBy(tagName = "tr")
	List<WebElement> allRows;
	
	@FindBy(tagName = "td")
	List<WebElement> allColumn;
	
	
	public void printNoOfRowsAndColumn() 
	{
		System.out.println("no of rows: "+allRows.size());
		System.out.println("no of column: "+allColumn.size());
	}
	
	public void removeComparisonLis() 
	{
		clickButton(CleaListBtn);
	}
	public void comparaProducts() 	
	{
		for(WebElement row:allRows) {
			System.out.println(row.getText()+"/t");
			for(WebElement col : allColumn) {
				System.out.println(col.getText()+"/t");
			}
		}
	}
}

