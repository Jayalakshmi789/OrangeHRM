package com.OHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest

{
	@Test(priority=1)
	public void loginPanel_Validation() throws IOException
	{
		String expected_LoginPanelText="LOGIN Panel";
		
		String actual_LoginPanelText=driver.findElement(By.id("logInPanelHeading")).getText();
		
		System.out.println("the actuL login panel text :"+actual_LoginPanelText);
		
		FileInputStream file=new FileInputStream(".//src//com//ApplicationTestData//OHRM_LoginTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		
			if(actual_LoginPanelText.equals(expected_LoginPanelText))
		{
			System.out.println("The Login Panel Text is Matched - PASS");
		
				Row row=sheet.getRow(1);
				
				WebElement userName=driver.findElement(By.id("txtUsername"));
				
				userName.clear();
				
				userName.sendKeys(row.getCell(0).getStringCellValue());
				
				WebElement password=driver.findElement(By.id("txtPassword"));
				
				password.clear();
				
				password.sendKeys(row.getCell(1).getStringCellValue());
				
				WebElement login_Button=driver.findElement(By.id("btnLogin"));
				
				login_Button.click();
				
           row.createCell(2).setCellValue("Login Sucess - Pass");
				
				FileOutputStream file1=new FileOutputStream("./src/com/ApplicationResultData/OHRM_LginTestDataResults.xlsx");
			workbook.write(file1);
			
			}
			else
			{
				System.out.println("This is Not OHRM login page - FAIL");
			}
		}
	
	@Test(priority=2)
	public void AdminPagevalidation()
	{
		if(driver.findElement(By.id("welcome")).getText().contains("Welcome"))
		{
			
		System.out.println("This is Admin page _ PASS");
		 }
		
		else
		{
			System.out.println("This is not Admin page - FAIL");
		}
	}
	
	@Test(priority=3)
	public void AddEmployee() 
	{

	WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		
		WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
		
       Actions act=new Actions(driver);
       
		act.moveToElement(pim).perform();
		
		act.moveToElement(addEmployee).perform();
		
		addEmployee.click();
		
	}
	
	@Test(priority=4)
	public void AddEmployeePagevalidation()
	{
		
		if(driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h1")).getText().equals("Add Employee"))
		{
			System.out.println("This is AddEmployee Page -PASS");
		}
		
		else
		{
			System.out.println("This is not Addemployee Page _ FAIL");
		}
	}
	
	@Test(priority=5)
	public void AddEmployeeDetails() throws IOException
	{
    FileInputStream file=new FileInputStream(".//src//com//ApplicationTestData//OHRM_LoginTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		
		Row row=sheet.getRow(1);
		
		WebElement firstName=driver.findElement(By.id("firstName"));
		
		firstName.sendKeys(row.getCell(3).getStringCellValue());
		
		WebElement middleName=driver.findElement(By.id("middleName"));
		
		middleName.sendKeys(row.getCell(4).getStringCellValue());
		
		WebElement lastName=driver.findElement(By.id("lastName"));
		
		lastName.sendKeys(row.getCell(5).getStringCellValue());
		
		String empId=driver.findElement(By.id("employeeId")).getAttribute("value");
		
		row.createCell(6).setCellValue(empId);
		
		FileOutputStream file1=new FileOutputStream("./src/com/ApplicationResultData/OHRM_LginTestDataResults.xlsx");
		workbook.write(file1);
		
		}
	
}