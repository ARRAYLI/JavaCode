package com.itheima_04;

/*
 * &&:  && 和 & 的结果一样
 * ||:  || 和 | 的结果一样
 * 
 * && 和 & 的区别：
 * 		&& 有短路效果，左边false则右边不执行
 * 		& 无论左边是什么，右边都执行
 */
public class OperatorDemo2 {
	public static void main(String[] args) {
		// 定义变量
		int a = 3;
		int b = 4;
		int c = 5;

		// &
		System.out.println((a > b) && (a > c)); // false & false
		System.out.println((a < b) && (a > c)); // ture & false
		System.out.println((a > b) && (a < c)); // false & ture
		System.out.println((a < b) && (a < c)); // true & ture
		System.out.println("--------------");

		// |
		System.out.println((a > b) || (a > c)); // false & false
		System.out.println((a < b) || (a > c)); // ture & false
		System.out.println((a > b) || (a < c)); // false & ture
		System.out.println((a < b) || (a < c)); // true & ture
		System.out.println("--------------");

		// 定义变量
		int x = 10;
		int y = 20;
		System.out.println((x++ > 10) && (y++ > 20));
		System.out.println("x:" + x);
		System.out.println("y:" + y);

	}
}
