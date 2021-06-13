package BrowserInstantiation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingSafariBrowser {

	
	
	
	 public static void main(String[] args) {
		  
		  //set path to location of downloaded browser
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\kevin\\IEDriverServer\\IEDriverServer.exe");
		  
		  //create a reference to the driver and import the pack for that reference
	      WebDriver driver = new InternetExplorerDriver();
	      
	      
	     //using .get opens/navigates the user to specified url
	      driver.get("https://google.com");
	      
	      
	    //Closing the browser
	      driver.quit();
	    }
}
