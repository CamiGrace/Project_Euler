package projectEulerProblemsJava;



public class Problem3 {

	public static void main(String[] args) {
		//The prime factors of 13195 are 5, 7, 13 and 29.
		//What is the largest prime factor of the number 600851475143 ?
		
		long number = 600851475143L;
		
		for (long x =1; x<= number/2; x++) {
			if (number % x == 0) {
				if ((x % 2 !=0) && (x % 3 != 0)&& (x % 5 !=0) && (x % 7 !=0)) {
					
					System.out.println(x);
				}
				
			}
		}
		
		
		
	}

}