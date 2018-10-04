package com.studyjavac.logical.armstrong;

// Find  first N Armstrong number and their sum
public class Armstrong3 {
	public static void main(String[] args) {
		int num, remainder, sum = 0;
		int allSum = 0;
		
		int count = 0;
		int limit = 20;

		for (int start = 1; count < limit; start++) {
			num = start;
			int digits = 0;
			// Count number of digits
			while (num != 0) {
				digits++;
				num = num / 10;
			}

			num = start;
			while (num != 0) {
				remainder = num % 10;
				sum = sum + power(remainder, digits);
				num = num / 10;
			}

			if (sum == start) {
				System.out.print(start + " ");
				allSum = allSum + sum;
				count++;
			}
			sum = 0;
		}
		System.out.println("\nTotal Count : " + count);
		System.out.println("Sum of all armstrong number : " + allSum);
	}

	// to calculate power of every number
	static int power(int remainder, int digits) {
		int p = 1;

		for (int c = 1; c <= digits; c++)
			p = p * remainder;

		return p;
	}
}
