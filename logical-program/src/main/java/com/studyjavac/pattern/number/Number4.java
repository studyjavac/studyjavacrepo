package com.studyjavac.pattern.number;

import java.util.Scanner;

public class Number4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int rows = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= rows; i++) {

			for (int j = i; j <= rows - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
