package assignments;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {
	
	
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
	
//Codes
	
	
	
	public static void main(String[] args) {
		String test = "changeme";
		
		System.out.println("a) Convert the String to character array");
		
		char[] str = test.toCharArray();
		
		System.out.print("Given String :");
		System.out.println(str);
		System.out.println("String length :" + str.length);
		
		
		System.out.println("b) Traverse through each character (using loop)"); 
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		System.out.println("c)find the odd index within the loop (use mod operator)");
		
		for (int j = 0; j < str.length; j++) {
		 if(str[j]%2 != 1) {
			 System.out.println(str[j]);
		 }
		}
		
		 
		
	}
	
	

}
