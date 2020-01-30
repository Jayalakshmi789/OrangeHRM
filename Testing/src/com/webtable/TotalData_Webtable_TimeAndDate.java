package com.webtable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class TotalData_Webtable_TimeAndDate 


{

    WebDriver driver=null;
    
    String url="https://www.timeanddate.com/worldclock/";
    
    @BeforeTest
    public void setUP()
    {
    	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
    	
    	driver=new ChromeDriver();
    	
    	driver.navigate().to(url);
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void AlldataofSingleColumnCityName() throws IOException
    {
    	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]  //first row of first column

	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8] //last row of last column
    	
    	for(int i=1;i<=36;i++)
    	{
    		FileInputStream file=new FileInputStream(".//src//com//ExcelDataFiles//WebTableData.xlsx");
        	
        	XSSFWorkbook workbook=new XSSFWorkbook(file);
        	
        	XSSFSheet sheet=workbook.getSheet("Sheet1");
        	
        	Row row=sheet.createRow(i);
    		
    		for(int j=1;j<=8;j++)
    		
    		{
    	WebElement	cityNames=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
    	
    	String data=cityNames.getText();
    	 
    	System.out.print(data + "    ");
    	
    	Cell cell=row.createCell(j);
    	
    	cell.setCellValue(data);
    	
    	FileOutputStream file1=new FileOutputStream(".//src//com//ExcelDataFiles//WebTableData.xlsx");
    	
    	workbook.write(file1);
    	
    	}
    		
    		System.out.println();
    	}
}
    
    @AfterTest
    public void tearDown()
    {
    	driver.quit();
    }
    
}
