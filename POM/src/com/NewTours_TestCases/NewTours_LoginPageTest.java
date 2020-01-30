package com.NewTours_TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

import com.NewTours_WebPages.NewTours_LoginPage;

public class NewTours_LoginPageTest extends BaseTest 

{
	
	NewTours_LoginPage newtours_LoginPage=null;
	
       @Test(priority=1)
        public void signOnTest() throws IOException, InterruptedException
        {
        	newtours_LoginPage=PageFactory.initElements(driver,NewTours_LoginPage.class);
        	
        	newtours_LoginPage.signOn();
        	
          
       String  expected_SignOnUrl="mercurysignon.php";
   
    		String actual_WebPageSignonUrl=driver.getCurrentUrl();
    		
    		 File screenShotsLinks= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	   		
  	   		FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/signon.png"));
         	
    		
    		if(actual_WebPageSignonUrl.contains(expected_SignOnUrl))
    		{
    			System.out.println("This is SignOn Page - PASS");
    		}
    		else
    		{
    			System.out.println("This is not SignOn Page - FAIL");
    		}
    		
    		 
        }

		
		@Test(priority=2)
		public void RegisterTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.register();
			
			String expected_RegisterPageUrl="mercuryregister.php";
			
			String actual_WebpageRegisterPageUrl=driver.getCurrentUrl();
			
			 File screenShotsLinks= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  	   		
	  	   		FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/register.png"));
	         	
			
			if(actual_WebpageRegisterPageUrl.contains(expected_RegisterPageUrl))
			{
				System.out.println("This is RegisterPage - PASS");
			}
			else
			{
				System.out.println("This is not RegisterPage - FAIL");
			}
		}
		
		
		@Test(priority=3)
		public void SupportTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.support();
			
			String expected_SupportPageUrl="mercuryunderconst.php";
			
			String actual_WebpageSupprortUrl=driver.getCurrentUrl();
			
			File screenshotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenshotsLinks, new File("./ScreenShots/support.png"));
			
			if(actual_WebpageSupprortUrl.contains(expected_SupportPageUrl))
			{
			 
				System.out.println("This is SupportPage - PASS");
		     }
			
			else
			{
				System.out.println("This is not SupportPage - FAIL");
			}
          }
		
		@Test(priority=4)
		public void ContactTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.contact();
			
			String expected_ContactPageUrl="mercuryunderconst.php";
			
			String actual_WebpageContactUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/contact.png"));
			
			if(actual_WebpageContactUrl.contains(expected_ContactPageUrl))
			{
				System.out.println("This is ContactPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not  ContactPage - FAIL ");
			}
		}
		
		@Test(priority=5)
		public void HomeTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.home();
			
			String expected_HomePageUrl="mercurywelcome.php";
			
			String actual_WebpageHomeUrl=driver.getCurrentUrl();
			
         File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/home.png"));
			
			if(actual_WebpageHomeUrl.contains(expected_HomePageUrl))
			{
				
				System.out.println("This is HomePage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not HomePage - FAIL ");
			}
			
		}
		
		@Test(priority=6)
		public void FlightsTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.flights();
			
			String expected_FlightsPageUrl="index.php";
			
			String actual_WebpageFlightsUrl=driver.getCurrentUrl();
			
			 File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/flights.png"));
				

				if(actual_WebpageFlightsUrl.contains(expected_FlightsPageUrl))
				{
					
					System.out.println("This is FlightsPage - PASS ");
				}
				
				else
				{
					System.out.println("This is Not FlightsPage - FAIL ");
				}
				
		}
		
		@Test(priority=7)
		public void HotelsTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.hotels();
			
			String expected_HotelsPageUrl="mercuryunderconst.php";
			
			String actual_WebpageHotelstUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/hotels.png"));
			
			if(actual_WebpageHotelstUrl.contains(expected_HotelsPageUrl))
			{
				System.out.println("This is HotelsPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not HotelsPage - FAIL ");
			}
		}
		
		@Test(priority=8)
		public void CarRentalsTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.carRentals();
			
			String expected_CarRentalsPageUrl="mercuryunderconst.php";
			
			String actual_WebpageCarRentalsUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/carRentals.png"));
			
			if(actual_WebpageCarRentalsUrl.contains(expected_CarRentalsPageUrl))
			{
				System.out.println("This is CarRentalsPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not CarRentalsPage - FAIL ");
			}
		}
		
		@Test(priority=9)
		public void CruisesTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.cruises();
			
			String expected_CruisesPageUrl="mercurycruise.php";
			
			String actual_WebpageCruisesUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/cruises.png"));
			
			if(actual_WebpageCruisesUrl.contains(expected_CruisesPageUrl))
			{
				System.out.println("This is CruisesPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not CruisesPage - FAIL ");
			}
		}
		
		@Test(priority=10)
		public void DestinationsTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.destinations();
			
			String expected_DestinationsPageUrl="mercuryunderconst.php";
			
			String actual_WebpageDestinationsUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/destinations.png"));
			
			if(actual_WebpageDestinationsUrl.contains(expected_DestinationsPageUrl))
			{
				System.out.println("This is DestinationsPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not DestinationsPage - FAIL ");
			}
		}
		
		@Test(priority=11)
		public void VacationsTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.vacations();
			
			String expected_VacationsPageUrl="mercuryunderconst.php";
			
			String actual_WebpageVacationsUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/vacations.png"));
			
			if(actual_WebpageVacationsUrl.contains(expected_VacationsPageUrl))
			{
				System.out.println("This is vacationsPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not VacationsPage - FAIL ");
			}
		}
		
		@Test(priority=12)
		public void YourDestinationTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.Destinatios();
			
			String expected_YourDestinationPageUrl="mercuryunderconst.php";
			
			String actual_WebpageYourDestinationsUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/yourdestinations.png"));
			
			if(actual_WebpageYourDestinationsUrl.contains(expected_YourDestinationPageUrl))
			{
				System.out.println("This is YourDestinationPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not YourDestinationPage - FAIL ");
			}
		}
		
		@Test(priority=13)
		public void FeaturedVacationsTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.Vacations();
			
			String expected_FeaturedVacationsPageUrl="mercuryunderconst.php";
			
			String actual_WebpageFeaturedVacationsUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/featuredvacations.png"));
			
			if(actual_WebpageFeaturedVacationsUrl.contains(expected_FeaturedVacationsPageUrl))
			{
				System.out.println("This is FeaturedVacationsPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not FeaturedVacationsPage - FAIL ");
			}
		}
		
		@Test(priority=14)
		public void RegisterHereTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.Register();
			
			String expected_RegisterHerePageUrl="mercuryregister.php";
			
			String actual_WebpageRegisterHereUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/registerhere.png"));
			
			if(actual_WebpageRegisterHereUrl.contains(expected_RegisterHerePageUrl))
			{
				System.out.println("This is RegisterHerePage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not RegisterHerePage - FAIL ");
			}
		}  
		
		

		@Test(priority=15)
		public void BusinessTravelLinkTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.businessTravelLink();
			
			String expected_BusinessTravelLinkPageUrl="http://businesstravel.about.com/";
			
			String actual_WebpageBusinessTravelLinkUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/businesstravellink.png"));
			
			if(actual_WebpageBusinessTravelLinkUrl.contains(expected_BusinessTravelLinkPageUrl))
			{
				System.out.println("This is BusinessTravelPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not BusinessTravelPage - FAIL ");
			}
		}
		
		@Test(priority=16)
		public void SalonTravelLinkTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);
			
			newtours_LoginPage.salonTravel();
			
			String expected_SalonTravelLinkPageUrl="www.salon.com";
			
			String actual_WebpageSalonTravelLinkUrl=driver.getCurrentUrl();
			
			File screenShotsLinks=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenShotsLinks, new File("./ScreenShots/salontravellink.png"));
			
			if(actual_WebpageSalonTravelLinkUrl.contains(expected_SalonTravelLinkPageUrl))
			{
				System.out.println("This is SalonTravelPage - PASS ");
			}
			
			else
			{
				System.out.println("This is Not SalonTravelPage - FAIL ");
			}
		}
		
		@Test(priority=17)
		public void findAFlightsTest() throws IOException
		{
			newtours_LoginPage=PageFactory.initElements(driver, NewTours_LoginPage.class);	
			
			FileInputStream file=new FileInputStream(".//src//com//ApplicationTestDataFiles//MultipleLoginData.xlsx");
			
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			int rowCount=sheet.getLastRowNum();
			
			for(int i=1;i<=rowCount;i++)
			{
				Row row=sheet.getRow(i);
				
				newtours_LoginPage.FindAFlight(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
				
				String expected_HomePageTitle="Find";
				
				String actual_WebPageTitle=driver.getTitle();
				
				if(actual_WebPageTitle.contains(expected_HomePageTitle))
				{
					
					System.out.println(" LogIN Successfull - PASS");
					row.createCell(2).setCellValue("LogIN Successfull - PASS");
				}
				else
				{
					System.out.println(" LogIn Failed - FAIL");
					row.createCell(2).setCellValue("LogIn Failed - FAIL");
				}
				
				driver.navigate().back();
				
				FileOutputStream file1=new FileOutputStream(".//src//com//ApplicationResultDataFiles//MultipleLoginDataResult.xlsx");
				
				workbook.write(file1);
						
				
			}
			
			
			
		}
}
