package com.qatestcode.poctestng.listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*TestNG listeners are the piece of code that listens
to the events occurring in the TestNG.
If the event matches the event for which we want the listener
to listen, it executes the code, which ultimately results in modifying 
the default behavior of TestNG. 
example, we want to print the exception error onto the reports only if the test fails. 
Here, we can apply a TestNG listener that will listen to the event of 
"failing of test case" and when it does, it will log the error.
*/

@Listeners(ITestListenerClass.class)
public class ListenerDemoTestAtClassLevel {

	@Test
	void testLogin() {
		Reporter.log("Check If Login Page is Present");
		System.out.println("Login Page is Present");
		Reporter.log("Check Page Load Time");
		System.out.println("Validated Page Load Successfully");
	}

	@Test
	void testHome() {
		Reporter.log("Check If Home Page is Present");
		System.out.println("Home Page is Present");
		Reporter.log("Check Page Load Time");
		System.out.println("Validated Page Load Successfully");
	}

	@Test
	void testPing() {
		Reporter.log("Check Page Ping");
		throw new ArithmeticException();
		// System.out.println("Ping Page is Present");
	}

	@Test
	void testOrders() {
		Reporter.log("Check Orders Page");
		throw new SkipException("Orders will be skipped");
		// System.out.println("Ping Page is Present");
	}

	@Test
	void testCart() {
		Reporter.log("Check Cart Page");
		// System.out.println("Ping Page is Present");
	}

	@Test(successPercentage = 60, invocationCount = 3) // Failing Within Success
	public void AccountTest() {
		int i = 0;
		if (i < 2) {
			Assert.assertEquals(i, i);
			i++;
		}
	}
}
