package com.qatestcode.poctestng.flow;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGAnnotationsDemo {
	
	@BeforeSuite(alwaysRun=true)
	void beforeSuite() {
		System.out.println("This is B4 SUITE");
	}
	
	@AfterSuite(alwaysRun=true)
	void afterSuite() {
		System.out.println("This is AFTER SUITE");
	}
	
	@BeforeTest(alwaysRun=true)
	void beforeTest() {
		System.out.println("This is B4 Test - NOT @BeforeMethod");
	}
	
	@AfterTest(alwaysRun=true)
	void afterTest() {
		System.out.println("This is AFTER Test- NOT @AfterMethod");
	}

	
	@BeforeGroups(alwaysRun=true)
	void beforeGroups() {
		System.out.println("This is B4 Groups");
	}
	
	@AfterGroups(alwaysRun=true)
	void afterGroups() {
		System.out.println("This is AFTER Groups");
	}
	
}
