package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOverviewPage {

	public WebDriver driver;

	public CheckOverviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//button[@id='finish']")
	private WebElement chkOutOverviewfinishButton;

	public void clickingChkOutOverviewfinishBtn() {
		chkOutOverviewfinishButton.click();
	}

	
	
	
	public void quitPage() {
		driver.quit();
	}
}
