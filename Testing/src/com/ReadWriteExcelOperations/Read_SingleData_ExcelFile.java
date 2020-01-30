package com.ReadWriteExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_SingleData_ExcelFile {

	public static void main(String[] args) throws IOException
	
	{
		FileInputStream file=new FileInputStream(".//src//com//ExcelDataFiles//SingleTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
	Row	row=sheet.getRow(0);
	
	Cell cell=row.getCell(0);
	
	String data=cell.getStringCellValue();
	
	System.out.println(data);
	}

}
