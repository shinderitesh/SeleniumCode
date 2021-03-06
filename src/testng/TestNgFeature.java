package testng;

import org.testng.annotations.*;

public class TestNgFeature
{
	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("Login test");
		int i = 1/0;  //fail
	}
	
	@Test(priority = 2,dependsOnMethods = "loginTest")
	public void searchProductTest()
	{
		System.out.println("Prodcut is displayed");
	}
	
	@Test(priority = 3,dependsOnMethods = "searchProductTest")
	public void displayProductTest()
	{
		System.out.println("Add product to cart");
		//int i = 1/0;
	}
	
	@Test(priority = 4,dependsOnMethods = "displayProductTest")
	public void addToCartTest()
	{
		System.out.println("Add to cart success");
	}
}
