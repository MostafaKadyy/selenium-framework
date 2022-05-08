package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.CheckoutPage;
import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class UserRegistrationWithDDTAndCsv extends TestBase
{	
	HomePage homeObject;
	UserRegistrationPage registerObject;
	loginPage loginpageObject;
	CheckoutPage checkObject;


	CSVReader reader;


	@Test(priority = 1)
	public void userCanRegisterSucessfully() throws CsvValidationException, IOException
	{

		String csv_File="E:\\mostafa\\.1testing\\tef\\src\\test\\java\\data\\UserData.csv";		
		reader = new CSVReader(new FileReader(csv_File));
		String[] csvCell;

		while((csvCell=reader.readNext()) != null) 
		{		
			String fName = csvCell[0];
			String lName = csvCell[1];
			String email= csvCell[2];
			String companyName = csvCell[3];
			String password = csvCell[4];

			homeObject = new HomePage(driver);
			homeObject.openRegisterPage();
			registerObject = new UserRegistrationPage(driver);
			registerObject.userRegisteration(fName, lName, email, companyName, password);
			registerObject.userLogout();			
		}
	}
}
