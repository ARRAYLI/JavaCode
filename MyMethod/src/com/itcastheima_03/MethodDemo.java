package com.itcastheima_03;

public class MethodDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int result = sum(a, b);
		System.out.println("result = " + result);

		int c = 30;
		int result2 = sum(a, b, c);
		System.out.println("result = " + result2);
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static float sum(float a, float b) {
		return a + b;
	}
}
