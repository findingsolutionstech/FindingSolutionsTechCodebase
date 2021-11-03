package com.saucedemo.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.assertj.core.api.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	WebDriver driver;
	
	
	public ProductPage(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		
	}
	
	 
	
	/**
	 * Locating webElements productPagepage
	 */
	

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement productPageMenuIcon;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement productPageCart;

	@FindBy(xpath = "//span[@class='title']")
	private WebElement productPageTitle;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private WebElement productPageSauceLabsBackpackText;

	@FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")
	private WebElement productPageSauceLabsBackpackImage;
	
	

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement productPageSauceLabsBackpackAddToCart;

	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	private WebElement productPageSauceLabsBackpackRmvCart;

	@FindBy(xpath = "//*[.='Sauce Labs Bike Light']/div")
	private WebElement productPageSauceLabsBikeLightText;

	@FindBy(xpath = "//img[@alt='Sauce Labs Bike Light']")
	private WebElement productPageSauceLabsBikeLightImage;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement productPageSauceLabsBikeLightAddCart;

	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
	private WebElement productPageSauceLabsBikeLightRmvCart;

	@FindBy(xpath = "//*[.='Sauce Labs Bolt T-Shirt']/div")
	private WebElement productPageSauceLabsBoltT_ShirtText;

	@FindBy(xpath = "//img[@alt='Sauce Labs Bolt T-Shirt']")
	private WebElement productPageSauceLabsBoltT_ShirtImage;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement productPageSauceLabsBoltT_ShirtAddCart;

	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
	private WebElement productPageSauceLabsBoltT_ShirtAddRmvCart;

	@FindBy(xpath = "//*[.='Sauce Labs Fleece Jacket']/div")
	private WebElement productPageSauceLabsJacketText;

	@FindBy(xpath = "//img[@alt='Sauce Labs Fleece Jacket']")
	private WebElement productPageSauceLabsJacketImage;

	@FindBy(xpath = "//[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement productPageSauceLabsJacketAddCart;

	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")
	private WebElement productPageSauceLabsJacketRmvCart;

	@FindBy(xpath = "//*[.='Sauce Labs Onesie']/div")
	private WebElement productPageSauceLabsOnesieText;

	@FindBy(xpath = "//img[@alt='Sauce Labs Onesie']")
	private WebElement productPageSauceLabsOnesieImage;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement productPageSauceLabsOnesieAddCart;

	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
	private WebElement productPageSauceLabsOnesieRmvCart;

	@FindBy(xpath = "//*[.='Test.allTheThings() T-Shirt (Red)']/div")
	private WebElement productPageSauceRedT_ShirtText;

	@FindBy(xpath = "//img[@alt='Test.allTheThings() T-Shirt (Red)']")
	private WebElement productPageSauceRedT_ShirtImage;

	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement productPageSauceRedT_ShirtAddCart;
	
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	private WebElement productPageSauceRedT_ShirtRmvCart;
	
	
	/**
	 * location of footer social media icons
	 */
	
	@FindBy(xpath = "//*[.='Twitter']/a")
	private WebElement productPageTwitterIcon;

	@FindBy(xpath = "//*[.='Facebook']/a")
	private WebElement productPageFacebookIcon;
	
	@FindBy(xpath = "//button[@id='LinkedIn']")
	private WebElement productPageLinkedInIcon;
	
	
	
	
	/**
	 * Method actions productpage 
	 * 
	 */
	
	
	

	public void clickproductPageMenuIcon() {
		productPageMenuIcon.click();
	}

	public void clickproductPageCart() {
		productPageCart.click();
	}

	
	
	
	public void selectSauceLabsBackPack() {
		productPageSauceLabsBackpackText.click();
	} 
	
	
	public void clickProductPageCartIcon() {
		productPageCart.click();
	}
	
	
	
	
	/*
	


	

	public void clickSauceLabsBackImg() {

	}
	
	
	public void clickSauceLabsBackImg() {

	}

	public void clickSauceLabsBackImg() {

	}

	public void clickSauceLabsBackImg() {

	}

	public void clickSauceLabsBackImg() {

	}
	
	*/

}
