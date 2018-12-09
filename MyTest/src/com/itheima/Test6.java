package com.itheima;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[6];

		for (int x = 0; x < arr.length; x++) {
			System.out.println("请输入第+" + (x + 1) + "元素");
			arr[x] = scanner.nextInt();
		}

		// 输出元素
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + "  ");
		}
		System.out.println();

		// 实现数组元素翻转
		for (int x = 0; x < arr.length / 2; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length - x - 1];
			arr[arr.length - x - 1] = temp;
		}

		// 输出元素
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + "  ");
		}
		System.out.println();
	}
}
