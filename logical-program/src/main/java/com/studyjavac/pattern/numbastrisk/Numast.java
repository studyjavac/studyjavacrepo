package com.studyjavac.pattern.numbastrisk;

import java.util.Scanner;

public class Numast {

	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int midPoint = (n % 2 == 0) ? n / 2 : (n / 2) + 1;
		int m = 0;

		for (int i = 1; i <= midPoint; i++) {
			Numast.printNumber(n, m);
			m += 2;
		}
		m = (n % 2 == 0) ? m - 1 : m - 3;
		for (int i = midPoint; i < n; i++) {
			Numast.printNumber(n, m);
			m -= 2;
		}
	}

	private static void printNumber(int n, int m) {
		int count = 1;
		for (int j = (n * m) + 1; count <= n; j++) {
			System.out.print(j + "  ");
			count++;
		}
		System.out.println();
	}
}
