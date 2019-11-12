package com.mycompany.qa.pages;

//Write once, run everywhere= Java

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NavigateFlightPage extends PageFactoryBase {//inheritance  Class adi: NavigateFlight 

	
	public NavigateFlightPage(WebDriver driver) // This is Constructor WebDriver=interface; driver = a reference variable whose type is an interface.
	{
		super(driver);
		
	}
	
	public NavigateFlightPage oneWayFlight(){
		
		oneWayButton.click();
		originCity.click();
		originCity.sendKeys("NEW");
		
		for (WebElement city: originList) {
		System.out.println(city.getText());	
			
		}
		
		System.out.println("=================================");
		originList.size();
		System.out.println("List Size " + originList.size());
		originList.get(0).getText();
		System.out.println(originList.get(0).getText()); //Listenin ilk elemani
		System.out.println(originList.get(1).getText()); //Listenin ikinci elemani 
		originList.get(1).click();
		
		return new NavigateFlightPage(driver);
		
	}
					
		
	
	
 	}
	

	
	
	
	
	

