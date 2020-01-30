package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bing_ScreenShot 
{
	
	// Global Declaration
				WebDriver driver = null;
				String url="https://bing.com";
				
				@BeforeTest
				public void setUp()
				{		
					System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
					driver = new ChromeDriver();
					
					driver.navigate().to(url);
					//driver.manage().window().maximize();
			
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				
				@Test(priority=1)
				public void bing_ScreenShot() throws IOException, InterruptedException
				{
					// TakesScreenshot - its an interface 
					// OutputType<T> - its an interface
					//((TakesScreenshot)driver) - Typecasting
					
					Thread.sleep(10000);
					
			File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(bingScreenShot, new File("./ScreenShots/bing1.png"));
											
				}
				
				@AfterTest
				public void tearDown()
				{
					driver.quit();
				}

}
