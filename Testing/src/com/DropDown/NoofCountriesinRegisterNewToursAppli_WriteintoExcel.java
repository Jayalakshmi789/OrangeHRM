package com.DropDown;

import java.io.FileInputStream;
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

public class NoofCountriesinRegisterNewToursAppli_WriteintoExcel 

{

	WebDriver driver=null;
	
	String url="http://www.newtours.demoaut.com/";
	
	@BeforeTest
	public void signUp()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void registerLink()
	{
		WebElement register_Link=driver.findElement(By.linkText("REGISTER"));
		
		register_Link.click();
	}
	
	@Test(priority=2)
	public void countryDropDown() throws IOException
	{
		List<WebElement>countries=driver.findElements(By.tagName("option"));
		
		int countriesCount=countries.size();
		
		System.out.println("countries count "+countriesCount);
		

		FileInputStream file=new FileInputStream(".//src//com//ExcelDataFiles//SingleTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		 
		for(int i=0;i<countriesCount;i++)
		{
			String countryName=countries.get(i).getText();
			
			System.out.println(i + "  " +countryName);
			
		Row	row=sheet.createRow(i);
		
		Cell cell=row.createCell(7);
		
		cell.setCellValue(countryName);
		
		FileOutputStream file1=new FileOutputStream(".//src//com//ExcelDataFiles//SingleTestData.xlsx");
		
		workbook.write(file1);
			
		}
		
	}
		
	
	@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
		
		
		}

