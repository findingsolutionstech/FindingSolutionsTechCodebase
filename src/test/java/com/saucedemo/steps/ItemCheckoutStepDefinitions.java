package com.saucedemo.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pages.ProductPage;
import com.saucedemo.pages.YourCartPage;
import com.saucedemo.pages.CheckOverviewPage;
import com.saucedemo.pages.CheckoutCompleteClass;
import com.saucedemo.pages.CheckoutInfoPage;
import com.saucedemo.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class ItemCheckoutStepDefinitions {
//	
//	public WebDriver driver;
//	
	
//	LoginPage loginPage;
//	ProductPage productPage;
//	YourCartPage yourCartPage;
//	CheckoutInfoPage checkoutInfoPage;
//	CheckOverviewPage checkOverviewPage;
//	CheckoutCompleteClass checkoutCompleteClass;
	
//	@Given("user navigates to saucelabs application")
//	public void user_navigates_to_saucelabs_application() {
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\ChromeDriver.exe");
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//        loginPage = new LoginPage(driver);
//        loginPage.getBrowser();
//	}
	
	
//	@Then("validate expected title as basic user")
//	public void validate_expected_title_as_basic_user() {
//		loginPage.validateLoginPageTitle();
//	}

/*
	@When("user enters valid (.*) username")
	public void user_enters_valid_username(String username) {
		loginPage.sendValidUserName(username);
	}
	*/

//	@When("user enters standard (.*) user password")
//	public void user_enters_standard_user_password(String password) {
//		loginPage.sendValidPassword(password);
//	}

//	@When("user clicks login")
//	public void user_clicks_login() {
//		loginPage.clickLoginButton();
//	}

//	@When("user selects and item")
//	public void user_selects_and_item() {
//		productPage  = new ProductPage(driver);
//		productPage.selectSauceLabsBackPack();
//	}

//	@Then("navigate to cart for checkout")
//	public void navigate_to_cart_for_checkout() {
//		productPage.clickProductPageCartIcon();
//	}
//
//	@Then("clicks checkout")
//	public void clicks_checkout() {
//		yourCartPage = new YourCartPage(driver);
//		yourCartPage.clickingCheckoutButton();
//	}
//
//	@Then("enters first name (.*) first name on contact info page")
//	public void enters_first_name_(String firstname) {
//		checkoutInfoPage = new CheckoutInfoPage(driver);
//		checkoutInfoPage.enteringFirstName(firstname);
//	}
//
//	@Then("enters last name {string}")
//	public void enters_last_name(String lastname) {
//		checkoutInfoPage.enteringLastNameField(lastname);
//	}
//	
//	
//	@Then("user enters valid postal code")
//	public void user_enters_valid_postal_code() {
//		checkoutInfoPage.enteringPostalCodeField();
//	}
//	
//	
//
//	@Then("clicks continue")
//	public void clicks_continue() {
//		checkoutInfoPage.clickingContinue();
//	
//	}
//
//	@Then("clicks finish")
//	public void clicks_finish() {
//		checkOverviewPage = new CheckOverviewPage(driver);
//		checkOverviewPage.clickingChkOutOverviewfinishBtn();
//		//checkOverviewPage.quitPage();	
//	}
//
//	
//	
//	@Then("user should see success message")
//	public void user_should_see_success_message() {
//		checkoutCompleteClass = new CheckoutCompleteClass(driver);
//		checkoutCompleteClass.validateSuccessMessage();
//	}
//	
//	
//	
//	
//	/*
//	
//	
//	@When("user enters {string} password")
//	public void user_enters_password(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	
//	
//	@Then("enters {string} first name")
//	public void enters_first_name(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//*/
//	
//	
//	
//	@Then("user enters valid \"(.*)\" postal code")
//	public void user_enters_valid_postal_code(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	
//
//}
