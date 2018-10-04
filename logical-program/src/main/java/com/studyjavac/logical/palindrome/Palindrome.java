package com.studyjavac.logical.palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		int r, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Palindrome : ");
		int n = sc.nextInt();
		sc.close();

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is a palindrome number ");
		else
			System.out.println(temp + " is not a palindrome number1");
	}
}
