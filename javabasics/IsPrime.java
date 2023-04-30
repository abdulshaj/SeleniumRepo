package javabasics;

public class IsPrime {

	public static void main(String[] args) {
		int givenNum = 17;
		
		boolean check = false;
				
		for(int i=2;i < givenNum/2; i++) {
			
			if(givenNum%i == 0) {
				check = true;
				break;
			}
			
		}
		
		
		if(!check) {
			System.out.println("Its a prime number");
		}
		else {
			System.out.println("Its not a prime number");
		}
	}
}
