package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmailApplication {

	public static void main(String[] args) 
	
	{
		String url="https://gmail.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		String actual_GmailUrl=driver.getCurrentUrl();
		
		System.out.println(actual_GmailUrl);
		
		//<input type="email" class="whsOnd zHQkBf"  name="identifier" id="identifierId" >
		
		driver.findElement(By.id("identifierId")).sendKeys("jayaramisetty17@gmail.com");
		
		//<span class="RveJvd snByac">Next</span>
		
		driver.findElementByClassName("CwaK9").click();
		
		//<input type="password" class="whsOnd zHQkBf"  name="password" >
		
   // driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("jaya@1994");
		
		////*[@id="password"]/div[1]/div/div[1]/input
		
		driver.findElementByXPath("//*[@id='password']/div[1]/div/div[1]/input").sendKeys("jaya@1994");
		
	}

}
