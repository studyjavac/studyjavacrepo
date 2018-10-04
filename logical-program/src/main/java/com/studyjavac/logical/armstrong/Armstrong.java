package com.studyjavac.logical.armstrong;

import java.util.Scanner;
// check given number is Armstrong number or not ?
public class Armstrong {

	public static void main(String args[]) {
		int input, sum = 0, num, remainder, digits = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number to check Armstrong number :");
		input = sc.nextInt();
		sc.close();

		num = input;
		// Count number of digits
		while (num > 0) {
			digits++;
			num = num / 10;
		}

		num = input;

		while (num > 0) {
			remainder = num % 10;
			sum = sum + power(remainder, digits);
			num = num / 10;
		}

		if (input == sum)
			System.out.println(input + " is an Armstrong number.");
		else
			System.err.println(input + " isn't an Armstrong number.");
	}

	// to calculate power of every number
	static int power(int remainder, int digits) {
		int p = 1;

		for (int c = 1; c <= digits; c++)
			p = p * remainder;

		return p;
	}

}
