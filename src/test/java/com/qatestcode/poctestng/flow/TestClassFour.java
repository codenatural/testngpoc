package com.qatestcode.poctestng.flow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassFour {

	@BeforeClass
	void beforeTestClassFour() {
		System.out.println("EDGE This is B4 Test Class Four");
	}
	
	@AfterClass
	void afterTestClassFour() {
		System.out.println("EDGE This is AFTER Test Class Four");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("EDGE This is B4 Method Test Class Four");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("EDGE This is AFTER Method Test Class Four");
	}
	
	@Test(groups= {"smoke","regression"})
	void classFourTest001() {
		System.out.println("EDGE This is Class Four Test 001");
	}
	
	@Test(groups= {"smoke"})
	void classFourTest002() {
		System.out.println("EDGE This is Class Four Test 002");
	}
	
	@Test(groups= {"regression"})
	void classFourTest003() {
		System.out.println("EDGE This is Class Four Test 003");
	}
	
	@Test
	void classFourTest004() {
		System.out.println("EDGE This is Class Four Test 004");
	}
}
