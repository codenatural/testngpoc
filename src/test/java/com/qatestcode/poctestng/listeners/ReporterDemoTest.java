package com.qatestcode.poctestng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReporterDemoTest{
	
	   @Test
	   public void firstMethod() {
		   System.out.println("First Method");
	      Assert.assertTrue(true);
	   }
		  
	   @Test
	   public void secondMethod() {
		  System.out.println("Second Method");
	      Assert.assertTrue(false);
	   }
		  
	   @Test(dependsOnMethods = {"firstMethod"})
	   public void thirdMethod() {
		  System.out.println("Third Method");
	      Assert.assertTrue(true);
	   }
}
