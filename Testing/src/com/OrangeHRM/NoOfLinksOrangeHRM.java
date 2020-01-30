package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOrangeHRM {

	public static void main(String[] args)
	
	{

        String url="https://opensource-demo.orangehrmlive.com/";
        
        System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.navigate().to(url);
        
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        
        WebElement password=driver.findElement(By.name("txtPassword"));
		
		password.sendKeys("admin123");
		
        WebElement login=driver.findElement(By.name("Submit"));
		
		login.click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		      
		 int LinksCount=links.size();
		 
		 System.out.println("the count of the links in OrangeHRM is:"+LinksCount);
		 
		 for(int i=0;i<LinksCount;i++)
		 {
			 
			if(links.get(i).isDisplayed())
			{
			 String LinksName=links.get(i).getText();
			 
			 System.out.println(i+" "+LinksName);
			}
		 }
		
		driver.quit();
		 

	}

}
