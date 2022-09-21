package com.revature;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Maximum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTriplets = scanner.nextInt();
		for(int i = 0; i < numberOfTriplets; i++) {
			int[] tripletArray = {0, 0, 0};
			tripletArray[0] = scanner.nextInt();
			tripletArray[1] = scanner.nextInt();
			tripletArray[2] = scanner.nextInt();
			
			
			Arrays.sort(tripletArray);
			
			System.out.println("The second maximum is: " + tripletArray[1]);
			
		}
		scanner.close();
		
		
	}

}
