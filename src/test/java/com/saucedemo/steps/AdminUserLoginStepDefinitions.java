//package com.saucedemo.steps;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.EncryptedDocumentException;
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
//import com.saucedemo.utils.ExcelUtils;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class AdminUserLoginStepDefinitions {
//
//	WebDriver driver;
//
//	LoginPage loginPage;
//	ProductPage productPage;
//	YourCartPage yourCartPage;
//	CheckoutInfoPage checkoutInfoPage;
//	CheckOverviewPage checkOverviewPage;
//	CheckoutCompleteClass checkoutCompleteClass;
//	RedTShirtProductPage redTShirtProductPage;
//
//	ExcelUtils excelUtils = new ExcelUtils();
//
////	@Given("user navigates to saucelabs application")
////	public void user_navigates_to_saucelabs_application() {
////		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\ChromeDriver.exe");
////		driver = new ChromeDriver();
////
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////
////		loginPage = new LoginPage(driver);
////		loginPage.getBrowser();
////	}
//
//	@When("admin user completes login fields using sheetname {string} with rownumber {int}")
//	public void admin_user_completes_login_fields_using_sheetname_with_rownumber(String sheetName, Integer rowNumber)
//			throws EncryptedDocumentException, IOException {
//
//		List<Map<String, String>> testData = excelUtils
//				.getData("C:\\Users\\Kevin\\FindingSolutions\\serenity\\Excel\\testdata.xlsx", sheetName);
//
//		String userName = testData.get(rowNumber).get("username");
//		String password = testData.get(rowNumber).get("password");
//
//		loginPage.sendValidUserName(userName);
//		loginPage.sendValidPassword(password);
//
//	}
//
////	@When("admin user clicks the login button")
////	public void admin_user_clicks_the_login_button() {
////
////		loginPage.clickLoginButton();
////
////	}
//
//}
