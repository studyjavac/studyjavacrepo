package com.studyjavac.logical.prime;

// Find sum of first N prime no
public class PrimeNumber4 {

	public static void main(String[] args) {

		int totalPrime = 20;
		int count = 1;
		int sum = 0;
		String primes = "";
		System.out.println("First " + totalPrime + " prime no is : ");
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
				// System.out.print(num + ",");
				primes = primes + num + ",";
			}
		}
		int index = primes.lastIndexOf(",");
		primes = primes.substring(0, index);
		// primes = primes + ".";
		System.out.println(primes);
		System.out.println("\nSum of first " + totalPrime + " prime no : " + sum);
	}
}
