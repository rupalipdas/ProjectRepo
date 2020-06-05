package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.HRMCommonMethods.HrmAllMethods;

public class HrmTngAdminCallMethod {
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
		public void admin()
{
	am.clickbyxpath("//*[@id=\'menu_admin_viewAdminModule\']");

	am.clickbyxpath("//*[@id=\'menu_admin_UserManagement\']");

	am.enterbyid("searchSystemUser_userName", "thomas fleming");

	am.clickbyxpath("//input[@id='searchBtn']");

}
@AfterTest
		public void terminateBrowser(){
    driver.close();
}  

	
}





