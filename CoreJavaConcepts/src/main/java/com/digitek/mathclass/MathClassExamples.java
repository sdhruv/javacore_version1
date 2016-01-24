package com.digitek.mathclass;

public class MathClassExamples {

	public static void main(String[] args) {
		
		squareRoot(4);
		findMax(10,2);
		

	}
	
	
	public static double squareRoot(double number) {
		double result = Math.sqrt(number);
		System.out.println("Square Root:"+ result);
		
		return result;
		
		
	}

	
	public static int findMax(int no1, int no2) {
		
		int result = Math.max(no1, no2);
		System.out.println("Max of two Numbers:" + result);
		
		return result;
		
				
		
		
		
	}
	
	
	
}
