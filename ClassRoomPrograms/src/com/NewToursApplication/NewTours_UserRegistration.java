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

public class NewTours_UserRegistration extends BaseTest
{
	@Test(priority=1)
	public void register()
	{
		// <a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
	}
	
	@Test(priority=2)
	public void userRegistration() throws IOException
	{
		
		FileInputStream file = new FileInputStream(".//src//com//ApplicationTestDataFiles//NewTours_UserRegistration_TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
		
		Row row=sheet.getRow(i);
		
		WebElement firstName=driver.findElement(By.name("firstName"));
		firstName.clear();
		firstName.sendKeys(row.getCell(0).getStringCellValue());
		
		WebElement lastName=driver.findElement(By.name("lastName"));
		lastName.clear();
		lastName.sendKeys(row.getCell(1).getStringCellValue());
		
		// Type casting
		double d=row.getCell(2).getNumericCellValue();
		long x=(long)d;
		String phoneNumber=Long.toString(x);
		
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
		
		// Type casting
		double p=row.getCell(7).getNumericCellValue();
		long y=(long)p;
		String postalCodeNumber=Long.toString(y);
		
		WebElement postalCode=driver.findElement(By.name("postalCode"));
		postalCode.clear();
		postalCode.sendKeys(postalCodeNumber);
		
		WebElement country=driver.findElement(By.name("country"));
		//country.clear();
		country.sendKeys(row.getCell(8).getStringCellValue());
		
		WebElement userName=driver.findElement(By.name("email"));
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
		
		String expected_UserName=row.getCell(9).getStringCellValue();
		System.out.println("The UserName is : "+expected_UserName);
		
		// Reigsted UserName text element property to validate
		// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b
		
		String actual_RegistedUserElementText=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(" The actual registed UserName Text is : "+actual_RegistedUserElementText);
		
		if(actual_RegistedUserElementText.contains(expected_UserName))
		{
			System.out.println(" User Registed Successfully - PASS");
			row.createCell(12).setCellValue("User Registed Successfully - PASS");
		}
		else
		{
			System.out.println(" User Registration failed - FAIL");
			row.createCell(12).setCellValue("User Registration failed - FAIL");
		}
		
		driver.navigate().back();
		
		FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_UserRegistration_TestResult.xlsx");
		workBook.write(file1);
		
	}
	}
	
	

}
