package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsuponMethod {
	@Test ()
	public void login() {
		System.out.println("Login");
	}
	@Test (dependsOnMethods="login")
	public void search() {
		System.out.println("Search");
		Assert.assertEquals("xyz", "abc");
}
	@Test (dependsOnGroups="search",alwaysRun=true) 
		public void logout() {
			System.out.println("Logout");

}
}