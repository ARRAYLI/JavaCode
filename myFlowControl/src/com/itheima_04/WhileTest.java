package com.itheima_04;

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);

		int j = 0;
		sum = 0;
		while (j <= 100) {
			sum += j;
			j++;
		}
		System.out.println("sum:" + sum);

	}
}
