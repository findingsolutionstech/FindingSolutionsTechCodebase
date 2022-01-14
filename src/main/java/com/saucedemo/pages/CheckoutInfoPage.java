package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage {

	
	

	public WebDriver driver;
	

	public CheckoutInfoPage(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	/* xpath, 
	 * cssSelector, 
	 * className, 
	 * id, 
	 * linkedtext, 
	 * partiallinkedtext
	 * 
	 * tagName
	 */
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstNameField;

	
	
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastNameField;

	
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement infoPageContinueButton;

	
	
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement postalCodeField;

	
	
	public void enteringFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	
	
	
	public void enteringLastNameField(String lastname) {
		lastNameField.sendKeys(lastname);
	}
	
	
	
	public void enteringPostalCodeField(String zipcode) {	
		
		
		String converted = String.valueOf (zipcode);
		postalCodeField.sendKeys(converted);
	}
	
	
	
	
	public void clickingContinue() {
		infoPageContinueButton.click();
		
	}
	
	
	
	
	
	public void userCheckoutOnInfoPage(String firstname, String lastname,  String zipcode) {
		firstNameField.sendKeys(firstname);
		lastNameField.sendKeys(lastname);

		String converted = String.valueOf (zipcode);
		postalCodeField.sendKeys(converted);
		
		infoPageContinueButton.click();
	
	}
	
	
	
	
	
	
	
	
	
}
