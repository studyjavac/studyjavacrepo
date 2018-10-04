package com.studyjavac.pattern.number;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int rows = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= rows; i++) {
			int num = 1;

			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}

			System.out.println();
		}
	}

}
