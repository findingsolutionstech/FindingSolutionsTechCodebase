package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankingApplicationLoginPage {

	

	WebDriver driver;

	public BankingApplicationLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h4[@class='auth-header']")
	private WebElement loginPageHeader;

	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;
	
	
	
	
	public void validateLoginPage() {
		Assert.assertEquals(true, loginPageHeader.isDisplayed());
	}
	
	public void validatePageTitle() {
		Assert.assertEquals("ACME demo app", driver.getTitle());
	}
	
	public void validateHeaderText() {
		Assert.assertEquals("Login Form", loginPageHeader.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
}
