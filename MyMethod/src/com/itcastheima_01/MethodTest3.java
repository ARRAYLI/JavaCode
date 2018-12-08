package com.itcastheima_01;

import java.util.Scanner;

public class MethodTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		int max = getMax(num1, num2, num3);
		System.out.println("max = " + max);

	}

	public static int getMax(int a, int b, int c) {
		int temp = a > b ? a : b;
		return temp > c ? temp : c;
	}
}
