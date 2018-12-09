package com.itheima;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入一个四位数：");
		int num = scanner.nextInt();

		int[] arr = new int[4];
		arr[0] = num % 10;
		arr[1] = num / 10 % 10;
		arr[2] = num / 100 % 10;
		arr[3] = num / 1000;

	}
}
