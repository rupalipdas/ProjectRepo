package com.TestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.HRMCommonMethods.HrmAllMethods;

	public class HrmTngPimCallMethod {
	WebDriver driver;
	HrmAllMethods am = new HrmAllMethods();
	
@BeforeTest
	public void insertapp() {
		am.insertapp("https://opensource-demo.orangehrmlive.com/");
}
@Test(priority=1)
	public void login() {
		am.enterbyid("txtUsername", "Admin");
		am.enterbyid("txtPassword", "admin123");
		am.clickbyxpath("//*[@id='btnLogin']");
}
@Test(priority=2)
	public void PIM() throws IOException {
		am.clickbyxpath("//b[contains(text(),'PIM')]");
		am.clickbyxpath("//input[@id='btnAdd']");
		am.takesnap("C:\\Selenium Library\\S2020\\Screenshot\\File1.png");
		am.enterbyid("firstName", "Pawan");
}
@AfterTest
public void terminateBrowser(){
    driver.close();
}

	}
