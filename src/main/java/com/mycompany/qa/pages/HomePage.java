package com.mycompany.qa.pages;

//Write once, run everywhere= Java

import org.openqa.selenium.WebDriver;


public class HomePage extends PageFactoryBase {//inheritance

	
	public HomePage(WebDriver driver) // WebDriver is an interface; driver is a reference variable whose type is an interface.
	{
		super(driver);
		
	}
	
	public boolean validateHome(){
		js.highlight(homeButton, driver);
 		js.drawBorder(homeButton, driver);
 		//HomeButton.click();
 		return homeButton.isDisplayed();
 	}
	
	public NavigateFlightPage clickFlight() { // NavigateFlight=Return Type; clickFlight= Method
		
		flightButton.click();
		return new NavigateFlightPage(driver);
		
		
	}
	
	
	
 	}
	

	
	
	
	
	

