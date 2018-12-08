package com.itheima_01;

/*
 * ++,--:自增自减,用于对变量加或者减 1
 * 单独使用的时候：++或者--放在变量的前面或者后面，结果都一样
 * 参与其他操作的时候：变量
 * 		++在后面，先拿变量做操作，然后变量++
 * 		++放在后面，先变量++，然后再做操作
 * 
 */
public class OperatorDemo4 {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		System.out.println("a:" + a);

		// ++ 的演示
		// a++;
		// int b = a++;
		int b = ++a;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}
