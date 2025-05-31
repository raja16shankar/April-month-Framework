package org.pom1;

import org.testng.annotations.Test;

public class testng{ 
	
	@Test(priority=-22)
	private void tc_1() {
		
		System.out.println("test1");

	}
	
	@Test(priority=4)
	private void tc_2() {
		
		System.out.println("test 2");
	}
	
	@Test(priority=2)
	private void tc_3() {
		
		System.out.println("test3");

	}
	@Test(invocationCount=5)
	private void tc_4() {
		
		System.out.println("test4");

	}
}