package com.itheima;

import java.util.Scanner;

public class DebugTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int ret = sum(a, b);

		System.out.println("sum:" + ret);
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
