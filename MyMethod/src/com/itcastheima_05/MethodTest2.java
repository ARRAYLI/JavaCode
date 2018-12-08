package com.itcastheima_05;

public class MethodTest2 {
	public static void main(String[] args) {
		int[] arr = { 24, 36, 90, 75, 81 };

		System.out.println("max = " + getMax(arr));
	}

	public static int getMax(int[] arr) {
		int max = arr[0];

		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		return max;
	}
}
