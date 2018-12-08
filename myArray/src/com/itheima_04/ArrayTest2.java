package com.itheima_04;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 98, 73, 60 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.err.println("max = " + max);
	}
}
