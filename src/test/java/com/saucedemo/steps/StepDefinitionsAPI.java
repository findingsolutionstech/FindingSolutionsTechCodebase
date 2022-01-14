package com.saucedemo.steps;

import com.saucedemo.pages.TestDataBuilder;
import com.saucedemo.utils.BaseClass;
import com.saucedemo.utils.RestLogger;
import com.saucedemo.utils.Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//import resource.TestDataBuilder;
//import resource.commonutils.RestLogger;
//import resource.commonutils.utils;

public class StepDefinitionsAPI extends BaseClass {

	ObjectMapper objectMapper;
	Response response;
	JsonPath jsonPath;
	TestDataBuilder data = new TestDataBuilder();

	public String payload;

	@Given("Starting Test Case {string}")
	public void starting_test_case(String testcase_name) {

		RestLogger.initLogger();
		RestLogger.startTestCase(testcase_name);
		
		
		
		
		
		
	}

	@Then("Ending TestCase")
	public void ending_test_case() {

		RestLogger.endTestCase();
	}
	
	
	

	@Given("Create Repo Payload name {string} amd description {string}")
	public void create_repo_payload_name_amd_description(String name, String description)
			throws JsonProcessingException {

		objectMapper = new ObjectMapper();
		payload = objectMapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(data.createRepoPayload(name, description));
	}

//	@Given("Create Repo Payload")
//	public void create_repo_payload() throws JsonProcessingException {
//	    // Write code here that turns the phrase above into concrete actions
//	    objectMapper = new ObjectMapper();
//	    payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data.createRepoPayload());
//	}

	@When("User calls Create API {string} Post API Call")
	public void user_calls_post_api_call(String resourcePath) {

		response = postRequest(resourcePath, payload);
	}

	@Then("API Call got Successful with Status Code {int}")
	public void api_call_got_successful_with_status_code(int status_code) {

		assertEquals(status_code, response.getStatusCode());
		RestLogger.info("Status Code Verification is Done.... ");
	}

	@When("User calls Delete API {string} Delete Call")
	public void user_calls_delete_api_delete_call(String resource_path) {

		response = deleteRequest(resource_path, data.getRepoName());
		RestLogger.info("Delete Request Status Code is - " + response.getStatusCode());
	}

	@Then("Verify Repository {string} is {string}")
	public void verify_created(String response_key, String repo_name) {

		jsonPath = new JsonPath(response.getBody().asString());
		String key_value = jsonPath.get(response_key);
		assertEquals(repo_name, key_value);
		RestLogger.info("Actual repo Name - " + key_value);
		RestLogger.info("Expected repo Name - " + repo_name);
	}

	@When("User calls GET API {string} GET Call")
	public void user_calls_GET_api_GET_call(String resource_path) {

		response = BaseClass.getRequest(resource_path);
		
		RestLogger.info("Get Request Status Code is - " + response.getStatusCode());
 
	}
	
	
	

	@And("API GET Call got Successful with Status Code {int}")
	public void API_GET_Call_got_Successful_with_Status_Code(int status_code) {
	    
		assertEquals(status_code, response.getStatusCode());
		System.out.println(response.getBody().asString());
	}
	
	
	

}
