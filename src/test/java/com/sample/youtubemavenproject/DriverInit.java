package com.sample.youtubemavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInit {
	
	public static WebDriver driver = null;

	public WebDriver setDriverForMozillaFirefox(){
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		capabilities.setBrowserName("firefox");
		driver = new FirefoxDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public WebDriver setDriverForGoogleChrome(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void closeDriver(){
		driver.close();
	}
	
}
