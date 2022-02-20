package com.qatestcode.poctestng.flow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassTwo {
	

	@BeforeClass
	void beforeTestClassTwo() {
		System.out.println("CH This is B4 Test Class TWO");
	}
	
	@AfterClass
	void afterTestClassOne() {
		System.out.println("CH This is AFTER Test Class TWO");
	}
	
	@BeforeMethod(alwaysRun=true,onlyForGroups= {"smoke"})
	void beforeMethod() {
		System.out.println("CH This is B4 Method Test Class TWO");
	}
	
	@AfterMethod(alwaysRun=true,onlyForGroups= {"smoke"})
	void afterMethod() {
		System.out.println("CH This is AFTER Method Test Class TWO");
	}
	
	@Test(groups= {"smoke","regression"})
	void classTwoTest001() {
		System.out.println("CH This is Class Two Test 001");
	}
	
	@Test(groups= {"smoke"})
	void classTwoTest002() {
		System.out.println("CH This is Class Two Test 002");
	}
	
	@Test(groups= {"regression"})
	void classTwoTest003() {
		System.out.println("CH This is Class Two Test 003");
	}
	
	@Test
	void classTwoTest004() {
		System.out.println("CH This is Class Two Test 004");
	}

}
