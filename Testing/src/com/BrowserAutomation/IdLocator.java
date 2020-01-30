package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\UserDownloads\\chromedriver.exe" );
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		//identifierId
		
		driver.findElement(By.id("identifierId")).sendKeys("jayaramisetty17@gmail.com");
		
		driver.findElement(By.className("CwaK9")).click();
		
		
		
	}

}
