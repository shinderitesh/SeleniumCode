package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ReadExcelData.ExcelDataConfig;

public class LoginFacebook 
{
	WebDriver driver;
	@Test(dataProvider = "loginFacebook")
	public void loginToFacebook(String username,String password)
	{
		
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	
	@DataProvider(name="loginFacebook")
	public Object[][] passData()
	{
		String excelPath = "I:\\JavaProgram\\SeleniumCode\\src\\excelData\\testData.xlsx";
		Object[][] data = new Object[3][2];
		
		ExcelDataConfig excel = new ExcelDataConfig(excelPath,0);
		
		int row = excel.getRowCount();
		for(int i=0;i<row;i++)
		{
			data[i][0] = excel.getData(i,0);
			data[i][1] = excel.getData(i,1);
		}
		/*
		data[0][0] = "admin";
		data[0][1] = "admin123";
		
		data[1][0] = "admin";
		data[1][1] = "admin";
		
		data[2][0] = "admin123";
		data[2][1] = "admin";
		*/
		return data;
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
