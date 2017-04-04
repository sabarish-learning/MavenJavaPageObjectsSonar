package com.sample.youtubemavenproject;

import java.awt.Robot;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Point;

import pageObjects.HomePage;

public class BasicSearch extends DriverInit{
	
	//Driver for Mozilla Firefox
	private static WebDriver driver = new DriverInit().setDriverForMozillaFirefox();
	
	@Test
	public void searchInYoutube() {
		
		try{
			// Go to Youtube
			System.out.println("Go to Youtube");
			driver.get("https://www.youtube.com/");
			
			// Accept cookies
			Thread.sleep(2000);
			HomePage homePage = new HomePage(driver);
			homePage.clickSearchBox();
			homePage.search("Tesla");
			System.out.println("END....");
			
			// Close the connection
			driver.close();
		}
		catch(Exception e){
			System.out.println("Exception ocurred: ");
			e.printStackTrace();
		}
	}

}
