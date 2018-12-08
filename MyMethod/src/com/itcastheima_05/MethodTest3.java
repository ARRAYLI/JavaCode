package com.itcastheima_05;

public class MethodTest3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// int sum = 0;
		// for (int x = 0; x < arr.length; x++) {
		// sum += arr[x];
		// }

		System.out.println("sum = " + getSum(arr));
	}

	public static int getSum(int[] arr) {
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}
		return sum;
	}
}
