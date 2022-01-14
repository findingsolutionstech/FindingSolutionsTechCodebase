package com.saucedemo.steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class reqresAPICallsStepDefinitions {
	
	
	ObjectMapper objectMapper;
	RequestSpecification requestSpecification;
	Response response;
	JsonPath jsonPath;
	String base_URI= "https://reqres.in/";
	
	
	
	//Get request step definitions

	@Given("I submit a get request {string}")
	public void i_submit_a_get_request(String resourcePath) {
		
		
	
	response = RestAssured.given().when().get(base_URI+resourcePath);
	requestSpecification.contentType(ContentType.JSON);
	
	
	
 
	
	
 			//(base_URI + resourcePath);
		
 	System.out.println(response.getBody().asString());
		
	     
	}
	
	

	
	

	@Then("I should be able to validate response")
	public void i_should_be_able_to_validate_response() {
	    
	}
	
	
	

	//Post request step definitions
	
	@Given("I submit a post request")
	public void i_submit_a_post_request() {
	     
	}

	@Given("post request is accepted by server and returns {int} status code")
	public void post_request_is_accepted_by_server_and_returns__status_code(int status_code) {
		assertEquals(status_code, response.getStatusCode());

	}

	@Then("I should be able to validate post request")
	public void i_should_be_able_to_validate_post_request() {
	    
	}

	
	
	
	
	
	
	
	
	
}
