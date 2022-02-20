package com.qatestcode.poctestng.flow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassOne {

	@BeforeClass(alwaysRun=true)  // always run is needed if running in groups
	void beforeTestClassOne() {
		System.out.println("FF This is B4 Test Class ONE");
	}
	
	@AfterClass(alwaysRun=true)
	void afterTestClassOne() {
		System.out.println("FF This is AFTER Test Class ONE");
	}
	
	@BeforeMethod(alwaysRun=true)
	void beforeMethod() {
		System.out.println("FF This is B4 Method Test Class ONE");
	}
	
	@AfterMethod(alwaysRun=true)
	void afterMethod() {
		System.out.println("FF This is AFTER Method Test Class ONE");
	}
	
	@Test(groups= {"smoke","regression"})
	void classOneTest001() {
		System.out.println("FF This is Class One Test 001");
	}
	
	@Test(groups= {"smoke"})
	void classOneTest002() {
		System.out.println("FF This is Class One Test 002");
	}
	
	@Test(groups= {"regression"})
	void classOneTest003() {
		System.out.println("FF This is Class One Test 003");
	}
	
	@Test
	void classOneTest004() {
		System.out.println("FF This is Class One Test 004");
	}
}
