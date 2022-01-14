package com.saucedemo.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pages.CheckOverviewPage;
import com.saucedemo.pages.CheckoutCompleteClass;
import com.saucedemo.pages.CheckoutInfoPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.pages.RedTShirtProductPage;
import com.saucedemo.pages.YourCartPage;
import com.saucedemo.utils.ConfigurationReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicUserSingleItemCheckoutStepDefinitions {

	WebDriver driver;

	LoginPage loginPage;
	ProductPage productPage;
	YourCartPage yourCartPage;
	CheckoutInfoPage checkoutInfoPage;
	CheckOverviewPage checkOverviewPage;
	CheckoutCompleteClass checkoutCompleteClass;
	RedTShirtProductPage redTShirtProductPage;

	
	/**
	@Given("user navigates to saucelabs application")
	public void user_navigates_to_saucelabs_application() {
		System.setProperty(ConfigurationReader.getProperty("chrome"), System.getProperty(ConfigurationReader.getProperty("driver.local.chrome")));
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		loginPage = new LoginPage(driver);
		loginPage.getBrowser();
		
	}
	*/
 	
 	 
	
	@Then("^basic user validate expected title as basic user$")
	public void basic_user_validate_expected_title_as_basic_user() {
		loginPage = new LoginPage(driver);

		loginPage.validateLoginPageTitle();
	}
	
	

	@When("basic user enters valid username {string} as a basic user")
	public void basic_user_enters_valid_username_as_a_basic_user(String username) {
		loginPage = new LoginPage(driver);
		loginPage.sendValidUserName(username);
	}

	@When("basic user enters standard {string} user password")
	public void basic_user_enters_standard_user_password(String password) {
		loginPage.sendValidPassword(password);
	}

	@When("^basic user clicks login$")
	public void basic_user_clicks_login() {
		loginPage.clickLoginButton();
	}

	@When("^basic user selects a red tshirt$")
	public void basic_user_selects_a_red_tshirt() {
		productPage  = new ProductPage(driver);
 		redTShirtProductPage = new RedTShirtProductPage(driver);
		redTShirtProductPage.addRedTShirtToCart();
	}

	@And("^basic user navigates to cart from redtshirt product page$")
	public void basic_user_navigates_to_cart_from_redtshirt_product_page() {
		redTShirtProductPage.navigateToCart();
	}

	@Then("^basic user clicks checkout on your product page$")
	public void basic_user_clicks_checkout_on_your_product_page() {
		yourCartPage = new YourCartPage(driver);
		yourCartPage.clickingCheckoutButton();
	}

	@Then("basic user enters {string} first name on contact info page")
	public void basic_user_enters_first_name_on_contact_info_page(String firstname) {
		checkoutInfoPage = new CheckoutInfoPage(driver);
		checkoutInfoPage.enteringFirstName(firstname);
	}

	@Then("basic user enters last name {string}")
	public void basic_user_enters_last_name(String lastname) {
		checkoutInfoPage.enteringLastNameField(lastname);
	}

	@Then("basic user enters valid {string} postal code")
	public void basic_user_user_enters_valid_postal_code(String zipcode) {
		checkoutInfoPage.enteringPostalCodeField(zipcode);
	}

	@Then("^basic user clicks continue$")
	public void basic_user_clicks_continue() {
		checkoutInfoPage.clickingContinue();

	}

	@Then("^basic user_clicks finish$")
	public void basic_user_clicks_finish() {
		checkOverviewPage = new CheckOverviewPage(driver);
		checkOverviewPage.clickingChkOutOverviewfinishBtn();		
	}

	@Then("^basic user should see success message$")
	public void basic_user_should_see_success_message() {
		checkoutCompleteClass = new CheckoutCompleteClass(driver);
		checkoutCompleteClass.validateSuccessMessage();
	}
	
	

}
