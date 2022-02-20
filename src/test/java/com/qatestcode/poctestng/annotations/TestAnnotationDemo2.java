package com.qatestcode.poctestng.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAnnotationDemo2 {
		
	@Test(priority=0,description = "Login ARP Application", dataProvider = "loginData", dataProviderClass = TestAnnotationDemo2.class)
	void testLogin(String username, String password) {
		System.out.println("Entered username : " + username);
		System.out.println("Entered password : " + password);
		System.out.println("User Logged in Successfully ot ARP Application");
	}

	@Test(priority=1,description = "Dashboard - ARP Application")
	void testDashBoard() {
		System.out.println("Navigating to Application Dashboard");
	}

	@Test(priority=1,description = "Menu Navigation - ARP Application")
	void testNavigation() {
		System.out.println("Validating Page Navigation");
	}

	@Test(priority=2,description = "Order Page", expectedExceptions = { Exception.class })
	void testOrdersPage() {
		System.out.println("Orders Page is under development 404 Error");
		throw new ArithmeticException(); //
	}

	@Test(priority=3,description = "Form Fields", dataProvider = "BVA Text Field Data", dataProviderClass = TestAnnotationDemo2.class)
	void testFormFields(Object a, Object b, Object c) {
		System.out.println("Receiving Inputs");
		System.out.println("Input : " + a);
		System.out.println("Input : " + b);
		System.out.println("Input : " + c);
		System.out.println("***   ****   **** ");
	}

	@Test(priority=3,description = "Multiple Checkouts", invocationCount = 3)
	void testMultipleCheckout() {
		System.out.println("Checkout - Invocation Count - 3");
	}

	@Test(priority=3,description = "Multiple Refresh", invocationCount = 5, invocationTimeOut = 5000)
	void testMultipleRefresh() throws InterruptedException {
		System.out.println("Refresh - Invocation Count - 5");
		Thread.sleep(1500);
	}
	
	@Parameters({"shortName","userStatus"})
	@Test(priority=1,description="Verify userdetails on dashboard")
	void testUserDetailsOnDashboard(String shortName,String userStatus){
		System.out.println("Userdetails Dashboard , as per parameters from testng.xml file");
		System.out.println("Shortname : "+shortName);
		System.out.println("User Status : "+userStatus);
	}
	
	@Ignore // You can use enable=false too
	@Test(priority=4,description="Verify Billing Page")
	void testVerifyBillingPage() {
		System.out.println("Verifying Billing Page");
	}

	@DataProvider(name = "loginData", parallel = false)
	Object[][] getLoginData() {
		return new Object[][] { { "admin", "pass123#" } };
	}

	@DataProvider(name = "BVA Text Field Data")
	Object[][] getBVAData() {
		return new Object[][] { { 1, 2, 3 }, { "ab", "cd", "ef" } };
	}

}
