package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_HomePage_LinksCount_LinksName {

	public static void main(String[] args) {
		

		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
		// Validating LogIn Page
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("password");
		
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		logInButton.click();
		
		String expected_HomePageTitle="OrangeHRM";
		System.out.println(" The expected Title of OrangeHRM HomePage is :"+expected_HomePageTitle);
		
		String actual_WebPageTitle=driver.getTitle();
		System.out.println(" The actual Title of The Webpage is : "+actual_WebPageTitle);
		
		if(actual_WebPageTitle.equals(expected_HomePageTitle))
		{
			System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIN failed - FAIL");
		}
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int homePage_LinksCount=links.size();
		
	System.out.println(" The number of links on the HomePage are : "+homePage_LinksCount);
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed()) // finding only visible Elements and printing
			{
				String linkName=links.get(i).getText();
				System.out.println(linkName);
			}	
		}
		
		driver.quit();
	}
}
