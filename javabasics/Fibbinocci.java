package javabasics;

public class Fibbinocci {
	public static void main(String[] args) {
		int varOne = 0;
		int varTwo = 1;
		
		int varThree;
		
		
		System.out.println(varOne);
		System.out.println(varTwo);
		
		for(int i = 0;i<=11;i++) {
			varThree = varOne + varTwo;
			System.out.println(varThree);
			varOne = varTwo;
			varTwo = varThree;
		}
		
	}

}
