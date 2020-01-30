package com.NewToursApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest
{
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream(".//src//com//ApplicationTestDataFiles//NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			// goes to an active Row
			Row row=sheet.getRow(i);
			
		// <input type="text" name="userName" size="10">
				WebElement userName=driver.findElement(By.name("userName"));
				userName.clear();
				userName.sendKeys(row.getCell(0).getStringCellValue());
				
		  // <input type="password" name="password" size="10">
				WebElement password=driver.findElement(By.name("password"));
				password.clear();
				password.sendKeys(row.getCell(1).getStringCellValue());
				
		 // <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=62569422c1b0d0a5be6140908ed45426" width="58" height="17" alt="Sign-In" border="0">
			WebElement signIn=driver.findElement(By.name("login"));
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
		
FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LogIn_TestResult.xlsx");
				workBook.write(file1);
				
		}	
			
	}
	
}
