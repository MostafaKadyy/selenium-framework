package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductdetailsPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

public class ShoppingCartTest extends TestBase
{	
	HomePage homeobject;
	SearchPage searchObject;
	String productName="mac";
	ProductdetailsPage productDetailsObject;
	ShoppingCartPage cartObject;
	CheckoutPage checkObject;


@Test(priority = 1)
public void userCanSearchForProduct() 
{
	searchObject=new SearchPage(driver);
	searchObject.searchForProdutsName(productName);
	searchObject.searchByAutocmplete();
}

@Test(dependsOnMethods = "userCanSearchForProduct")
public void userAddProductToCart() 
{
	productDetailsObject = new ProductdetailsPage(driver);
	productDetailsObject.addProductToCart();
	
}

@Test(dependsOnMethods = "userAddProductToCart")
public void openCart() 
{
	productDetailsObject = new ProductdetailsPage(driver);
	productDetailsObject.openShoppingCartpage();
	
}

@Test(dependsOnMethods = "openCart")
public void checkingProduct() 
{
	cartObject= new ShoppingCartPage(driver);
	assertTrue(cartObject.produtName.getText().contains("Apple"));
	assertTrue(cartObject.productPrice.getText().equals("$1,800.00"));
	assertTrue(cartObject.totalPrice.getText().equals("$3,600.00"));
}

@Test(dependsOnMethods ="checkingProduct" )
public void addQty() 
{
	cartObject= new ShoppingCartPage(driver);
	cartObject.addQty("4");
	cartObject.updateCart();
	assertTrue(cartObject.totalPrice.getText().equals("$7,200.00"));
}
@Test
public void completeOrder() 
{
	checkObject= new CheckoutPage(driver);
	checkObject.orderCompeted();
}





}

