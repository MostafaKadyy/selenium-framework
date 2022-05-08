package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.CheckoutPage;
import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class UserRegistrationWithDDTAndExcel extends TestBase
{	
	HomePage homeObject;
	UserRegistrationPage registerObject;
	loginPage loginpageObject;
	CheckoutPage checkObject;

	@DataProvider(name= "ExcelRegisterData")
	public  Object[][] userData() throws IOException
	{
		ExcelReader er = new ExcelReader();
		return er.getExcelData();
	}

	@Test(dataProvider ="ExcelRegisterData", alwaysRun = true)
	public void userCanRegisterSucessfully(String fName,String lName,String email ,String companyName,String password)
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegisteration(fName, lName, email, companyName, password);
		registerObject.userLogout();
	}
}
