package com.saucedemo.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RemoteGridExecution {

	
	WebDriver driver = null;
	
	String hubUrl = null;
	
	String baseUrl = "https://www.saucedemo.com";
	
	public static String remoteGridExecution;
	
	public static String setRemoteChrome;
	
	public static String setRemoteFirefox;
	
	public static String setRemoteEdge;
	
	public static String setRemoteStatus;
	
	
	DesiredCapabilities capabilities = new DesiredCapabilities();

	
	
	@Test
	@Parameters("remoteExecution")
	public void testExecution(String remoteGridExecution) throws MalformedURLException {
		ConfigurationReader.getProperties();
		
		
		if(remoteGridExecution.equalsIgnoreCase("remote.chrome.execution")) {
			hubUrl = "http://192.168.0.170:4444";
			System.out.println("Chrome Testing in progress!");
			
			
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WIN10);
			
			
			ChromeOptions options = new ChromeOptions();
			
			options.merge(capabilities);
			
 			
			driver = new RemoteWebDriver(new URL(hubUrl), options);
			
			driver.get(baseUrl);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}else if(remoteGridExecution.equalsIgnoreCase("remote.firefox.execution")) {
			
			hubUrl = "http://192.168.0.170:4444";
			System.out.println("Firefox Testing in progress!");
			
 			
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WIN10);
			
			
			FirefoxOptions options = new FirefoxOptions();
			
			options.merge(capabilities);
			
			driver = new RemoteWebDriver(new URL(hubUrl), options);
			
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}else if(remoteGridExecution.equalsIgnoreCase("remote.edge.execution")) {
			
			hubUrl = "http://192.168.0.170:4444";
			System.out.println("Edge Testing in progress!");
			
 			
			capabilities.setBrowserName("Edge");
			capabilities.setPlatform(Platform.WIN10);
			
			
			EdgeOptions options = new EdgeOptions();
			
			options.merge(capabilities);
			
			driver = new RemoteWebDriver(new URL(hubUrl), options);
		
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
	}else {
		
		System.out.println("Unable to locate Hub, please ensure servers are running and/or check your conditions");
     }
	
//}
	
	
		
//		@Test
//		public void swaglabsUIHappyPathExecution() throws Exception{
//	
		driver.get(baseUrl);

		 
		// user enters username
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		// user enters password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		// user clicks login
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		System.out.println("Executing swag labs Demo 1" + Thread.currentThread().getId());

	
		//user selects an item 
		driver.findElement(By.xpath("//button[.='Add to cart']")).click();

		//user navigates to cart
		driver.findElement(By.xpath ("//*[@class='shopping_cart_link']")).click();

		//user clicks checkout on your product page
		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		//user enters first name
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("asdfasdf");

		//user enters last name
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("asdfasf");
		
		//user enters zipcode
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("234324");

		
		//user click continue
		driver.findElement(By.xpath("//input[@id='continue']")).click();

	}

		
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
		System.out.println("*******************************************************************************************************");

		System.out.println("Destroying browser!");
	}
	
	
}
