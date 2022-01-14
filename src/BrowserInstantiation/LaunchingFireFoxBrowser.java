package BrowserInstantiation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFireFoxBrowser {
	
	  public static void main(String[] args) {
	  
		  //set path to location of downloaded browser
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\{name}\\firefoxdriver\\geckodriver.exe");
		  
		  //create a reference to the driver and import the pack for that reference
	      WebDriver driver = new FirefoxDriver();
	      
	      
	     //using .get opens/navigates the user to specified url
	      driver.get("https://google.com");
	    }
	
	  
	
	
	
	
}
