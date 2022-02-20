package com.qatestcode.poctestng.listeners;

import org.testng.ITestContext; // Relating to Test Run and Environment Variables
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * This Class Defines ITTestListener Interface, Listeners can be implemented at
 * class level or at suite level in testng.xml
 */
public class ITestListenerClass implements ITestListener {

	// Class Level

	/**
	 * onStart: This method invokes when the test class is instantiated and before
	 * executing any test method.
	 */
	public void onStart(ITestContext context) {
		System.out.println("On Start Host :" + context.getHost());
	}

	/**
	 * onFinish: This method invokes when all the test methods have run, and calling
	 * of all of their configuration methods happens.
	 */
	public void onFinish(ITestContext context) {
		System.out.println("On Finish O/P Directory :" + context.getOutputDirectory());
	}

	// Test Case Level

	/**
	 * onTestStart: This method invokes every time a test method is called and
	 * executed.
	 */
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Started: " + result.getName());
	}

	/**
	 * onTestSuccess: This method is invoked every time a test case passes
	 * (succeeds).
	 */
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success : " + result.getName());
	}

	/** onTestFailure: This method invokes every time a test case fails. */
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failure: " + result.getName());
	}

	/** onTestSkipped: This method invokes every time a test skips. */
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped: " + result.getName());
	}

	/**
	 * onTestFailedButWithinSuccessPercentage: This method invokes when the test
	 * method fails as a whole but has passed a certain success percentage, which is
	 * defined by the user.
	 */
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Case Pass/Failed with certain percentage: " + result.getName());
	}

}
