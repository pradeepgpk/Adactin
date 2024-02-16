package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotalPage {

	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement hotallocation;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotalname;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomcount;
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkindate;
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkoutdate;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultscount;
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childrencount;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchhotal;


	public WebElement getHotallocation() {
		return hotallocation;
	}

	public WebElement getHotalname() {
		return hotalname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomcount() {
		return roomcount;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultscount() {
		return adultscount;
	}

	public WebElement getChildrencount() {
		return childrencount;
	}

	public WebElement getSearchhotal() {
		return searchhotal;
	}

	public SearchHotalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
