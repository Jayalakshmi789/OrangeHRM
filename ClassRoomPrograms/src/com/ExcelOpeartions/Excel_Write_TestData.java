package com.ExcelOpeartions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData {

	public static void main(String[] args) throws IOException {
		
		// identifying the file in the system 		
		FileInputStream file = new FileInputStream
								(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
				
			// identifying the workBook in the file 
				XSSFWorkbook workBook = new XSSFWorkbook(file);
				
			// identifying a particular sheet in the workBook
				XSSFSheet sheet = workBook.getSheet("Sheet1");
				
				Row row=sheet.createRow(2); // creating a Row
				
				Cell cell=row.createCell(3);
				
				cell.setCellValue("LiveTech");
				
				cell.setCellValue("JMeter");
				
				Cell cell4=row.createCell(4);
				cell4.setCellValue("LoadRunner");
						
	FileOutputStream file1 = new FileOutputStream
							(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
				workBook.write(file1);
	}
}
