Feature: Api validation of reqres platform

  Scenario: Verify api request performs as expected POST Request
    Given I submit a post request
    And post request is accepted by server and returns 201 status code
    Then I should be able to validate post request

  Scenario: Verify api request performs as expected DELETE Request
    Given I submit a post request
    And post request is accepted by server and returns 204 status code
    Then I should be able to validate post request

  Scenario: Verify api request performs as expected PUT Request
    Given I submit a post request
    And post request is accepted by server and returns 201 status code
    Then I should be able to validate post request





  @API_Validation
  Scenario Outline: verify Create Repo API
    Given Starting Test Case "Verify Create Repo API"
    Given Create Repo Payload name "<name>" amd description "<description>"
    When User calls Create API "https://reqres.in/api/users/2" Post API Call
    Then API Call got Successful with Status Code 201
    And Verify Repository "name" is "<name>"
    And Verify Repository "description" is "<description>"
    And Ending TestCase

    Examples: 
      | name    | description                     |
      | descOne | This is Data Driven Test Repo 1 |
      | kevin   | This is Data Driven Test Repo 2 |
      | winner  | This is Data Driven Test Repo 3 |
      
      
      

  #@API_Validation
  Scenario Outline: Verify Delete Repo API
    Given Starting Test Case "Verify Delete Repo API"
    Given Create Repo Payload name "<name>" amd description "<description>"
    When User calls Delete API "https://reqres.in/api/users/2" Delete Call
    Then API Call got Successful with Status Code 204
    And Ending TestCase

    Examples: 
      | name    | description                     |
      | descOne | This is Data Driven Test Repo 1 |
      | kevin   | This is Data Driven Test Repo 2 |
      | winner  | This is Data Driven Test Repo 3 |
      
      
      
      
      
	#@API_Validation
  Scenario: Verify api request performs as expected GET Request
    Given Starting Test Case "Verify Create Repo API"
    When User calls GET API "https://reqres.in/api/users/2" GET Call
    And API GET Call got Successful with Status Code 200
    Then I should be able to validate response
    
    
    
    
    
