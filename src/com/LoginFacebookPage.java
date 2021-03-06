package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginFacebookPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//import chrome driver from path
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
	
		//choose browser or open browser
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.facebook.com/");
		
		//enter a email address or mobile number
		driver.findElement(By.id("email")).sendKeys("shinderitesh@gmail.com");
	
		//enter password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("shinderitesh@");
		
		//click on login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//catch invalid credential text of user
		String text = driver.findElement(By.className("_9ay7")).getText();
		System.out.println("Error message : " +text);
	}

}
