package com.arunnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adacfeature", glue = "com.stepdefinition"
//	,plugin= {"pretty","html:Reports/Cucumber_Report", "json:Reports/Cucumber.json" 
//			,"com.cucumber.listener.ExtentCucumberFormatter:Reports/Cucumber.html" }  
)
public class TestRunner extends BaseClass {
public static WebDriver driver;

 @BeforeClass
 public static void setup() {
//	 browserlaunch("chrome");	 
 }
 
 @AfterClass
 public static void  setdown() {
//	 driver.close();
 }
 
}