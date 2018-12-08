package com.itcastheima_02;

public class MethodTest2 {
	public static void main(String[] args) {
		printShuiXianHua();
	}

	public static void printShuiXianHua() {
		for (int x = 100; x < 1000; x++) {
			int i = x % 10;
			int j = x / 10 % 10;
			int k = x / 100;

			if (i * i * i + j * j * j + k * k * k == x) {
				System.out.println(x);
			}
		}
	}
}
