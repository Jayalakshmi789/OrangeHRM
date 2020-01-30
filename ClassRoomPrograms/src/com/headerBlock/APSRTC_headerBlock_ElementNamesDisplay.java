package com.headerBlock;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APSRTC_headerBlock_ElementNamesDisplay {
	

	// Global Declaration
			WebDriver driver = null;
			String url="https://www.apsrtconline.in/oprs-web/";
			
			@BeforeTest
			public void setUp()
			{		
				System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.navigate().to(url);
				driver.manage().window().maximize();
		
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			@Test(priority=1)
			public void headerBlock()
			{
				// identifying the Header Block
				// class="menu-wrap" - header Block property
				WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
				
				// using header Block - identifying the elements in the block
				// the type of the elements in the headerBlock are links
				List<WebElement>headerBlocklinks=headerBlock.findElements(By.tagName("a"));
				
				int headerBlockLinksCount=headerBlocklinks.size();
	System.out.println(" Total number of links in the block are : "+headerBlockLinksCount);
				
				// printing the names of the elements found in the header block
				for(int k=0;k<headerBlockLinksCount;k++)
				{
					String headerLinkName=headerBlocklinks.get(k).getText();
					System.out.println(k+" "+headerLinkName);
				}
				
			}
			
			@AfterTest
			public void tearDown()
			{
				driver.quit();
			}

}
