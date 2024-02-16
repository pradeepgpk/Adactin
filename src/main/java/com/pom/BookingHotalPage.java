package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotalPage {
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardno;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expmonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expyear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvnum;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknow;



	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public BookingHotalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
