package BrowserInstantiation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

	
	public static void main(String[] args) {
		  
		  //set path to location of downloaded browser
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kevin\\chromedriver\\chromedriver.exe");
		  
		  //create a reference to the driver and import the pack for that reference
	      WebDriver driver = new ChromeDriver();
	      
	      
	     //using .get opens/navigates the user to specified url
	      driver.get("https://google.com");
	      
	      
	    //Closing the browser
	      driver.quit();
	    }
}
