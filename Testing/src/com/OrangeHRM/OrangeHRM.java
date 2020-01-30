package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) 
	
	{
		String url="https://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		
		password.sendKeys("admin123");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement login=driver.findElement(By.name("Submit"));
		
		login.click();
		
		String expected_OrangeHRMTitle="OrangeHRM";
		
		System.out.println("The Expected title of the OrangeHRM is :"+expected_OrangeHRMTitle);
		
		String actual_OrangeHRMTitle=driver.getTitle();
		
		System.out.println("The Actual Title of the OrangeHRM is:"+actual_OrangeHRMTitle);
		
		if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
		{
			System.out.println("YES-Both are Matched");
		}
		
		else
		{
			System.out.println("No-Both are Not Matched");
		}
		
		driver.quit();

	}

}
