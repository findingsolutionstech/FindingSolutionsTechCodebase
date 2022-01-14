package com.saucedemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseValiationMySQL {

	
 
	// Connection object
	static Connection con = null;

	// Statement object
	private static Statement statemtent;

	// Constant for Database url
	private static final String DB_URL = "jdbc:mysql://localhost:3306/jobsupplies";

	// Database username
	private static final String DB_USER = "root";

	// Database password
	private static final String DB_PASSWORD = "Selenium2021!";
	
	

	
	//Method establishes connection to the specified database using db location, db username, db password
	public void setUp() throws SQLException {

		try {

			// Allows database connection, loading driver
			String dbClass = "com.mysql.cj.jdbc.Driver";

			Class.forName(dbClass).newInstance();

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			System.out.println("Driver loaded");
			System.out.println("Connected to MySQL database");

			statemtent = con.createStatement();
			
			
		} catch (Exception e) {

			con.close();
			e.printStackTrace();
			
		}

	}
	
	
	
	//Method performs SQL query on specified table column, accepts a single query. Has one parameter 
	public void validateFreeSuppliesTablePenColumn(String query) {
		
		
		try {
			
			ResultSet resultset = statemtent.executeQuery(query);
			
			
			while(resultset.next()) {
				System.out.print(" " + resultset.getString("pens"));
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();

		}
	}
	
	
	

	//Method performs SQL query on specified table column, accepts a single query. Has one parameter 
	public void validateFreeSuppliesTablePrinterPaperColumn(String query) {
		
		
		try {
			
			ResultSet resultset = statemtent.executeQuery(query);
			
			
			while(resultset.next()) {
				System.out.print(" " + resultset.getString("printerpaper"));
			}
			

		}catch(Exception e) {
			
			e.printStackTrace();

		}
	}
	
	
	

	//Method performs SQL query on specified table column, accepts a single query. Has one parameter 
	public void validateFreeSuppliesTableCompositionBooksColumn(String query) {
		
		
		try {
			
			ResultSet resultset = statemtent.executeQuery(query);
			
			
			while(resultset.next()) {
				System.out.print(" " + resultset.getString("compositionbooks"));
			}
			

		}catch(Exception e) {
			
			e.printStackTrace();

		}
	}
	
	
	
	
	

	//Method performs SQL query on specified table column, accepts a single query. Has one parameter 
	public void validateFreeSuppliesTableNotPadColumn(String query) {
		
		
		try {
			
			ResultSet resultset = statemtent.executeQuery(query);
			
			
			while(resultset.next()) {
				System.out.print(" " + resultset.getString("notepads"));
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();

		}
	}
	
	

}
