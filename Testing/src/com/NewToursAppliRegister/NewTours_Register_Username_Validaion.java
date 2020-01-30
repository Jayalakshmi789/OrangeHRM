package com.NewToursAppliRegister;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_Register_Username_Validaion extends BaseTest

{
     @Test(priority=1)
     
     public void register_Data() 
     {
    	WebElement register_link= driver.findElement(By.linkText("REGISTER"));
    	
    	register_link.click();
     }
     
     @Test(priority=2)
     public void userRegistration() throws IOException
     {
    	
    	FileInputStream file=new FileInputStream(".//src//com//ExcelDataFiles//RegisterDataofNewTours.xlsx");
    	
    	XSSFWorkbook workbook=new XSSFWorkbook(file);
    	
    	XSSFSheet sheet=workbook.getSheet("Sheet1");
    	
    	int rowsCount=sheet.getLastRowNum();
    	
    	for(int i=1;i<=rowsCount;i++)
    	{
    	
    	Row row=sheet.getRow(i);
    	
    	WebElement firstName=driver.findElement(By.name("firstName"));
    	
    	firstName.clear();
    	
    	firstName.sendKeys(row.getCell(0).getStringCellValue());
    	
    	WebElement lastName=driver.findElement(By.name("lastName"));
    	
    	lastName.clear();
    	
    	lastName.sendKeys(row.getCell(1).getStringCellValue());
    	
    	 double data= row.getCell(2).getNumericCellValue();
         
         long x=(long)data;
      
         String phoneNumber= Long.toString(x);
    	
    	WebElement phone=driver.findElement(By.name("phone"));
    	
    	phone.clear();
    	
         phone.sendKeys(phoneNumber);
    	
    	WebElement email=driver.findElement(By.id("userName"));
    	
    	email.clear();
    	
    	email.sendKeys(row.getCell(3).getStringCellValue());
    	
    	WebElement address1=driver.findElement(By.name("address1"));
    	
    	address1.clear();
    	
    	address1.sendKeys(row.getCell(4).getStringCellValue());
    	
    	WebElement city=driver.findElement(By.name("city"));
    	
    	city.clear();
    	
    	city.sendKeys(row.getCell(5).getStringCellValue());
    	
    	WebElement state=driver.findElement(By.name("state"));
    	
    	state.clear();
    	
    	state.sendKeys(row.getCell(6).getStringCellValue());
    	
    	double pcode= row.getCell(7).getNumericCellValue();
    	 
    	 long y=(long)pcode;
         
         String postalcode=Long.toString(y);
    	
    	WebElement postalCode=driver.findElement(By.name("postalCode"));
    	
    	postalCode.clear();
    	
          postalCode.sendKeys(postalcode);
    	
    	
    	WebElement country=driver.findElement(By.name("country"));
    	
    	//country.clear();
    	
    	country.sendKeys(row.getCell(8).getStringCellValue());
    	
    	WebElement userName=driver.findElement(By.id("email"));
    	
    	userName.clear();
    	
    	userName.sendKeys(row.getCell(9).getStringCellValue());
    	
    	WebElement password=driver.findElement(By.name("password"));
    	
    	password.clear();
    	
    	password.sendKeys(row.getCell(10).getStringCellValue());
    	
    	WebElement confirmPassword=driver.findElement(By.name("confirmPassword"));
    	
    	confirmPassword.clear();
    	
    	confirmPassword.sendKeys(row.getCell(11).getStringCellValue());
    	
    	WebElement submit=driver.findElement(By.name("register"));
    	
    	submit.click();
    	
         String Expected_UserName=row.getCell(9).getStringCellValue();
    	
    	System.out.println(Expected_UserName);
    	
    	String actual_WebPage_UserName=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
    	
    	System.out.println("the Actual UserName :"+actual_WebPage_UserName);
    	
    	if(actual_WebPage_UserName.contains(Expected_UserName))
    	{
    		System.out.println("Registration Sucess - PASS");
    		
    		Cell cell12=row.createCell(12);
    		
    		cell12.setCellValue("Registration Sucess - PASS");
    	}
    	
    	else
    	{
    		System.out.println("Registration Fail - FAIL");
    		
    		Cell cell12=row.createCell(12);
    		
    		cell12.setCellValue("Registration Fail - FAIL");
    	}
    	
    	driver.navigate().back();
    	
    	FileOutputStream file1=new FileOutputStream(".//src//com//ExcelDataFiles//RegisterDataofNewTours.xlsx");
    	
    	workbook.write(file1);
     }
    	
     }
}
