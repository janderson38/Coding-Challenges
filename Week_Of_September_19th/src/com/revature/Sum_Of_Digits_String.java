package com.revature;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Of_Digits_String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfTestCases = scanner.nextInt();
		for (int i = 1; i <= numberOfTestCases; i++) {
			String string = scanner.next();
			int sum = 0;
			for (char ch : string.toCharArray()) {
				if (Character.isDigit(ch)) {
					sum += Character.getNumericValue(ch);
				}
			}

			System.out.println(sum);

		}

		scanner.close();

	}

}
