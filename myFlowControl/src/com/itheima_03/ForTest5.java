package com.itheima_03;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int num = sc.nextInt();
		for (int x = 100; x < 1000; x++) {
			int i = x % 10;
			int j = x / 10 % 10;
			int k = x / 100;

			if (i * i * i + j * j * j + k * k * k == x) {
				count++;
			}
		}
		System.out.println("总共有 " + count + "个水仙花数");
	}
}
