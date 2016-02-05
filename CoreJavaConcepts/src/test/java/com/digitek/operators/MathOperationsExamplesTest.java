package com.digitek.operators;

import org.junit.Assert;
import org.junit.Test;


public class MathOperationsExamplesTest {

	@Test
	
	public void MathOperationsExamples_Test () {
		
		int a = 10;
		int b = 20;
		
		MathOperationsExamples mo = new MathOperationsExamples ();
		mo.addition();
		
		int actual = a + b;
		Assert.assertEquals(30, actual);
	
		
	}
	
		@Test
	
		public void MathOperationsExamples1_Test () {
		
		int a = 10;
		int b = 20;
		
		MathOperationsExamples mo = new MathOperationsExamples ();
		mo.subtraction();
		
		int actual = a - b;
		Assert.assertEquals(-10, actual);
	
		
	}
		
		@Test
		
		public void MathOperationsExamples2_Test () {
		
		int a = 10;
		int b = 20;
		
		MathOperationsExamples mo = new MathOperationsExamples ();
		mo.multiplication();
		
		int actual = a * b;
		Assert.assertEquals(200, actual);
	
		
	}

		@Test
		
		public void MathOperationsExamples3_Test () {
		
		int a = 100;
		int b = 20;
		
		MathOperationsExamples mo = new MathOperationsExamples ();
		mo.division();
		
		int actual = a / b;
		Assert.assertEquals(5, actual);
	
		
	}
	
	
}
