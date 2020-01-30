package com.DropDown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Register_Country_DisplayCountryNames {
	
	// Global Declaration
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
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
		public void register()
		{
			// <a href="mercuryregister.php">REGISTER</a>
			WebElement register=driver.findElement(By.linkText("REGISTER"));
			register.click();
		
		}
	
		@Test(priority=2)
		public void countryDropDown() throws IOException
		{
			// Country Element property - name="country"
			
			WebElement countryDropDown=driver.findElement(By.name("country"));
			
			List<WebElement>countries=countryDropDown.findElements(By.tagName("option"));
			
			int countiesCount=countries.size();
			
System.out.println(" The number of countries in the country DropDown are : "+countiesCount);
			
FileInputStream file = new FileInputStream
									(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
					
			for(int a=0;a<countiesCount;a++)
			{
					Row row=sheet.createRow(a);
					Cell cell=row.createCell(0);
				
				String countryName=countries.get(a).getText();
				System.out.println(countryName);
				
				cell.setCellValue(countryName);
				
	FileOutputStream file1 = new FileOutputStream
								(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
				workbook.write(file1);
			}
		
		}
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	
}
