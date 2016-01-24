package com.digitek.mathoperations;

import org.junit.Assert;
import org.junit.Test;


public class WithReturnTypeAndAcceptParametersTest {
	
	@Test
    public void addNumbersWithReturnTypeAndAcceptParametersTest() {
	
		//Creating a Java Object
		WithReturnTypeAndAcceptParameters mo = new WithReturnTypeAndAcceptParameters();
		int actualResult = mo.addNumbersWithReturnTypeAndAcceptParameters(40,60);
		Assert.assertEquals(100, actualResult);
		
	}


	@Test
	public void divisionWithIntsTest() {
		
		WithReturnTypeAndAcceptParameters mo = new WithReturnTypeAndAcceptParameters();
		int actualResult =	mo.dividenumbers(4, 2);
		
		Assert.assertEquals(2,actualResult);
		
	}
	
	@Test
	public void divideWithDoubleTest(){
	   	  
		WithReturnTypeAndAcceptParameters mo = new WithReturnTypeAndAcceptParameters();
	   	double actualResult = mo.dividenumbers(5,2.0);
	   	
	   	Assert.assertEquals(2.5,actualResult,0);
	   	
	}
	
}