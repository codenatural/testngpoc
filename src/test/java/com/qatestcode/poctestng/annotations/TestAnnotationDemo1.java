package com.qatestcode.poctestng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotationDemo1 {
	
	@Test(alwaysRun=true,dependsOnMethods= {"testAN002"})
	void testAN001() {
		System.out.println("Always Run , Test - testAN001 , depends on method testAN002");
	}
	
	@Test
	void testAN002() {
		System.out.println("Test - testAN002 - Failing This Method below");
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnMethods= {"testAN004"})
	void testAN003() {
		System.out.println("Test - testAN003 - depends on method testAN004");
	}
	
	@Test
	void testAN004() {
		System.out.println("Test - testAN004 - Failing This Method below");
		Assert.assertEquals(true, false);
	}
	
	@Test
	void testAN005() {
		System.out.println("Test - testAN005");
	}
	

}
