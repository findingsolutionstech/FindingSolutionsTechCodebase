package com.saucedemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		testDB();
			
	}
	
	
	
	public static void testDB() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		
		
		
		//Connection String is required 
		//Statement is required used to create your SQL statement 
		//Resultset is required String value passed by way of SQL command
		
		//Connection string is created here, using Connection interface to establish the connection to the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobsupplies","root","Selenium2021!");
		
		System.out.println("Connected to MySQL database");
		
		
		//Con reference is used here to create statement reference object
		//Statement is an interface 
		Statement statment = con.createStatement();
		
		
		
		//Resultset interface, is where the statement execution will take place
		ResultSet resultset = statment.executeQuery("Select * from freesupplies");
		
		
		while(resultset.next()) {
			
			String pensColumn = resultset.getString("pens");
			
			System.out.println("Database record in pens column is " + pensColumn);
			
			
			String printerPaperColumnValues = resultset.getString("printerpaper");
			
			
			System.out.println("Database record in printer paper column is " + printerPaperColumnValues);

			
			String notepadColumValues = resultset.getString("notepads");
			
			
			System.out.println("Database record in notepad column is " + notepadColumValues);
			
			
			String compositionbooksValues = resultset.getString("compositionbooks");
			
			System.out.println("Database record in composition books column is " + compositionbooksValues);

			
			
			
			
		}
		
	}
	
	
}
