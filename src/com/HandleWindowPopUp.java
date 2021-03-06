package com;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[text()='Pay Bills']/following::a[1]")).click();
		
		
		Set<String> handler =  driver.getWindowHandles();  //multiple windows
		
		Iterator it = handler.iterator();
		
		String parentWindowId = (String)it.next();   //Parent Window Id
		System.out.println("Title of Parent Window : " +driver.getTitle());
		System.out.println("Parent Window Id : " +parentWindowId);
		System.out.println("Count : " +handler.size());
		
		String childWindowId = (String)it.next();
		System.out.println("Child Window Id : " +childWindowId);
		
		//switch to popup window/tab window
		driver.switchTo().window(childWindowId);
		Thread.sleep(4000);
		System.out.println("Title of Child Window : " +driver.getTitle());
		System.out.println("Count : " +handler.size());
		//close the child window :- popup window/tab window
	    driver.close();
	    //switch to parent window :- main window
	    Thread.sleep(3000);
	    driver.switchTo().window(parentWindowId);
	    
	    System.out.println("Title of Parent Window After closing child window: " +driver.getTitle());
	    
	    
	}

}
