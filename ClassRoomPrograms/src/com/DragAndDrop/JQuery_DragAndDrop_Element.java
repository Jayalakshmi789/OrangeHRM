package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragAndDrop_Element {

	public static void main(String[] args) {
		
		String url="https://jqueryui.com/droppable/";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
		// Identifying the frame of the WebPage in which the element is under Test
// <iframe  class="demo-frame"></iframe>
		
		// Switching into the Frame of the WebPage
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	
		// identifying the element to be dragged
		// id="draggable" - Property of "Drag Me to My Target" Element
		WebElement dragElement=driver.findElement(By.id("draggable"));
		
		// identifying the element where the element should be dropped
// <div id="droppable" class="ui-widget-header ui-droppable">
		WebElement dropElement=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragElement, dropElement).perform();;
		
	}

}
