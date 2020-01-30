package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployee_OHRM {

	public static void main(String[] args) throws InterruptedException 
	
	{
      
		String url="http://localhost/orangehrm/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to(url);
      
		driver.findElement(By.name("txtUsername")).sendKeys("jaya");
		
	WebElement	password=driver.findElement(By.id("txtPassword"));
	
	password.sendKeys("jaya1234");
	
	WebElement login=driver.findElement(By.id("btnLogin"));
	
	login.click();
	
	WebElement pimModule=driver.findElement(By.id("menu_pim_viewPimModule"));
	
	WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(pimModule).perform();
	
	act.moveToElement(addEmployee).perform();
	
	addEmployee.click();
	
	WebElement firstName=driver.findElement(By.id("firstName"));
	
	firstName.sendKeys("jaya");
	
	String expected_firstName=firstName.getAttribute("value");
	
	System.out.println("First name is:"+expected_firstName);
	
    WebElement middleName=driver.findElement(By.id("middleName"));
	
	middleName.sendKeys("lakshmi");
	
	String expected_middleName=middleName.getAttribute("value");
	
	System.out.println("Middle name is:"+expected_middleName);
	
	WebElement lastName=driver.findElement(By.id("lastName"));
	
	lastName.sendKeys("ramisetty");
	
	String expected_lastName=lastName.getAttribute("value");
	
	System.out.println("Last name is:"+expected_lastName);
	
	Thread.sleep(1000);
	
	WebElement saveButton=driver.findElement(By.id("btnSave"));
	
	saveButton.click();
	
	Thread.sleep(1000);
	
	WebElement personal_DetailsFirstName=driver.findElement(By.id("personal_txtEmpFirstName"));
	
	String actual_firstName= personal_DetailsFirstName.getAttribute("value");
	
	System.out.println("The First name is:"+actual_firstName);
	
    WebElement	personal_DetailsMiddleName=driver.findElement(By.id("personal_txtEmpMiddleName"));

     String actual_middleName=personal_DetailsMiddleName.getAttribute("value");
	
     System.out.println("The Middle Name is:"+actual_middleName);
     
    WebElement personal_DetailsLastName=driver.findElement(By.id("personal_txtEmpLastName"));
    
   String actual_lastName=personal_DetailsLastName.getAttribute("value");
   
   System.out.println("The Last Name is :"+actual_lastName);
   
   if(actual_firstName.equals(expected_firstName))
   {
	   System.out.println("First Name is Matching - PASS");
   }
   
   else
   {
	   System.out.println("Both are not Matching - FAIL");
   }
   
   if(actual_middleName.equals(expected_middleName))
   {
	   System.out.println("Middle Name is Matching - PASS"); 
   }
   
   else
   {
	   System.out.println("Both are not matching - FAIL");
   }
   
   if(actual_lastName.equals(expected_lastName))
   {
	   System.out.println("LastName is Matching - PASS");
   }
   
   else
   {
	   System.out.println("Both are not Matching - FAIL");
   }
   
   WebElement actual_AdminPageText=driver.findElement(By.id("welcome"));
   
   actual_AdminPageText.click();
	
	Thread.sleep(10000);
	
	WebElement logout_Link =driver.findElement(By.linkText("Logout"));
	
	logout_Link.click();
	
	driver.quit();
   
	}

}
