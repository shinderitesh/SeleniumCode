package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		//choose browser or open browser
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

//open url
driver.get("file:///I:/Testing_Batch/info.html");

Thread.sleep(5000);


 List<WebElement> check_box = driver.findElements(By.name("interest"));
 System.out.println(check_box.size());
 
 System.out.println(check_box.get(0).getAttribute("value"));
 
 System.out.println("Before Click " +check_box.get(0).getAttribute("checked"));

          check_box.get(0).click();
          
 System.out.println("After Click " +check_box.get(0).getAttribute("checked"));        
	}

}
