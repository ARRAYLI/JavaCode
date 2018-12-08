package com.itheima_06;

public class BreakAndContinueDemo {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				// break;
				continue;
			System.out.println("hello world!");
		}
	}
}
