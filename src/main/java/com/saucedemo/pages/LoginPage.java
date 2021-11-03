package com.saucedemo.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement userNameField;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement loginButton;

	public void getBrowser() {
		driver.get("https://www.saucedemo.com/");
	}

	public void sendValidUserName(String username) {
		userNameField.sendKeys(username);
	}

	public void sendValidPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
		
	}

	public void validateLoginPageTitle() {

		String title = driver.getTitle().toString();

		Assert.assertEquals("Swag Labs", title);

	}

}