//package com.saucedemo.steps;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.saucedemo.pages.CheckOverviewPage;
//import com.saucedemo.pages.CheckoutCompleteClass;
//import com.saucedemo.pages.CheckoutInfoPage;
//import com.saucedemo.pages.LoginPage;
//import com.saucedemo.pages.ProductPage;
//import com.saucedemo.pages.RedTShirtProductPage;
//import com.saucedemo.pages.YourCartPage;
//import com.saucedemo.utils.ReadExcel;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DataDrivenValalidationStepDefinitions {
//
//	WebDriver driver;
//
//	LoginPage loginPage;
//
//	ProductPage productPage;
//	YourCartPage yourCartPage;
//	CheckoutInfoPage checkoutInfoPage;
//	CheckOverviewPage checkOverviewPage;
//
//	CheckoutCompleteClass checkoutCompleteClass;
//
//	RedTShirtProductPage redTShirtProductPage;
//
//	ReadExcel readExcel = new ReadExcel();
//
//	
//	
//	@Given("user navigates to saucelabs application")
//	public void user_navigates_to_saucelabs_application() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\ChromeDriver.exe");
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//		loginPage = new LoginPage(driver);
//		loginPage.getBrowser();
//	}
//	
//	
//	
//
//	@When("user enters first user name and password from excel sheet")
//	public void user_enters_first_user_name_and_password_from_excel_sheet() {
//
//		try {
//
//			loginPage.sendValidUserName(readExcel.getData("Sheet1", 1, 0));
//
//		} catch (IOException e) {
//
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	@When("user enters first user name row {int} column {int} from excel sheet {string}")
//	public void user_enters_first_user_name_row_column_from_excel_sheet(Integer rowNumber, Integer columnNumber,
//			String sheetName) {
//
//		try {
//
//			loginPage.sendValidUserName(readExcel.getData(sheetName, rowNumber, columnNumber));
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
//	}
//
//	@When("user enters first password row {int} column {int} from excel sheet {string}")
//	public void user_enters_first_password_row_column_from_excel_sheet(Integer rowNumber, Integer columnNumber,
//			String sheetName) {
//		try {
//
//			loginPage.sendValidPassword(readExcel.getData(sheetName, rowNumber, columnNumber));
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
//	}
//
//	@When("^user clicks the login button$")
//	public void user_clicks_the_login_button() {
//		loginPage.clickLoginButton();
//	}
//
////	@When("^user selects a red tshirt$")
////	public void user_selects_a_red_tshirt() {
////		redTShirtProductPage = new RedTShirtProductPage(driver);
////		redTShirtProductPage.addRedTShirtToCart();
////	}
//
////	@And("^navigates to cart from redtshirt product page$")
////	public void navigate_to_cart_from_redtshirt_product_page() {
////		redTShirtProductPage.navigateToCart();
////	}
//
////	@Then("^clicks checkout on your product page$")
////	public void clicks_checkout_on_your_product_page() {
////		yourCartPage = new YourCartPage(driver);
////		yourCartPage.clickingCheckoutButton();
////	}
//
//	@Then("enters first name {int} and {int} on contact info page from excel sheet {string}")
//	public void enters_first_name_and_on_contact_info_page_from_excel_sheet(Integer firstNameRow,
//			Integer firstNameColumn, String sheetName) {
//
//		try {
//
//			checkoutInfoPage = new CheckoutInfoPage(driver);
//			checkoutInfoPage.enteringFirstName(readExcel.getData(sheetName, firstNameRow, firstNameColumn));
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//	}
//
//	@Then("enters last name {int} and {int} from excel sheet {string}")
//	public void enters_last_name_and_from_excel_sheet(Integer lastNameRow, Integer lastNameColumn, String sheetName) {
//		try {
//			checkoutInfoPage.enteringLastNameField(readExcel.getData(sheetName, lastNameRow, lastNameColumn));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Then("user enters valid zip code {int} using data {int} from excel sheet {string}")
//	public void user_enters_valid_zip_code_using_data_from_excel_sheet(Integer zipRow, Integer zipCol,
//			String sheetName) {
//		try {
//			checkoutInfoPage.enteringPostalCodeField(readExcel.getData(sheetName, zipRow, zipCol));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
////	@Then("^clicks continue$")
////	public void clicks_continue() {
////		checkoutInfoPage.clickingContinue();
////
////	}
//
////	@Then("^clicks finish$")
////	public void clicks_finish() {
////		checkOverviewPage = new CheckOverviewPage(driver);
////		checkOverviewPage.clickingChkOutOverviewfinishBtn();
////		// checkOverviewPage.quitPage();
////
////	}
//
////	@Then("^user should see success message$")
////	public void user_should_see_success_message() {
////		checkoutCompleteClass = new CheckoutCompleteClass(driver);
////		checkoutCompleteClass.validateSuccessMessage();
////	}

//}
