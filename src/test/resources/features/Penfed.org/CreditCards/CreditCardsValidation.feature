Feature: Penfed Credit Cards
 As a normal user, I should be able to access credit cards tab
 so that I can access my account balances as expected.

  
  Scenario: Normal user validates available credit card products 
    Given normal user navigates to Penfed application
  	When normal user clicks on credit card overiew 
    Then normal user confirms landing page is displayed as expected
  	Then normal user validates available Credit cards options
    
   
  Scenario: Normal user validates power cash credit card additional features and benefits
    Given normal user navigates to Penfed application
    Then normal user confirms landing page is displayed as expected
  	When normal user clicks on credit card overiew 
  	When normaml user click power cash Credit card product 
    Then normal user confirms power cash rewards casd page is displayed
  	Then user validates additonal features and benefits component 
  	
    
  Scenario: Normal user validates power cash credit card how to redeem you power cash rewards
    Given normal user navigates to Penfed application
    Then normal user confirms landing page is displayed as expected
  	When normal user clicks on credit card overiew 
  	When normaml user click power cash Credit card product 
    Then normal user confirms power cash rewards casd page is displayed
  	Then user validates additonal how to redeem you power cash rewards component 
  	
    
  
  