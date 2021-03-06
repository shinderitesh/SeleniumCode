package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		//click on sigin link
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(5000);
		
		//click on sigin button to handle Error
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(5000);
		
		//To handle ALert 
		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		System.out.println(alert.getText());
		alert.accept(); //click on OK button
		
	//	alert.dismiss(); //click on CANCEL button
		
		//to handle the validation/verification
		if(message.equals("Please enter a valid user name"))
		{
			System.out.println("Correct alert message");
		}
		else
		{
			System.out.println("Incorrect alert message");
		}
		
	}

}
