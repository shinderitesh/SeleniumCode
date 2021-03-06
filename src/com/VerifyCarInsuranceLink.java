package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCarInsuranceLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/home-v6/index.php");
		
		
		
		driver.findElement(By.xpath("(//ul[@class='allInsurance']//a)[1]")).click();
		//need to apply javascriptExecutor interface
	}

}
