package com.ExcelOpeartions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {

		// identifying the file in the system 		
FileInputStream file = new FileInputStream
								(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
		
	// identifying the workBook in the file 
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
	// identifying a particular sheet in the workBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// Identifying a particular row in the sheet
		Row row=sheet.getRow(0);
		
		// Identifying a particular cell in the Row
		Cell cell=row.getCell(0);
		
		// getting a string value from the row of a cell - printing out
		String data=cell.getStringCellValue();
		System.out.println(data);
	}
}
