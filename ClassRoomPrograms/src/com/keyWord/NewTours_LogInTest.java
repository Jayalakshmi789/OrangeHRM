package com.keyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest {
	
	@Test
	public void logInTest() throws IOException
	{
		
		FileInputStream file = new FileInputStream(".//newTours.properties");
		
		FileInputStream file1 = new FileInputStream(".//src//com//ApplicationTestDataFiles//NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		Properties properties = new Properties();
		properties.load(file);
		
		for(int k=1;k<=rowCount;k++)
		{
			
			Row row=sheet.getRow(k);
			
			WebElement userName=driver.findElement(By.name(properties.getProperty("UserName")));
			userName.clear();
			userName.sendKeys(row.getCell(0).getStringCellValue());
		
		WebElement password=driver.findElement(By.name(properties.getProperty("Password")));
		password.clear();
		password.sendKeys(row.getCell(1).getStringCellValue());
		
		WebElement signIn=driver.findElement(By.name(properties.getProperty("signIn")));
		signIn.click();
		

		String expected_HomePageTitle="Find";
System.out.println("The expected Title of the New Tours Home Page is:"
																+expected_HomePageTitle);
		
		String actual_WebPageTitle=driver.getTitle();
System.out.println(" The actual title of the NewTours WebPage is :"+actual_WebPageTitle );
		
		if(actual_WebPageTitle.contains(expected_HomePageTitle))
		{
			System.out.println(" LogIN Successfull - PASS");
			row.createCell(2).setCellValue("LogIN Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
			row.createCell(2).setCellValue("LogIn Failed - FAIL");
		}
		
		driver.navigate().back();
		
		FileOutputStream file2 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LogInTest_KeyWord.xlsx");
		workBook.write(file2);
		
	}	
		
	}

}
