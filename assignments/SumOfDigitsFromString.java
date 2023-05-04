package assignments;

public class SumOfDigitsFromString {
	
	/*
	 * Method 1
	 * Pseudo Code
	 
	 * Declare a String text with the following value
		String text = "Tes12Le79af65";
	   Declare a int variable sum
		int sum = 0;
	 * a) using replaceAll(), replace all the non-digits into ""
	 * b) Now, convert the String into array
	 * c) Iterate over the array and get each character
	 * d) Using Character.getNumericValue(), Change the char into int
	 * e) Add the values to sum & print
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		String text = "Tes12Le79af65";
		int sum = 0;
		
		String str = text.replaceAll("[^0-9.]", "");
		char[] array = str.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			int conv = Character.getNumericValue(array[i]);
			sum = sum + conv;
			
		}
		System.out.println("sum of digits from given string = " + sum);
		
	}

}
