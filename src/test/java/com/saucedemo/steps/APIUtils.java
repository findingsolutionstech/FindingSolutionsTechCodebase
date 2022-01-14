package com.saucedemo.steps;

import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class APIUtils {

	
	RequestSpecification reqSpecification;
	
	Response response; 
	
	
	String base_URI="https://reqres.in/";
	
	
	public Response postRequest(String resoucePath, String payload) {
		reqSpecification = RestAssured.given().body(payload);
		reqSpecification.contentType(ContentType.JSON);
		response = reqSpecification.post(base_URI + resoucePath);	
		
		return response;
	}
	
	
	
	
	
	public Response deleteRequest(String resoucePath) {
		RequestSpecification reqSpecification = RestAssured.given();
		
		String requstURI = base_URI + resoucePath;
		
		reqSpecification.contentType(ContentType.JSON);
		reqSpecification.header("ContentType", "application/json");
		
		response = reqSpecification.delete(requstURI);
		
		return response;
	}
	
	
}
