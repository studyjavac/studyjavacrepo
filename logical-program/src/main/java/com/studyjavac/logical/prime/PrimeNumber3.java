package com.studyjavac.logical.prime;

// Find sum of first N prime no
public class PrimeNumber3 {

	public static void main(String[] args) {

		int totalPrime = 10;
		int count = 1;
		int sum = 0;
		for (int num = 2; count <= totalPrime; num++) {
			boolean flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				sum = sum + num;
				System.out.print(num + ",");
			}
		}
		System.out.println("\nSum of first "+totalPrime+" prime no : " + sum);
	}
}
