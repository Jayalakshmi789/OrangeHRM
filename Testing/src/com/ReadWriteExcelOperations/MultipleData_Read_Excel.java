package com.ReadWriteExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleData_Read_Excel {

	public static void main(String[] args) throws IOException 
	
	{
		FileInputStream file=new FileInputStream(".//src//com//ExcelDataFiles//MultipleData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		System.out.println("row count :"+rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
			Row row=sheet.getRow(i);
			
			int cellCount=row.getLastCellNum();
			
			for(int j=0;j<cellCount;j++)
			{
				Cell cell=row.getCell(j);
				
				String data=cell.getStringCellValue();
				
				System.out.print(data+"   ");
			}
			
			System.out.println();
		}
		

	}

}
