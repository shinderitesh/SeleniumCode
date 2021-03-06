package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver1 = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");  //it opens the url
		
		System.out.println("Current Url " +driver.getCurrentUrl());
		System.out.println("Title of Home Page " +driver.getTitle());
		
		
	}

}
