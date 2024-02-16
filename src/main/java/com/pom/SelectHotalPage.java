package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotalPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement selecthotal;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuehotal;

	public WebElement getSelecthotal() {
		return selecthotal;
	}

	public WebElement getContinuehotal() {
		return continuehotal;
	}



	
	
	public SelectHotalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
