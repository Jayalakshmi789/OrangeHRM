package com.NewTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksCountNewtours {

	public static void main(String[] args)
	
	{
      
		String url="http://www.newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		 
         int LinksCount=links.size();
         
         System.out.println("The total No of links onthe Newtours login page are:"+LinksCount);
         
         for(int i=0;i<LinksCount;i++)
         {
        	 String LinkName=links.get(i).getText();
        	 
        	 System.out.println(i+" "+LinkName);
         }
         
         driver.quit();

	}

}
