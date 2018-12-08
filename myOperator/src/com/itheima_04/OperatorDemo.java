package com.itheima_04;

/*
 * 逻辑运算符：用于连接关系表达式
 * &,|,^,!
 * &&,||
 * 
 * &: 有 false 则 false
 * |: 有 true 则 true
 * ^: 相同则 false,不同则true
 * !: true 则 false,false 则true
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// 定义变量
		int a = 3;
		int b = 4;
		int c = 5;

		// &
		System.out.println((a > b) & (a > c)); // false & false
		System.out.println((a < b) & (a > c)); // ture & false
		System.out.println((a > b) & (a < c)); // false & ture
		System.out.println((a < b) & (a < c)); // true & ture
		System.out.println("--------------");

		// |
		System.out.println((a > b) | (a > c)); // false & false
		System.out.println((a < b) | (a > c)); // ture & false
		System.out.println((a > b) | (a < c)); // false & ture
		System.out.println((a < b) | (a < c)); // true & ture
		System.out.println("--------------");

		// ^
		System.out.println((a > b) ^ (a > c)); // false & false
		System.out.println((a < b) ^ (a > c)); // ture & false
		System.out.println((a > b) ^ (a < c)); // false & ture
		System.out.println((a < b) ^ (a < c)); // true & ture
		System.out.println("--------------");

		// !
		System.out.println(a > b);
		System.out.println(!(a > b));
		System.out.println(!!(a > b));
		System.out.println("--------------");
	}

}
