package com;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class FacebookLoginByHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = new HtmlUnitDriver();  //headless browser
		 
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//calling doLogin() from SeleniumFunction class
		HashMap<String,String> login = SeleniumFunction.doLogin();
		String user1 = login.get("user1");  //shinderitesh@gmail.com:admin123
		String userCred1[] = user1.split(":");
	
		System.out.println("Username " +userCred1[0]);
		System.out.println("Password " +userCred1[0]);
		
		driver.findElement(By.id("email")).sendKeys(userCred1[0]);
	
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(userCred1[1]);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String text = driver.findElement(By.className("_9ay7")).getText();
		System.out.println("Error message : " +text);
	}

}
