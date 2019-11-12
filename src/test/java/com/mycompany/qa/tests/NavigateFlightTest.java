package com.mycompany.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;




public class NavigateFlightTest extends TestBaseER{
	

	 @Test(priority=1)
	  public void oneWayFlight(){//Test ismi istedigimiz bir isim, istersek degistirilebilir, not MUST! 
		    extentTest = extent.startTest("Home button validation"); //test result screenshot almasi icin
			homePage.clickFlight().oneWayFlight();
			// Assert.assertTrue(flag); No Need here! //aldigin sonuc dogruysa test gecti anlamina geliyor.
			System.out.println(homePage.getTitle());//gittigimiz sayfanin title ini almak icin
	  }

		
	 
	 
	 
	 
  }
 
 
  

