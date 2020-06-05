package com.TestNG;

import org.testng.annotations.Test;

public class DependsOnGroups {
	@Test (groups= {"smoketesting","sanitytesting"})
	public void login() {
		System.out.println("Login");
	}
	@Test (groups= {"smoketesting","regressiontesting"})
	public void search() {
		System.out.println("Search");
		
}
	@Test (groups= {"regressiontesting","retesting"}) 
		public void logut() {
			System.out.println("Logout");

}
}
