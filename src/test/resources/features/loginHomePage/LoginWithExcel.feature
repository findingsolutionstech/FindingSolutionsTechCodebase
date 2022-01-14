Feature: Validation of using test data from excel
  I want to use this template for my feature file


 		Background: 
 		    Given user navigates to saucelabs application
 		
 		
 		
 		
	@DataDrivenValidation
  Scenario Outline: User signs in using test data from excel sheet
    When user enters first user name row <row_number> column <column_number> from excel sheet "sheet2"
    When user enters first password row <pw_row_number> column <pw_column_number> from excel sheet "sheet2"
    Then user clicks the login button
    When user selects a red tshirt
    And navigates to cart from redtshirt product page
    And clicks checkout on your product page
    Then enters first name <first_name> and <fs_col> on contact info page from excel sheet "sheet2"
   Then enters last name <last_name> and <last_name_col> from excel sheet "sheet2"
    And user enters valid zip code <zip_code> using data <zip_code_col> from excel sheet "sheet2"
    And clicks continue
    Then clicks finish
    Then user should see success message

    Examples: 
      | row_number | column_number | pw_row_number | pw_column_number | first_name | fs_col | last_name | last_name_col | zip_code | zip_code_col |
      |         2 |             0 |             1 |                1 |          2 |      1 |         3 |             2 |        4 |            1 |

      
      
      
      
      
      Scenario Outline: User login with excel utility 
      When admin user completes login fields using sheetname "<sheetName>" with rownumber <rowNumber>
      And admin user clicks the login button 
      
      Examples:
      |sheetName|rowNumber|
      |Sheet1   |0				|
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      