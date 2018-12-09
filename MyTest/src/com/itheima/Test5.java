package com.itheima;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		int[] arr = new int[6];

		Scanner scanner = new Scanner(System.in);
		for (int x = 0; x < arr.length; x++) {
			System.out.println("请第" + (x + 1) + "个评委打分：");
			arr[x] = scanner.nextInt();
		}

		int max = arr[0];
		int min = arr[0];

		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
			if (arr[x] < min) {
				min = arr[x];
			}
		}

		int sum = 0;
		int aerage = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}
		sum = sum - max - min;

		aerage = sum / 4;
		System.out.println("average = " + aerage);

	}
}
