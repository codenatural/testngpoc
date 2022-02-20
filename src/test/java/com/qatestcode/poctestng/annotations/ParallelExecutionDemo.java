package com.qatestcode.poctestng.annotations;

import org.testng.annotations.Test;

class Demo1{
	Demo1(){
		System.out.println("Demo1 Class Invoked");
	}
	
	@Test
	void testDemo001A() {
		System.out.println("Running : testDemo001A");
	}
	
	@Test
	void testDemo001B() {
		System.out.println("Running : testDemo001B");
	}
	
	@Test
	void testDemo001C() {
		System.out.println("Running : testDemo001C");
	}
}

class Demo2{
	
	Demo2(){
		System.out.println("Demo2 Class Invoked");
	}
	
	@Test
	void testDemo002A() {
		System.out.println("Running : testDemo002A");
	}
	
	@Test
	void testDemo002B() {
		System.out.println("Running : testDemo002B");
	}
	
	@Test
	void testDemo002C() {
		System.out.println("Running : testDemo002C");
	}
}

public class ParallelExecutionDemo {
	
	ParallelExecutionDemo(){
		System.out.println("ParallelExecutionDemo Class Invoked");
	}

	@Test
	void testDemoPTA() {
		System.out.println("Running : testDemoPTA");
	}
	
	@Test
	void testDemoPTB() {
		System.out.println("Running : testDemoPTB");
	}
	
	@Test
	void testDemoPTC() {
		System.out.println("Running : testDemoPTC");
	}
}
