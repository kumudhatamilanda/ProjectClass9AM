package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	
	@BeforeClass
	private void BeforeClass() {
		System.out.println("Mass ah");
	}
	
	@AfterClass
	private void AfterClass() {
		System.out.println("oiiii");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("getha ah");
	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("ohhhhh");
	}
	
	@Test()
	private void afterClass() {
		System.out.println("captain ah");
	}
	
}
