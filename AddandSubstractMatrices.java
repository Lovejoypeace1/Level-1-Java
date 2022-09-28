package com.learn;

import java.util.Scanner;

public class AddandSubstractMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][], b[][], c[][], i, j;
		a = new int[2][2];
		b = new int[2][2];
		c = new int[2][2];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first matrix");
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
				a[i][j] = input.nextInt();

		System.out.println("Enter second matrix");
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
				b[i][j] = input.nextInt();

		System.out.println("Addition");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println("Substraction");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();

		}
	}
}
