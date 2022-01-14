package com.saucedemo.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

	 static Properties prop = new Properties();
	 static String projectPath = System.getProperty("user.dir");
	
	
	 public static void getProperties() {
		 
		 try {
			 
			 InputStream input = new FileInputStream(projectPath + "/Config/Configuration.properties");
			 prop.load(input);
			 
			 String browser = prop.getProperty("browser"); 
			 
			 TestNGDemo.browserName = browser;
			 
			 //retrieve chrome key values
			 String setDriverChrome = prop.getProperty("chrome");
			 String driverPathChrome = prop.getProperty("driver.local.chrome");
			 
			 
			 //retrieve firefox key values 
			 String firefoxDriverName = prop.getProperty("firefox");
			 String firefoxDriverPath = prop.getProperty("driver.local.firefox");
			 
			 
			 //retrieve edge key values 
			 String edgeDriverName = prop.getProperty("edge");
			 String edgeDriverPath = prop.getProperty("driver.local.edge");
			 
			 
			 
			 
			 //Remote execution get property 
 			 String remoteChrome = prop.getProperty("remote.chrome.execution");
			 String remoteFirefox = prop.getProperty("remote.firefox.execution");
			 String remoteEdge = prop.getProperty("remote.edge.execution");
			 String isRemote = prop.getProperty("is.remote");
			 
			 
			 
			 
			 
			 
			 //Remote execution setup
			 RemoteGridExecution.setRemoteChrome = remoteChrome;
			 RemoteGridExecution.setRemoteFirefox = remoteFirefox;
			 RemoteGridExecution.setRemoteEdge = remoteEdge;
			 RemoteGridExecution.setRemoteStatus = isRemote;
			 
			 
			 
			 
			 
			 //set chrome key values per expected test page
			 TestNGDemo.setDriverChromeName = setDriverChrome;
			 TestNGDemo.setdriverPathChrome = driverPathChrome;
			 
			 
			 //set firefox key values per expected test page
			 TestNGDemo.setFirefoxDriverName = firefoxDriverName;
			 TestNGDemo.setFirefoxDriverPath = firefoxDriverPath;
			 
			 
			 
			 //set firefox key values per expected test page
			 TestNGDemo.setEdgeDriverName = edgeDriverName;
			 TestNGDemo.setEdgeDriverPath = edgeDriverPath;
			 

			  
			 
		 }catch(Exception exp) {
			 System.out.println(exp.getMessage());
			 System.out.println(exp.getCause());
			 exp.printStackTrace();
			 
 			 
		 }
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
