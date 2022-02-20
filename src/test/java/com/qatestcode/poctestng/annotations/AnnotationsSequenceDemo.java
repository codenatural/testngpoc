package com.qatestcode.poctestng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AnnotationsSequenceDemo {

	@Test(groups= "smoke")
	void testA001() {
		System.out.println("Method A001 - SMOKE Test");
	}
	
	@Test(groups= {"E2E","regression"},dependsOnGroups= {"smoke"})
	void testA002() {
		System.out.println("Method A002 (E2E and Regression Test), Depends on Group : SMOKE");
	}
	
	@Test(groups="smoke")
	void testA003() {
		Assert.assertEquals(true, false); // Fail this method, so that dependant case is not executed
		System.out.println("Method A003 - SMOKE Test");
	}
	
	@Test(groups="smoke",dependsOnMethods= {"testA003"})
	void testA004() {
		System.out.println("Method A004 - SMOKE Test, Depends on Methods : testA003");
	}
	
}
