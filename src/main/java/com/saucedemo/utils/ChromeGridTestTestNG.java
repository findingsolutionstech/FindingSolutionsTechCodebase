package com.saucedemo.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ChromeGridTestTestNG {

	WebDriver driver;
	String hubUrl;
	String baseUrl;
	
	/**
	 * Selenium Grid used for remote parallel test execution utilizing remote nodes by way of remote hub
	 * 
	 * The advantage is being able increase test execution scalability
	 * 
	 * @throws MalformedURLException
	 */
	
	

	@BeforeTest
	public void setUpEnvironment() throws MalformedURLException {

		hubUrl = "http://192.168.0.170:4444";
		baseUrl = "https://www.saucedemo.com/";

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		
		

		ChromeOptions options = new ChromeOptions();
		options.merge(capabilities);

		driver = new RemoteWebDriver(new URL(hubUrl), options);

	}

	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void executeTestOnGrid() {
		driver.get(baseUrl);
		System.out.println("The actual page title from remote executon is " + driver.getTitle());
	 Assert.assertEquals("Swag Labs", driver.getTitle());
	 
	}
	
	
	
	
	
	@AfterTest
	public void afterTest() {
		driver.quit();
		
		System.out.println("Test execution completed! Session closed");
	}
	
	
	
	
	
	
	
	
	
	
}
