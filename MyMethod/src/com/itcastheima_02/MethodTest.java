package com.itcastheima_02;

public class MethodTest {
	public static void main(String[] args) {
		printNumber(3);
		System.out.println("--------------");
		printNumber(10);
	}

	public static void printNumber(int n) {
		for (int x = 1; x <= n; x++) {
			System.out.println(x);
		}
	}
}
