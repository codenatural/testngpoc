package com.qatestcode.poctestng.flow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassThree {

	@BeforeClass
	void beforeTestClassThree() {
		System.out.println("SAF This is B4 Test Class Three");
	}
	
	@AfterClass
	void afterTestClassThree() {
		System.out.println("SAF This is AFTER Test Class Three");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("SAF This is B4 Method Test Class Three");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("SAF This is AFTER Method Test Class Three");
	}
	
	@Test(groups= {"smoke","regression"})
	void classThreeTest001() {
		System.out.println("SAF This is Class Three Test 001");
	}
	
	@Test(groups= {"smoke"})
	void classThreeTest002() {
		System.out.println("SAF This is Class Three Test 002");
	}
	
	@Test(groups= {"regression"})
	void classThreeTest003() {
		System.out.println("SAF This is Class Three Test 003");
	}
	
	@Test
	void classThreeTest004() {
		System.out.println("SAF This is Class Three Test 004");
	}
}
