package projectEulerProblemsJava;

import java.util.ArrayList;

public class Problem3 {

	public static void main(String[] args) {
		//The prime factors of 13195 are 5, 7, 13 and 29.
		//What is the largest prime factor of the number 600851475143 ?
		
		long number = 600851475143L;
		ArrayList <Long> factors = new ArrayList<Long>();
		
		for (long x =1; x<= number/2; x++) {
			if (number % x == 0) {
				factors.add(x);
				
			int y =0;
			//for (y=0, y < factors.size(), y++) {
				//if (factors[y] % 
			
			}
					
					System.out.println(factors);
				}
				
			}
		}
		
		
		
	//}


