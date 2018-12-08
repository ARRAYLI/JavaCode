package com.itheima_01;

/*
 *  做加法运算
 * 	'A'  65
 * 	'a'  97
 * 	'0'  48
 * 字符串参与加法运算，其实做的不是加法运算，而是字符串的拼接
 */
public class OperatorDemo3 {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println("---------------------------");
		
		// 字符参与加法运算
		char c = '0';
		char c2 = 'A';
		System.out.println(a+c);
		
		// 字符串参与加法运算
		System.out.println("hello"+a);
		System.out.println("hello"+a+b);
		System.out.println(a+b+"hello");
	}
}
