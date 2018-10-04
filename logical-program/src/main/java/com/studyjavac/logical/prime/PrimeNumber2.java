package com.studyjavac.logical.prime;

// to print prime no between 100 and 200
public class PrimeNumber2 {

	public static void main(String[] args) {

		int num = 100;
		int limit = 200;
		for ( ; num <= limit; num++) {
			boolean flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(num);
		}
	}
}
