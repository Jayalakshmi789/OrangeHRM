package com.NewTours_WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTours_LoginPage

{
    //<a href="mercurysignon.php?osCsid=a0d623b6ccf718a3fac36bdafd456711">SIGN-ON</a>
	
	@FindBy(linkText="SIGN-ON")
	WebElement SignOn;
	
	public void signOn()
	{
		SignOn.click();
	}
	
	//<a href="mercuryregister.php">REGISTER</a>
	
	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	public void register()
	{
		Register.click();
	}
	
	//<a href="mercuryunderconst.php">SUPPORT</a>
	
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	
	public void support()
	{
		Support.click();
	}
	
	//<a href="mercuryunderconst.php">CONTACT</a>
	
	@FindBy(linkText="CONTACT")
	WebElement Contact;
	
	public void contact()
	{
		Contact.click();
	}
	
	//<a href="mercurywelcome.php">Home</a>
	
	@FindBy(linkText="Home")
	WebElement Home;
	
	public void home()
	{
		Home.click();
	}
	
	//<a href="mercuryreservation.php">Flights</a>
	
	@FindBy(linkText="Flights")
	WebElement Flights;
	
	public void flights()
	{
		Flights.click();
	}
	
	//<a href="mercuryunderconst.php">Hotels</a>
	
	@FindBy(linkText="Hotels")
	WebElement Hotels;
	
	public void hotels()
	{
		Hotels.click();
     }
	
	//<a href="mercuryunderconst.php">Car Rentals</a>
	
	@FindBy(linkText="Car Rentals")
	WebElement CarRentals;
	
	public void carRentals()
	{
		CarRentals.click();
	}
	
	//<a href="mercurycruise.php">Cruises</a>
	
	@FindBy(linkText="Cruises")
	WebElement Cruises;
	
	public void cruises()
	{
		Cruises.click();
	}
	
	//<a href="mercuryunderconst.php">Destinations</a>
	
	@FindBy(linkText="Destinations")
	WebElement Destinations;
	
	public void destinations()
	{
		Destinations.click();
	}
	
	//<a href="mercuryunderconst.php">Vacations</a>
	
	@FindBy(linkText="Vacations")
	WebElement Vacations;
	
	public void vacations()
	{
		Destinations.click();
	}
	
	//<a href="mercuryunderconst.php">your destination</a>
	
	@FindBy(linkText="your destination")
	WebElement YourDestination;
	
	public void Destinatios()
	{
		YourDestination.click();
	}
	
	//<a href="mercuryunderconst.php">featured vacation destinations</a>
	
	@FindBy(linkText="featured vacation destinations")
	WebElement FeaturedVacationDestinations;
	
	public void Vacations()
	{
		FeaturedVacationDestinations.click();
	}
	
	//<a href="mercuryregister.php">Register here</a>
	
	@FindBy(linkText="Register here")
	WebElement RegisterHere;
	
	public void Register()
	{
		RegisterHere.click();
	} 
	
	//<a href="http://businesstravel.about.com/mbody.htm?PM=78_101_T&amp;cob=home">Business  Travel @ About.com</a>
	///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[1]
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[1]")
	WebElement BusinessTravelLink;
	
	public void businessTravelLink()
	{
		BusinessTravelLink.click();
	}
       
	//<a href="http://www.salon.com/travel/index.html">Salon Travel</a>

	@FindBy(linkText="Salon Travel")
	WebElement SalonTravel;
	
	public void salonTravel()
	{
		SalonTravel.click();
	}
	
	
	//<input type="text" name="userName" size="10">
	//<input type="password" name="password" size="10">
	//<input type="image" name="login" value="Login">
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement signin;
	
	public void FindAFlight(String username,String password)
	{
		UserName.clear();
		UserName.sendKeys(username);
		
		Password.clear();
		Password.sendKeys(password);
		
		signin.click();
	}
	
}
