package com.itheima_05;

public class DoWhileDemo {
	public static void main(String[] args) {
		for (int x = 1; x < 10; x++) {
			System.out.println("hello world!");
		}
		System.out.println("--------------");

		int y = 1;
		do {
			System.out.println("hello world!");
			y++;
		} while (y <= 10);
	}
}
