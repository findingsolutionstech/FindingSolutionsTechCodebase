package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompleteClass {

	
	
	WebDriver driver;

	public CheckoutCompleteClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[.='THANK YOU FOR YOUR ORDER']")
	private WebElement successMessage;

	@FindBy(xpath = " ")
	private WebElement passwordField;
	
	
	
	
	public void validateSuccessMessage() {
		Assert.assertEquals("THANK YOU FOR YOUR ORDER", successMessage.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
