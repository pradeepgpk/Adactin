package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.BookingHotalPage;
import com.pom.LoginPage;
import com.pom.LogoutPage;
import com.pom.SearchHotalPage;
import com.pom.SelectHotalPage;

public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	private LoginPage loginbutton;

	private SelectHotalPage select;

	private BookingHotalPage booking;

	private LogoutPage logout;

	private SearchHotalPage search;

	public LoginPage getLoginbutton() {
		loginbutton = new LoginPage(driver);
		return loginbutton;
	}

	public SearchHotalPage getSearch() {
		search = new SearchHotalPage(driver);
		return search;
	}

	public SelectHotalPage getSelect() {
		select = new SelectHotalPage(driver);
		return select;
	}

	public BookingHotalPage getBooking() {
		booking = new BookingHotalPage(driver);
		return booking;
	}

	public LogoutPage getLogout() {
		logout = new LogoutPage(driver);
		return logout;
	}

}
