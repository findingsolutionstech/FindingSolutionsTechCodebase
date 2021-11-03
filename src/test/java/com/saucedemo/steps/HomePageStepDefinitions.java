package com.saucedemo.steps;

import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pages.LoginPage;

public class HomePageStepDefinitions {

   
	WebDriver driver;
	
	LoginPage homepage = new LoginPage(driver);
  

    @Given("open browser")
    public void open_browser() {
    	homepage.getBrowser();
 
    }

    @Given("do something")
    public void do_something(String username) {
    	homepage.sendValidUserName(username);
    }

    @When("I add do something {string}")
    public void I_add_do_something(String password) {
    	homepage.sendValidPassword(password);

    }

    @Then("the I verify something")
    public void the_I_verify_something( ) {
    	homepage.clickLoginButton();

    }

}
