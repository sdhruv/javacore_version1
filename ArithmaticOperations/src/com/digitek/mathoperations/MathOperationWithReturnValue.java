package com.digitek.mathoperations;

public class MathOperationWithReturnValue {

      public static int addNumbersWithReturnType() {
    	  
    	  int a = 10; 
    	  int b = 15;
    	  
    	  int c = a+b;
    	  System.out.println("result from addition with return type method:" +c);
    	  
    	  return c;
    	 
     }
         
      public static void multiplication() {
      	
     	 int result = 10 * addNumbersWithReturnType();
    
     	 System.out.println("result from multiplication:"+result);
     	 
    	 
   }
	
	      public static void main(String args[]) {
  		
  		//addNumbersWithReturnType();
  		multiplication();
  		 
		
	 }
	
	
	


}
