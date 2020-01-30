package com.JQuery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_GetText_DragMeToMyTarget {

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
		
		// id="draggable" - Property of "Drag Me to My Target" Element
		
		WebElement dragElement=driver.findElement(By.id("draggable"));
		String dragElement_Text=dragElement.getText();
		
		System.out.println(" The text of an Element is  : "+dragElement_Text);
		
//Switching back to the Webpage from the Frame-to interact with other Elements of the WebPage
		driver.switchTo().defaultContent();

		// automating ReSizable Element
		// <a href="https://jqueryui.com/resizable/">Resizable</a>
	WebElement resizable=driver.findElement(By.linkText("Resizable"));
		resizable.click();
	System.out.println(" The title of the Resizable WebPage is : "+driver.getTitle());
		
	}
}
