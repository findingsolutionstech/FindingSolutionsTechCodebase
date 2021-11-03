package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedTShirtProductPage {
	
	

	public WebDriver driver;

	public RedTShirtProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	

	@FindBy(xpath = "//*[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement redTShirtText;
	
	

	public void addRedTShirtToCart() {
		redTShirtText.click();		
	}
	
	
	public void navigateToCart() {
		cartIcon.click();
	}

}
