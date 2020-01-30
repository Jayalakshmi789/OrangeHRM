package com.ExcelOpeartions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		
FileInputStream file = new FileInputStream(".//src//com//ExcelTestDataFiles//MulltipleTestData.xlsx");
	
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	
	// finding the last row number - which is active with a test data
	int rowCount=sheet.getLastRowNum();
	
	for(int i=0;i<=rowCount;i++) // to goto every Active Row
	{
		Row row=sheet.getRow(i); // going to an active Row
		
int cellCount=row.getLastCellNum();//identifying the total number of active cells in the Row

	for(int j=0;j<cellCount;j++) // to goto all the active cell's in the ROW
	{
		Cell cell=row.getCell(j); // to goto every active row of all the active cell's
		String data=cell.getStringCellValue(); // get the value from the row of a cell
		System.out.print(data+" ");
	}
	System.out.println();
		
	}
}

}
