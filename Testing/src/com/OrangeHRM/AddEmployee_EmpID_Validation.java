package com.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AddEmployee_EmpID_Validation 

{
	WebDriver driver=null;
	
	String url="http://localhost/orangehrm/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void loginPanel_Validation()
	{
		String expected_LoginPanelText="LOGIN Panel";
		
		String actual_LoginPanelText=driver.findElement(By.id("logInPanelHeading")).getText();
		
		System.out.println("the actuL login panel text :"+actual_LoginPanelText);
		
		if(actual_LoginPanelText.equals(expected_LoginPanelText))
		{
			System.out.println("The Login Panel Text is Matched - PASS");
			
			WebElement userName=driver.findElement(By.id("txtUsername"));
			
					userName.sendKeys("jaya");
					
			WebElement password=driver.findElement(By.id("txtPassword"));
			
			password.sendKeys("jaya1234");
			
			WebElement login_Button=driver.findElement(By.id("btnLogin"));
			
			login_Button.click();
			
			}
		else
		{
			System.out.println("The Login Panel Text is Not Matched - FAIL");
		}
	}
	
	@Test(priority=2)
	public void adminPage_validation()
	{
		String expected_AdminPageText="Admin";
		
		String actual_WebpageAdminText=driver.findElement(By.linkText("Welcome Admin")).getText();
		
		System.out.println();
		
		if(actual_WebpageAdminText.contains(expected_AdminPageText))
		{
			System.out.println("Admin Page - PASS");
		}
		else
		{
			System.out.println("Not Admin Page - FAIL");
		}
	}
	
	@Test(priority=3)
	public void pim_AddEmployee() throws InterruptedException
	{
		
	WebElement	pim=driver.findElement(By.id("menu_pim_viewPimModule"));
	
	WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
	
	Thread.sleep(10000);
	
	Actions act=new Actions(driver);
	
	act.moveToElement(pim).perform();
	
	act.moveToElement(addEmployee).perform();
	
	addEmployee.click();
	
	Thread.sleep(1000);
	
	String expected_AddEmployeePageText="Add Employee";
	
	 String actual_Webpage_AddemployeeText=driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h1")).getText();
	 
	 System.out.println("The Actual Addemployee text is :"+actual_Webpage_AddemployeeText);
	 
	 if(actual_Webpage_AddemployeeText.equals(expected_AddEmployeePageText))
	 {
		 
		 System.out.println("This is AddEmployee Page -PASS");
		 
		WebElement addEmployee_FirstName=driver.findElement(By.id("firstName"));
		
		addEmployee_FirstName.sendKeys("Jaya");
		
		String emp_FirstName=addEmployee_FirstName.getAttribute("value");
		
		System.out.println("Firstname "+emp_FirstName);
		
		WebElement addEmployee_MiddleName=driver.findElement(By.id("middleName"));
		
		addEmployee_MiddleName.sendKeys("Lakshmi");
		
		String emp_MiddleName=addEmployee_MiddleName.getAttribute("value");
		
		System.out.println("Middlename "+emp_MiddleName);
		
		WebElement addEmployee_LastName=driver.findElement(By.id("lastName"));
		
		addEmployee_LastName.sendKeys("Ramisetty");
		
		String emp_Lastname=addEmployee_LastName.getAttribute("value");
		
		System.out.println("Lastname :"+emp_Lastname);
		
		WebElement addEmployee_EmpId=driver.findElement(By.id("employeeId"));
		
		String emp_Id=addEmployee_EmpId.getAttribute("value");
		
		System.out.println("empid :"+emp_Id);
		
		Thread.sleep(1000);
		
		WebElement save_Button=driver.findElement(By.id("btnSave"));
		
		save_Button.click();
		
		Thread.sleep(10000);
		
		  String expected_PersonalDetails_Test="Personal Details";
			
			String actual_Webpage_PersonalDetails_Test=driver.findElement(By.xpath("//*[@id='pdMainContainer']/div[1]/h1")).getText();
		
			if(actual_Webpage_PersonalDetails_Test.equals(expected_PersonalDetails_Test))
			{
				Thread.sleep(1000);
				System.out.println("This is Personal Details Page - PASS");
				
				String pesonalDetails_Emp_Firstname=driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value");
				
				System.out.println("Firstname :"+pesonalDetails_Emp_Firstname);
				
				String personalDetails_Emp_MiddleName=driver.findElement(By.id("personal_txtEmpMiddleName")).getAttribute("value");
				
				System.out.println("MiddleName :"+personalDetails_Emp_MiddleName);
				
				String personalDetails_Emp_LastName=driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value");
				
				System.out.println("lastName :"+personalDetails_Emp_LastName);
				
				String personalDetails_Emp_Id=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
				
				System.out.println("empid"+personalDetails_Emp_Id);
				
				if((emp_FirstName.equals(pesonalDetails_Emp_Firstname)&&(emp_MiddleName.equals(personalDetails_Emp_MiddleName)&&(emp_Lastname.equals(personalDetails_Emp_LastName)&&(emp_Id.equals(personalDetails_Emp_Id))))))
				{
					System.out.println("All Names are matching");
				}
				else
				{
					System.out.println("Not matching");
				}
				
			}
	 }
	 else
	 {
		 System.out.println("This is not Addemployee page - FAIL");
	 }

}
	
	@Test(priority=4)
	public void logout_Link() throws InterruptedException
	{
		WebElement adminPage=driver.findElement(By.linkText("Welcome Admin"));
		
		adminPage.click();
		
		Thread.sleep(1000);
		
		WebElement logout_Link=driver.findElement(By.linkText("Logout"));
		
		logout_Link.click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
