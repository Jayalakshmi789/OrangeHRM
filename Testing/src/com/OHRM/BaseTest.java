package com.OHRM;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	public class BaseTest 
	{
		
	      WebDriver driver=null;
		
	      String url="http://localhost/orangehrm/symfony/web/index.php/auth/login";
	      
	      
		
		@BeforeTest
		public void setUP()
		{
			System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.navigate().to(url);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		/*@AfterTest
		public void tearDown()
		{
			driver.quit();
		}*/

	}


