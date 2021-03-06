package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PolicyBazarLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/home-v6/index.php");
		
		//click on sigin link
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		//enter mobile number
		driver.findElement(By.xpath("//input[@name='mobNo']")).sendKeys("8329626848");
		//click on password button
		driver.findElement(By.xpath("//span[text()='LOGIN WITH PASSWORD']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);  // 2sec 
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8329626848");
	}

}
