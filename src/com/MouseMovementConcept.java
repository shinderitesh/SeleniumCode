package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		//create actions class object to interact with mouse
		Actions action = new Actions(driver);
		
		//use build().perform() for mouseover to perfomr action
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Terms & Conditions ']"))).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Track Your Bag']")).click();
	}

}
