package com.itheima_03;

public class StringBuilderTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		String result = arrayToString(arr);
		System.out.println("result:" + result);
	}

	public static String arrayToString(int[] arr) {
		StringBuilder sBuilder = new StringBuilder();

		sBuilder.append("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sBuilder.append(arr[x]);
			} else {
				sBuilder.append(arr[x]).append(",");
			}
		}
		sBuilder.append("]");

		String result = sBuilder.toString();
		return result;
	}
}
