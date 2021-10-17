package selenium_waits;

import java.util.concurrent.TimeUnit;

import org.apache.xpath.functions.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testWaitTimes {

	public static void main(String[] args) {

		// Setting the webdriver.chrome.driver property to its executable's location
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kevin\\Driver\\ChromeDriver.exe");

		// Creating a driver object referencing WebDriver interface
		WebDriver driver = new ChromeDriver();

		// Using get() method to open a web page
		driver.get("https://www.saucedemo.com/");

		/*
		 * 
		 * ImplicityWait if unable to locate the weblemenet when the page loads the
		 * scripts will poll for specificed time and poll until that element is visible
		 * before either locating that element or throwing nosuchelement exception
		 * 
		 */
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/**
		 * An explict wait essentially will run scripts against UI however will give
		 * time to explicitly wait for a specific element, more of a wait for an element
		 * you have been working with and aware of its time to load
		 * 
		 * this wait gives more flexibility
		 */

		WebDriverWait wait = new WebDriverWait(driver, 30);

		// locate username field and enter text
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// locate pw field and enter
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));

		//element.click();

		
		
		
		
		// driver.findElement(By.id("login-button")).click();
		
		
		
		
		

		Wait<WebDriver> secondWait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		

		WebElement elementNum2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))));
				
		elementNum2.click();

	}
}
