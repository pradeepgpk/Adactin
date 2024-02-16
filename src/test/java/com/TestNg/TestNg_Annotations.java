
package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotations {
public WebDriver driver;
@BeforeSuite
public void setUp() {
	System.out.println("setproperty");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\JAVA\\Data_Driven\\Folders\\chromedriver.exe" );
	driver = new ChromeDriver();
}
@BeforeTest
public void browserlaunch() {
//	System.out.println("chrome");
	driver.get("");
	
}
@BeforeClass
public void launchUrl() {
	System.out.println("url of Amazon");
}
@BeforeMethod
public void login() {
	System.out.println("login");
	
}
@Test
public void searchLaptop() {
	System.out.println("HP");
}

@Test
public void searchMobile() {
	System.out.println("Apple");
}
@AfterMethod
public void validation() {
	System.out.println("validation");
}
@AfterClass
public void logout() {
	System.out.println("logout");
}
@AfterTest
public void deleteCookies() {
	System.out.println("delete");
}
@AfterSuite
public void closebrowser() {
	System.out.println("close browser");
}
}
