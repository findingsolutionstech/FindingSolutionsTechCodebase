package com.saucedemo.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	WebDriver driver = null;
	public static String browserName = null;
	
	public static String setDriverChromeName = null;
	public static String setdriverPathChrome = null;

	public static String setFirefoxDriverName = null;
	public static String setFirefoxDriverPath = null;
	
	
	public static String setEdgeDriverName = null;
	public static String setEdgeDriverPath = null;
	
	
	
	
		@BeforeTest
		public void setUpEnvironment() {

			String projectPath = System.getProperty("user.dir");
			ConfigurationReader.getProperties();
			
			if(browserName.equalsIgnoreCase("chrome")) {
				System.out.println("Executing chrome set up!");
				
				System.setProperty(setDriverChromeName, projectPath+ setdriverPathChrome);
				driver = new ChromeDriver();
				
			}else if(browserName.equalsIgnoreCase("firefox")) {
				System.out.println("Executing firefox set up!");
				
				System.setProperty(setFirefoxDriverName, projectPath  + setFirefoxDriverPath);
				driver = new FirefoxDriver();
				
			}else if(browserName.equalsIgnoreCase("edge")) {
				System.out.println("Executing edge set up!");
				
				System.setProperty(setEdgeDriverName, projectPath  + setEdgeDriverPath);
				driver = new EdgeDriver();
				
			}else{
				
				System.out.println("Attention none of the browsers were invoked as expected refer back to environement set up!");
				
			}
			
			
	
		}
	

	@Test
	public void swaglabsDemo_1() throws Exception {

		 
		

 
		driver.get("https://www.saucedemo.com");

 
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

	
	
	@Test
	public void swaglabsDemo_2() throws Exception {

 
		driver.get("https://www.saucedemo.com");

 
		// user enters username
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

				// user enters password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

				// user clicks login
				driver.findElement(By.xpath("//input[@id='login-button']")).click();

				System.out.println("Executing swag labs Demo 2" + Thread.currentThread().getId());

			
				//user selects an item 
				driver.findElement(By.xpath("//button[.='Add to cart']")).click();

				//user navigates to cart
				driver.findElement(By.xpath ("//*[@class='shopping_cart_link']")).click();

				//user clicks checkout on your product page
				driver.findElement(By.xpath("//button[@id='checkout']")).click();

				//user enters first name
				driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("first name");

				//user enters last name
				driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("last name");
				
				//user enters zipcode
				driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("23234");

				
				//user click continue
				driver.findElement(By.xpath("//input[@id='continue']")).click();

		


	}
	
	 
	@Test
	public void swaglabsDemo_3() throws Exception {
 
		
		driver.get("https://www.saucedemo.com");

		
		// user enters username
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

				// user enters password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

				// user clicks login
				driver.findElement(By.xpath("//input[@id='login-button']")).click();

				System.out.println("Executing swag labs Demo 3" + Thread.currentThread().getId());

			
				//user selects an item 
				driver.findElement(By.xpath("//button[.='Add to cart']")).click();

				//user navigates to cart
				driver.findElement(By.xpath ("//*[@class='shopping_cart_link']")).click();

				//user clicks checkout on your product page
				driver.findElement(By.xpath("//button[@id='checkout']")).click();

				//user enters first name
				driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("first name");

				//user enters last name
				driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("last name");
				
				//user enters zipcode
				driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("23234");

				
				//user click continue
				driver.findElement(By.xpath("//input[@id='continue']")).click();

			


	}
	
	
	@Test
	public void swaglabsDemo_4() throws Exception {

		driver.get("https://www.saucedemo.com");

 
 
		        // user enters username
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

				// user enters password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

				// user clicks login
				driver.findElement(By.xpath("//input[@id='login-button']")).click();

				System.out.println("Executing swag labs Demo 4" + Thread.currentThread().getId());

			
				//user selects an item 
				driver.findElement(By.xpath("//button[.='Add to cart']")).click();

				//user navigates to cart
				driver.findElement(By.xpath ("//*[@class='shopping_cart_link']")).click();

				//user clicks checkout on your product page
				driver.findElement(By.xpath("//button[@id='checkout']")).click();

				//user enters first name
				driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("first name");

				//user enters last name
				driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("last name");
				
				//user enters zipcode
				driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("23234");

				
				//user click continue
				driver.findElement(By.xpath("//input[@id='continue']")).click();

			


	}
	
	
	@Test
	public void swaglabsDemo_5() throws Exception {

		driver.get("https://www.saucedemo.com");

		// user enters username
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

				// user enters password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

				// user clicks login
				driver.findElement(By.xpath("//input[@id='login-button']")).click();

				System.out.println("Executing swag labs Demo 5" + Thread.currentThread().getId());

			
				//user selects an item 
				driver.findElement(By.xpath("//button[.='Add to cart']")).click();

				//user navigates to cart
				driver.findElement(By.xpath ("//*[@class='shopping_cart_link']")).click();

				//user clicks checkout on your product page
				driver.findElement(By.xpath("//button[@id='checkout']")).click();

				//user enters first name
				driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("first name");

				//user enters last name
				driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("last name");
				
				//user enters zipcode
				driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("23234");

				
				//user click continue
				driver.findElement(By.xpath("//input[@id='continue']")).click();

			


	}

	 
	@AfterTest
	public void existBrowser() {
		System.out.println("Test execution completed!");
		driver.close();
	}

}
