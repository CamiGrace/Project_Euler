package projectEulerProblemsJava;

import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) {
		
		//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		//Find the largest palindrome made from the product of two 3-digit numbers.
		
		ArrayList <Integer> palindrome = new ArrayList<>(); 
		for (int x = 100; x<= 999; x++ ) {
			for (int y = 100; y<= 999; y++ ) {
				int newNumber = x*y;
				if (newNumber == reverse(newNumber)) {
					palindrome.add(newNumber);
					
				}
				System.out.println(reverse(1551));
			}
		}
		
		
	
			}
		
	

	private static int reverse(int z) {
		
		int reversedNum =0;
		
		while (z!=0) {
		int digit = z % 10;
		reversedNum = reversedNum * 10 + digit;
		 z /= 10;
			
		}
		return z;
	}

}
