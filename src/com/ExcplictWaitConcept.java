package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcplictWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies(); 
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("shinderitesh@gmail.com");
			
			//enter password
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("shinderitesh@");
			
			//click on login button
			clickOn(driver,driver.findElement(By.xpath("//button[@name='login']")),20);
			
			//catch invalid credential text of user
			String text = driver.findElement(By.className("_9ay7")).getText();
			System.out.println("Error message : " +text);
	}
	
	//This function is to create an Explicit Wait
	public static void clickOn(WebDriver driver,WebElement locator,int timeout) 
	{
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
