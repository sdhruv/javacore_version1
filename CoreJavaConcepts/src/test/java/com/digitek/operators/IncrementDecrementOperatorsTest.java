package com.digitek.operators;

import org.junit.Assert;
import org.junit.Test;

public class IncrementDecrementOperatorsTest {
	
	
	@Test
	public void IncrementOperators_Test () {
		
		int number1 = 9;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.incrementOperators();
		
		int actual = number1+=1;
		Assert.assertEquals(10, actual);
		
		
	}
	
	@Test
	public void IncrementOperators_Test1 () {
		
		int number2 = 20;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.incrementOperators();
		
		int actual = number2++;
		Assert.assertEquals(20, actual);
		
		
	}
	
	@Test
	public void IncrementOperators_Test2 () {
		
		int number3 = 20;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.incrementOperators();
		
		int actual = ++number3;
		Assert.assertEquals(21, actual);
		
		
	}

	@Test
	public void postIncrement_Test() {
		
		int number4 = 30;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.incrementOperators();
		int actual = number4++;
		Assert.assertEquals(30, actual);
		
	}
	
	@Test
	public void preIncrement_Test() {
		
		int number5 = 70;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.incrementOperators();
		int actual = ++number5;
		Assert.assertEquals(71, actual);
		
	}
	
	@Test
	public void postDecrement_Test() {
		
		int number6 = 30;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.incrementOperators();
		int actual = number6--;
		Assert.assertEquals(30, actual);
		
	}
	
	@Test
	public void preDecrement_Test() {
		
		int number7 = 70;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.incrementOperators();
		int actual = --number7;
		Assert.assertEquals(69, actual);
		
	}
	
	@Test
	public void computeResult_Test() {
		
		int number8 = 7;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.computeResult();
		int actual = 2*++number8;
		Assert.assertEquals(16, actual);
		
	}
	
	@Test
	public void computeResult2_Test() {
		
		int number9 = 7;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.computeResult();
		int actual = 2*number9++;
		Assert.assertEquals(14, actual);
		
	}
	
	@Test
	public void computeResult3_Test() {
		
		int number10 = 10;
		IncrementDecrementOperators mo = new IncrementDecrementOperators();
		mo.computeResult();
		int actual = 2*number10++ + ++number10 + 3*number10--;
		Assert.assertEquals(68, actual);
		
	}
	
	
}

