package com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		
		
		features="src/test/resources/features/", 
		
		tags = "@SmokeTest",
		
		
		glue="com.saucedemo.steps")






public class cukksrunner {}
