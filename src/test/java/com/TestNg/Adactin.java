package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;

public class Adactin extends BaseClass{
	
	static PageObjectManager pom;
	 
	@BeforeTest
	public void setUp() {
		browserlaunch("chrome");
	}
	
	@BeforeClass
	public void browserlaunch() {
		launchurl("https://adactinhotelapp.com/");
		
	}
	
	@BeforeMethod
	public void login() {
		 pom = new PageObjectManager(driver);
		sendValues(pom.getLoginbutton().getUsername(), "Dinesh1993");
		sendValues(pom.getLoginbutton().getPassword(), "811BWB");
		clickOnElement(pom.getLoginbutton().getLogin());
	}
	
	@Test
	public void searchHotal() {
		dropDownvlue(pom.getSearch().getHotallocation(), "Adelaide");
		dropDownIndex(pom.getSearch().getHotalname(), 2);
		dropDownIndex(pom.getSearch().getRoomtype(), 4);
		dropDownIndex(pom.getSearch().getRoomcount(), 4);
		cleardata(pom.getSearch().getCheckindate());
		sendValues(pom.getSearch().getCheckindate(), "27/02/2024");
		cleardata(pom.getSearch().getCheckoutdate());
		sendValues(pom.getSearch().getCheckoutdate(), "28/02/2024");
		dropDownIndex(pom.getSearch().getAdultscount(), 4);
		dropDownIndex(pom.getSearch().getChildrencount(), 2);
		clickOnElement(pom.getSearch().getSearchhotal());
		radiobutton(pom.getSelect().getSelecthotal());
		clickOnElement(pom.getSelect().getContinuehotal());
		sendValues(pom.getBooking().getFirstname(), "pradeep");
		sendValues(pom.getBooking().getLastname(), "bala");
		sendValues(pom.getBooking().getAddress(), "1/579 arakulam,palladam,tiruppur");
		sendValues(pom.getBooking().getCardno(), "1234 5678 9012 3456");
		dropDownIndex(pom.getBooking().getCardtype(), 2);
		dropDownIndex(pom.getBooking().getExpmonth(), 9);
		dropDownIndex(pom.getBooking().getExpyear(), 9);
		sendValues(pom.getBooking().getCvvnum(), "123");
		clickOnElement(pom.getBooking().getBooknow());

	}
	@AfterClass
	public void logout() {
		clickOnElement(pom.getLogout().getLogout());
	}
	@AfterSuite
	public void closeBrowser() {
		closebrowser();
	}

}
