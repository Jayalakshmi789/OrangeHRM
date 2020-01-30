package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInPage_LinksTesting {

	public static void main(String[] args) throws InterruptedException {
		

		String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		 //driver = new ChromeDriver();
		driver = new FirefoxDriver();
				
		driver.navigate().to(url);
		
	List<WebElement>links=driver.findElements(By.tagName("a"));

		int linksCount=links.size(); // finding the size of arrayList(links)
		
System.out.println(" The total number of links on the NEwTours LogIn page are : "+linksCount);
		
	for(int i=0;i<linksCount;i++)
		{
			String linkName=links.get(i).getText(); // getting every index value 
			System.out.println(i+"  "+linkName);// printing the name of the link with index
			
			links.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
					
		//	Thread.sleep(10000);
			// Navigating back to the immediate previous WebPage
			driver.navigate().back();
			
			// Re-creating the ArrayList
	// since the driver instance is changed to the next Webpage - the stored info in the
			// arrayList(links) will be cleared - so we need to restore all the values back
			// into the arrayList
			links=driver.findElements(By.tagName("a"));
		}

	driver.quit();
		
		}
}
