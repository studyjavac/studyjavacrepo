package com.studyjavac.pattern.astrisk;

import java.util.Scanner;

public class Asterisk7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int rows = scanner.nextInt();
		scanner.close();

		printLineSterisk(rows);

		for (int j = 2; j <= rows - 1; j++) {
			System.out.print("*");
			for (int k = 1; k <= (rows * 2) - 1; k++) {
				if (k != (rows * 2) - 1)
					System.out.print("  ");
				else
					System.out.print(" ");
			}
			System.out.print("*\n");
		}

		printLineSterisk(rows);

	}

	static void printLineSterisk(int rows) {
		for (int i = 1; i <= rows * 2; i++)
			System.out.print("* ");
		System.out.println();

	}

}
