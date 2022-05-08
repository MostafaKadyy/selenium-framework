package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	protected WebDriver driver;
	public JavascriptExecutor jse ;
	public Select selecet ;
	public Actions builder ;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	protected static void clickButton (WebElement button)
	{
		button.click();
	}

	protected static void sendTxtElementTxt(WebElement element , String value)
	{
		element.sendKeys(value);
	}
	
	public void scrollToButton() 
	{
		jse.executeScript("scrollBy(0,1000)");
	}
	public void selecetByTxtFromList(WebElement element , String value) 
	{
		selecet = new Select(element);
		selecet.selectByVisibleText(value);
	}
	public void waitTime(WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void clearElement(WebElement element) 
	{	
		element.clear();
	}
	
	



}
