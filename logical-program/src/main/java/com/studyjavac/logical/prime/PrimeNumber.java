package com.studyjavac.logical.prime;

import java.util.Scanner;

// to check given number is prime or not
public class PrimeNumber {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check prime :");
		int num = scanner.nextInt();
		scanner.close();

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(num + " is prime number");
		else
			System.err.println(num + " is not prime number");

	}
}
