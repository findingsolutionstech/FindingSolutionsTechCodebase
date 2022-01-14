package com.saucedemo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestExecutionHappyPath {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void performHappyPathValidation(String browserName) {

		if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\ChromeDriver.exe");
					
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\EdgeDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.get("https://www.saucedemo.com/");

		// user enters username
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		// user enters password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		// user clicks login
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		System.out.println("Executing swag labs Demo 1" + Thread.currentThread().getId());

		// user selects an item
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();

		// user navigates to cart
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();

		// user clicks checkout on your product page
		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		// user enters first name
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("asdfasdf");

		// user enters last name
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("asdfasf");

		// user enters zipcode
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("234324");

		// user click continue
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		//user clicks finish button on confirmation page
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		//quitting said browser
		driver.close();


	}

}
