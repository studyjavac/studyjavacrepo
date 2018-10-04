package com.studyjavac.pattern.astrisk;

import java.util.Scanner;

public class Asterisk6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int rows = scanner.nextInt();
		scanner.close();

		for (int i = rows; i >= 1; i--)
			printAsterisk(i, rows);

		for (int i = 2; i <= rows; i++)
			printAsterisk(i, rows);
	}

	static void printAsterisk(int i, int rows) {
		for (int j = i; j <= rows - 1; j++) {
			System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {
			System.out.print("*");
		}
		for (int p = i - 1; p >= 1; p--) {
			System.out.print("*");
		}
		System.out.println();
	}

}
