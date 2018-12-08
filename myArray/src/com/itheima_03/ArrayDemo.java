package com.itheima_03;

/*
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at com.itheima_03.ArrayDemo.main(ArrayDemo.java:7)

 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		// System.out.println(arr[3]);

		arr = null;
		// System.out.println(arr[1]);
	}
}
