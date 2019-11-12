package com.mycompany.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mycompany.qa.util.JSEHelper;

public class PageFactoryBase {
	
	
	//private WebDriver driver;
	protected WebDriver driver;
	JSEHelper js = new JSEHelper();
	
	
	public PageFactoryBase(WebDriver driver) 
    {
	this.driver=driver;
	PageFactory.initElements(driver, this);//@FindBy page factory kullanabilmek icin
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	//PAGE FACTORY
	   	
			
		//Home Menu
		@FindBy(xpath="//*[@id='primary-header-home']")  //a[contains(text(),'My account')]
		WebElement homeButton;
		
		//Flight Button
		@FindBy(xpath="//*[@id='tab-flight-tab-hp']")
		WebElement flightButton;
		
		
		//OneWay Button
		@FindBy(xpath="//*[@id='flight-type-one-way-label-hp-flight']")
		WebElement oneWayButton;
		
		//OriginCity Button
		@FindBy(xpath="//*[@id='flight-origin-hp-flight']")
		WebElement originCity;
		
						
		@FindBy(xpath="//*[@id='typeaheadDataPlain']/div/li")
		List<WebElement> originList;
		
		
	
		
		
	
	
	
}
