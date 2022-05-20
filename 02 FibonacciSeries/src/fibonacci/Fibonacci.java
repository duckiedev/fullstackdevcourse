package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci Sequence : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
		// Start at 0, add 1, then add the 2 previous numbers together to get the next
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input Max Sequence Number : ");
		int number = input.nextInt();
		int fibPrevious = 0, fibonacci = 1, sum = 0;
		for (int i = 1; i<=number; i++) {
			System.out.println(fibPrevious + " ");
			sum = fibPrevious + fibonacci;
			fibPrevious = fibonacci;
			fibonacci = sum;
		}
	}

}
