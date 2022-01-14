package com.saucedemo.steps;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import io.restassured.*;






public class APICalls {
	
	
	//@Test
	public void Test1() {
		
		Response response = get("https://ergast.com/api/f1/2010/circuits");
		
		int statusCode = response.getStatusCode();
		
		
		String body = response.getBody().asString();

		
		//System.out.println(body);
		
		
		System.out.println("Status line here --- > "  + response.getStatusLine());
		System.out.println("Response header here --- > " + response.getHeader("content-type"));
		System.out.println("Response time here --- > " + response.getTime());
		
		
		
		
		
		
		
		
		
		
		
		Assert.assertEquals(statusCode, 200);
		
	}
	
	
	
	
	
	

}
