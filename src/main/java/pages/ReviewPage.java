package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends PageBase {

	public ReviewPage(WebDriver driver) {
		super(driver);
	}



	@FindBy(id = "AddProductReview_Title")
	WebElement reviewTitle ;

	@FindBy(id = "AddProductReview_ReviewText")
	WebElement reviewTxt ;

	@FindBy(id = "addproductrating_1")
	public WebElement rating1 ;

	@FindBy(id = "addproductrating_2")
	public WebElement rating2 ;

	@FindBy(id = "addproductrating_3")
	public WebElement rating3 ;

	@FindBy(id = "addproductrating_4")
	public WebElement rating4 ;

	@FindBy(id = "addproductrating_5")
	public WebElement rating5 ;

	@FindBy(name = "add-review")
	public WebElement submitBtn ; 



	public void writereview (String reviewTtle , String reveiwText ) 
	{
		sendTxtElementTxt(reviewTitle, reviewTtle);
		sendTxtElementTxt(reviewTxt, reveiwText);
		clickButton(rating3);
		clickButton(submitBtn);
	}


}
