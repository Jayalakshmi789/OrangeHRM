package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchOrangeHRMApplication {

	public static void main(String[] args) 
	
	{
		String url="https://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\UserDownloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		//*******************      ID LOCATOR   ************************************
		
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();*/
		
		//*************************** NAME LOCATOR   ******************************
		
		/*driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();*/
		
		//***********************  RELATIVE XPATH   *********************************
		
		/*//*[@id="txtUsername"]
		
		driver.findElementByXPath("//*[@id='txtUsername']").sendKeys("Admin");
		
		//*[@id="txtPassword"]
		
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
		
		//*[@id="btnLogin"]
		
		driver.findElementByXPath("//*[@id='btnLogin']").click();*/
		
		//****************************  ABSOLUTE XPATH  *****************************
		
		///html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input
		
		driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input").sendKeys("Admin");
		
		///html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input
		
		driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input").sendKeys("admin123");
		
		///html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input
		
		driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input").click();
		
		//spanMessage
	}

}
