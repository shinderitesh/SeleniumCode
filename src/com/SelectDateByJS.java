package com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectDateByJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
       WebElement date = driver.findElement(By.xpath("//input[@class='ng-tns-c59-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
       //driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']/following::button[@class='ui-datepicker-trigger'][1]")).click();
        String dateVal = "25/02/2021";
        Thread.sleep(4000);
        selectDateByJS(driver,date, dateVal);
       // clickElement(driver,date,dateVal);
	}

	
	//Javascript function of selecting particular date
	
	public static void selectDateByJS(WebDriver driver,WebElement element,String dateVal)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		//click event
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		js.executeScript("arguments[0].click();", element);
	}
	
	  //create javascript function for click event 
	public static void  clickElement(WebDriver driver,WebElement element,String val) {
	  JavascriptExecutor js = ((JavascriptExecutor) driver);
	  js.executeScript("arguments[0].click();", element); }
	 
}
