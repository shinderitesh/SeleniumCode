package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(4000);
		//currently i am on amazon page now i want to move back to rediffmail page
		driver.navigate().back();  //rediffmail
		Thread.sleep(4000);
	
		//now after moving back to rediffmail now i want move forward to amazon page
		driver.navigate().forward(); //amazon
		
		Thread.sleep(4000);
		driver.navigate().back(); //rediffmail page
		
		//refresh the page when the page is stuck
		driver.navigate().refresh();
	}

}
