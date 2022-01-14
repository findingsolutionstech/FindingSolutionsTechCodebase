package com.saucedemo.utils;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {

	

	
	RequestSpecification reqSpecification;
	Response response;

	String bearer_token = "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";
 
	String base_URI = "https://reqres.in/api";
 	
	
	
	public Response postRequest(String resourcePath, String payload) {
		RestLogger.info("Base URI is - " + base_URI);
		RestLogger.info("Resource Path is - " + resourcePath);
		RestLogger.info("Request Payload is - " + payload);
		reqSpecification = RestAssured.given().body(payload);
		reqSpecification.contentType(ContentType.JSON);
		reqSpecification.header("Authorization", "Bearer " + bearer_token);
		response = reqSpecification.post(base_URI + resourcePath);
		RestLogger.info("Respose of Requst is - " + response.getBody().asString() );
		return response;
	}

	
	public Response deleteRequest(String resourcePath, String repo_name) {
		String requestURI = base_URI + resourcePath + repo_name;
		RestLogger.info("Delete URI is - " + requestURI );		
		reqSpecification = RestAssured.given();
		reqSpecification.contentType(ContentType.JSON);
		reqSpecification.header("Content-Type", "application/json");
		reqSpecification.header("Authorization", "Bearer " + bearer_token);
		response = reqSpecification.delete(requestURI);
		return response;
	}
	
	
	
	/*
	public Response getRequest(String resourcePath) {
		String requestURI = base_URI + resourcePath;
		RestLogger.info("GET URI is - " + requestURI );		
		reqSpecification = RestAssured.given();
		reqSpecification.contentType(ContentType.JSON);
		reqSpecification.header("Content-Type", "application/json");
		reqSpecification.header("Authorization", "Bearer " + bearer_token);
		response = reqSpecification.get(requestURI + resourcePath);
		return response;
	}
	
	*/
	
	
	
	
	
	
	
}
