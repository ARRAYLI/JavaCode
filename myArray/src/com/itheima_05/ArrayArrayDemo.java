package com.itheima_05;

/*
 * 二位数组的定义格式：
 * 		A:	int [][] arr;
 * 		B:  int arr[][];
 * 		C:  int []arr[];
 * 初始化：
 * 		A:int [][]arr = new int[m][n];
 * 		B:int [][]arr = new int[][]{}{}
 * 		C:int [][]arr = {{},{},{}}
 */
public class ArrayArrayDemo {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);

	}
}
