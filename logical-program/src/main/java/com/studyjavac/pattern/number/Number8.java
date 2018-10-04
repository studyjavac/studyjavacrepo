package com.studyjavac.pattern.number;

import java.util.Scanner;

public class Number8 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int rows = scanner.nextInt();
		scanner.close();
		for (int i = rows; i >= 1; i--) {

			for (int j = i; j < rows; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			for (int p = i - 1; p >= 1; p--) {
				System.out.print(p + " ");
			}

			System.out.println();
		}
	}

}
