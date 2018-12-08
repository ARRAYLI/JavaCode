package com.itcastheima_05;

public class MethodTest {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };

		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("------------");
		printArray(arr);
		System.out.println("------------");
		printArray2(arr);
	}

	public static void printArray(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
	}

	public static void printArray2(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.println(arr[x] + "]");
			} else {
				System.out.print(arr[x] + ",");
			}
		}
	}
}
