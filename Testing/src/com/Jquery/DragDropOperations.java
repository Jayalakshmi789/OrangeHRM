package com.Jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropOperations {

	public static void main(String[] args) throws InterruptedException 
	
	{
		String url="https://jqueryui.com/droppable/";
		
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		 WebElement dragelement=driver.findElement(By.id("draggable"));
		 
		String dragElement_Text=dragelement.getText();
		
		System.out.println(dragElement_Text);
		
	WebElement	dropElement=driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	
	act.dragAndDrop(dragelement, dropElement).perform();
		
		driver.switchTo().defaultContent(); //if don't write this it will check in that frame only
		
		Thread.sleep(1000);
		
		WebElement resizable=driver.findElement(By.linkText("Resizable"));
		
		resizable.click();
		
		System.out.println("The Title of the Resizable Webpage is :"+ driver.getTitle());
		
		driver.quit();

	}

}
