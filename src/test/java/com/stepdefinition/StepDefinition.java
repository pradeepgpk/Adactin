package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.aventstack.extentreports.gherkin.model.Scenario;
import com.baseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;
import com.pom.*;

import cucumber.api.Scenario;
//import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	public  WebDriver driver;

	PageObjectManager pom = new PageObjectManager(driver);
	

	@Before
	public void setup() {
		browserlaunch("chrome");
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {

			printScreen("Adactin");
			
			closebrowser();
		}
	}

	@Given("^launch The Adactin Hotal Booking Application Url$")
	public void launch_The_Adactin_Hotal_Booking_Application_Url() throws Throwable {
		maximize();
		launchurl("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username \"([^\"]*)\"In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field(String username) throws Throwable {
		sendValues(pom.getLoginbutton().getUsername(), username);
	}

	@When("^user Enter The password \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_password_In_The_Password_Field(String password) throws Throwable {
		sendValues(pom.getLoginbutton().getPassword(), password);
	}

	@Then("^user Click The Loginbutton and To Check The Search Hotal Page$")
	public void user_Click_The_Loginbutton_and_To_Check_The_Search_Hotal_Page() throws Throwable {
		clickOnElement(pom.getLoginbutton().getLogin());
	}

	@When("^select The Room Location$")
	public void select_The_Room_Location() throws Throwable {
		dropDownvlue(pom.getSearch().getHotallocation(), "Adelaide");

	}

	@When("^select The Hotel Name$")
	public void select_The_Hotel_Name() throws Throwable {
		dropDownIndex(pom.getSearch().getHotalname(), 2);
	}

	@When("^slect The Room Type$")
	public void slect_The_Room_Type() throws Throwable {

		dropDownIndex(pom.getSearch().getRoomtype(), 4);
	}

	@When("^select Number Of Rooms$")
	public void select_Number_Of_Rooms() throws Throwable {

		dropDownIndex(pom.getSearch().getRoomcount(), 4);
	}

	@When("^enter The Check In Date$")
	public void enter_The_Check_In_Date() throws Throwable {
		cleardata(pom.getSearch().getCheckindate());
		sendValues(pom.getSearch().getCheckindate(), "27/02/2024");
	}

	@When("^enter The Check Out Date$")
	public void enter_The_Check_Out_Date() throws Throwable {
		cleardata(pom.getSearch().getCheckoutdate());
		sendValues(pom.getSearch().getCheckoutdate(), "28/02/2024");
	}

	@When("^select Adults Per Room$")
	public void select_Adults_Per_Room() throws Throwable {

		dropDownIndex(pom.getSearch().getAdultscount(), 4);
	}

	@When("^select Children Per Room$")
	public void select_Children_Per_Room() throws Throwable {
		dropDownIndex(pom.getSearch().getChildrencount(), 2);
	}

	@Then("^user Click The Searchbutton and To Check The Select Hotal Page$")
	public void user_Click_The_Searchbutton_and_To_Check_The_Select_Hotal_Page() throws Throwable {
		clickOnElement(pom.getSearch().getSearchhotal());
	}

	@When("^user Should Click The Hotel Page$")
	public void user_Should_Click_The_Hotel_Page() throws Throwable {
		radiobutton(pom.getSelect().getSelecthotal());
	}

	@Then("^user Should Click The  Continue button$")
	public void user_Should_Click_The_Continue_button() throws Throwable {
		clickOnElement(pom.getSelect().getContinuehotal());
	}

	@When("^user Should Insert The First Name$")
	public void user_Should_Insert_The_First_Name() throws Throwable {
		sendValues(pom.getBooking().getFirstname(), "pradeep");
	}

	@When("^user Should Insert The Last Name$")
	public void user_Should_Insert_The_Last_Name() throws Throwable {
		sendValues(pom.getBooking().getLastname(), "bala");
	}

	@When("^user Should Insert The Billing Address$")
	public void user_Should_Insert_The_Billing_Address() throws Throwable {
		sendValues(pom.getBooking().getAddress(), "1/579 arakulam,palladam,tiruppur");
	}

	@When("^user Should Insert The Credit Card Number$")
	public void user_Should_Insert_The_Credit_Card_Number() throws Throwable {
		sendValues(pom.getBooking().getCardno(), "1234 5678 9012 3456");
	}

	@When("^user Should Select The Credit Card Type$")
	public void user_Should_Select_The_Credit_Card_Type() throws Throwable {

		dropDownIndex(pom.getBooking().getCardtype(), 2);
	}

	@When("^user Should Select The Expiry Date Month$")
	public void user_Should_Select_The_Expiry_Date_Month() throws Throwable {

		dropDownIndex(pom.getBooking().getExpmonth(), 9);
	}

	@When("^user Should Select The Expiry Date Year$")
	public void user_Should_Select_The_Expiry_Date_Year() throws Throwable {

		dropDownIndex(pom.getBooking().getExpyear(), 9);
	}

	@When("^user Should Insert The CVV Number$")
	public void user_Should_Insert_The_CVV_Number() throws Throwable {
		sendValues(pom.getBooking().getCvvnum(), "123");
	}

	@Then("^user Should Click The BookNow button$")
	public void user_Should_Click_The_BookNow_button() throws Throwable {

		clickOnElement(pom.getBooking().getBooknow());
	}

	@Then("^user Should Logout$")
	public void user_Should_Logout() throws Throwable {
		clickOnElement(pom.getLogout().getLogout());

	}

}
