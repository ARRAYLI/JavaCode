package com.itcastheima_01;

import java.util.Scanner;

public class MethodDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int res = sum(a, b);
		System.out.println(res);

	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
}
