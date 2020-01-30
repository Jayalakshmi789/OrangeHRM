package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebTable extends BaseTest {
	
	@Test
	public void capturingCompleWebTableData()
	{
			// Webtable Property
		// /html/body/div[1]/div[6]/section[1]/div
	
// Identifying the WebTable		
WebElement webTable=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
		
// going to the webTable and finding the number of Rows in it
		 List<WebElement>rows=webTable.findElements(By.tagName("tr"));
		 
		 for(int i=0;i<rows.size();i++) // to goto every Row of the table
		 {
			 // go to every Row and find the number of Columns
			 List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			 
			 for(int j=0;j<cols.size();j++) // to goto every Row of all the columns
			 {
				 String data=cols.get(j).getText();
				 System.out.print(data+"  ");
			 }
			 System.out.println();			 
			 
		 }
		
	}
	
	

}
