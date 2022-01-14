Feature: User access and checkout

Background: 
 		    Given user navigates to saucelabs application
 		



  Scenario: user navigates to homepage
   # And do something
    #When I add do something
    #Then the I verify something
    
    
    
    
  #@Smoketest_database
	#@SmokeTest
	
	
  Scenario: User completes a purchase successfully
    When user enters username
    And user enters password
    And user clicks login
    When user selects and item
    Then navigate to cart for checkout
    And clicks checkout
    Then enters first name
    Then enters last name
    And user enters valid postal code
    And clicks continue
    Then clicks finish
    
    
	 
  Scenario: User completes a purchase successfully
    #And validate expected title
    When user enters username "standard_user"
    And user enters password "secret_sauce"
    And user clicks login
    When user selects and item
    Then navigate to cart for checkout
    And clicks checkout
    Then enters first name "First Name"
    Then enters last name "Last Name"
    And user enters valid postal code
    And clicks continue
    Then clicks finish
    Then user should see success message
    

  
  @Smoketest_regression
  Scenario Outline: User completes a purchase successfully
    Then basic user validate expected title as basic user
    When basic user enters valid username "<username>" as a basic user
    And basic user enters standard "<password>" user password
    And basic user clicks login
    When basic user selects a red tshirt
    And basic user navigates to cart from redtshirt product page
    And basic user clicks checkout on your product page
    Then basic user enters "<first_name>" first name on contact info page
    Then basic user enters last name "<last_name>"
    And basic user enters valid "<zip code>" postal code
    And basic user clicks continue
    Then basic user clicks finish
    Then basic user should see success message

    Examples: 
      | username      | password     | first_name     | last_name     | zip code  |
      | standard_user | secret_sauce | testing123     | lastnamevalue |    123123 |
      #| standard_user | secret_sauce | kevin          | lastnamevalue |    124324 |
      #| standard_user | secret_sauce | firstnamevalue | sdfasf        |    423423 |
      #| standard_user | secret_sauce | asdfasdf       | lastnamevalue |    534232 |
      #| standard_user | secret_sauce | firstnamevalue | lastasfasdf   |    323433 |
      #| standard_user | secret_sauce | thisIsATest    | lastnamevalue |    654765 |
      #| standard_user | secret_sauce | firstnamevalue | mcdonal       | 234234234 |
      #| standard_user | secret_sauce | adsfasdf       | helloworld    |   3523423 |
      #| standard_user | secret_sauce | firstnamevalue | asdfsafd      |    232332 |
      #| standard_user | secret_sauce | student1       | asdfasf       |     32234 |
      #| standard_user | secret_sauce | firstnamevalue | lastnamevalue |    432342 |
      #| standard_user | secret_sauce | asdfsdf        | lastnamevalue |    334543 |
      #| standard_user | secret_sauce | sdfsdf         | lastnamevalue |    534323 |
      #| standard_user | secret_sauce | student4       | asdfsd        |     55343 |
