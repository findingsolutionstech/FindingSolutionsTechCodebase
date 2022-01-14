//package com.saucedemo.steps;
//
//import com.saucedemo.utils.DatabaseValiationMySQL;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class DatabaseValidationJobSuppliesTableStepDef {
//	
//	
//	DatabaseValiationMySQL userAttempts;
//	
//	
//	
//	@Given("user connects to expected database")
//	public void user_connects_to_expected_database() {
//	       
//		userAttempts = new DatabaseValiationMySQL();
//		
//		userAttempts.setUp();
//		
//		
//	}
//	
//	
//	
//
//	@When("user queries {string} freesupplies table for available printer paper records")
//	public void user_queries_freesupplies_table_for_available_printer_paper_records(String query) {
//		userAttempts.validateFreeSuppliesTablePrinterPaperColumn(query);
//
//		
//	}
//
//	
//	
//	
//	@When("user queries {string} freesupplies table for available pens records")
//	public void user_queries_freesupplies_table_for_available_pens_records(String query) {
//
//		userAttempts.validateFreeSuppliesTablePenColumn(query);
//		
//	}
//	
//	
//
//	@When("user queries {string} freesupplies table for available composition books records")
//	public void user_queries_freesupplies_table_for_available_composition_books_records(String query) {
//
//		userAttempts.validateFreeSuppliesTableCompositionBooksColumn(query);
//		
//	}
//
//	
//	
//	@When("user queries {string} freesupplies table for available note pad records")
//	public void user_queries_freesupplies_table_for_available_note_pad_records(String query) {
//
//		userAttempts.validateFreeSuppliesTableNotPadColumn(query);
//	}
//	
//	
//}
