package com.digitek.mathoperations;

public class WithReturnTypeAndAcceptParameters {

	
	public static int addNumbersWithReturnTypeAndAcceptParameters(int a, int b){
		
		int c = a+b;
		System.out.println("result from addition with return type/accepts parameters:"+ c);
		
		return c;
			
	}
	
	
	 public static int dividenumbers(int numerator, int denominator) {
   	  
   	  int result = numerator/denominator;
   	
   	  System.out.println("result from division:"+ result);
   	  return result;
   
	 }
   
	 public static double dividenumbers(int numerator, double denominator) {
	   	  
	   	  double result = numerator/denominator;
	   	
	   	  System.out.println("result from division:"+ result);
	   	  return result;
	   
		 }
	
	
	
	public static void main(String args[]) {
		
		int result1 = addNumbersWithReturnTypeAndAcceptParameters(10,20);
		int result2 = addNumbersWithReturnTypeAndAcceptParameters(50,20);
		int result3 = addNumbersWithReturnTypeAndAcceptParameters(80,40);
		dividenumbers(5,2);
		dividenumbers(5,2.0);
		dividenumbers(4,0);
		
		
		
		
	}
	

			
	}
	
	
	
	
	
