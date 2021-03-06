package com;

import java.util.*;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunction 
{
    
	//generic code for Dropdown Month
	public static HashMap<String,String> getMonth()
	{
		HashMap<String,String> month = new HashMap<String,String>();
		month.put("01","Jan");
		month.put("02","Feb");
		month.put("03","Mar");
		month.put("04","Apr");
		month.put("05","May");
		month.put("06","Jun");
		month.put("07","July");

		return month;
	}
	
	public static HashMap<String,String> doLogin()
	{
		HashMap<String,String> login = new HashMap<String,String>();
		
		//login.put("username","password")
		
		login.put("user1","shinderitesh@gmail.com:admin123");
		login.put("user2","rits1379@gmail.com:ritesh123");
		
		return login;
	}
	
	//This function is to create an Explicit Wait
		public static void clickOn(WebDriver driver,WebElement locator,int timeout) 
		{
			new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
			locator.click();
		}
		
		//This function is to create an Explicit Wait
		public static void explicitWait(WebDriver driver,List<WebElement> locator,int timeout) 
		{
			new WebDriverWait(driver, timeout).ignoring(TimeoutException.class).until(ExpectedConditions.visibilityOfAllElements(locator));
			
		}
}
