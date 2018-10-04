package com.studyjavac.pattern.astrisk;

import java.util.Scanner;

public class Asterisk2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int rows = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= rows; i++) {

			for (int j = i; j <= rows; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
