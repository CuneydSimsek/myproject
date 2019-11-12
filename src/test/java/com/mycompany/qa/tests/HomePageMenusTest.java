package com.mycompany.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;




public class HomePageMenusTest extends TestBaseER{
	

	 @Test(priority=1)
	  public void validateHomeButton(){//method ismi istedigimiz bir isim 
		    extentTest = extent.startTest("Home button validation ");	//test result screenshot almasi icin
			boolean flag = homePage.validateHome(); //homePage class'inda bu metoda git ve sonucu flag degiskenine al
			Assert.assertTrue(flag);  //aldigin sonuc dogruysa test gecti anlamina geliyor.
			System.out.println(homePage.getTitle());//gittigimiz sayfanin title ini almak icin
	  }

		 
	 
	 
  }
 
 
  

