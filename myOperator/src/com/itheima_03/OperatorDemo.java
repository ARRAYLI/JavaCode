package com.itheima_03;

/*
 * 关系运算符：
 * 		==，！=，>,>=,<,<=
 * 		关系运算符的结果是 boolean 类型
 * 注意事项：千万不要把两个 == 写成一个 =
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// 定义变量
		int a = 10;
		int b = 20;
		int c = 30;

		// ==
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("----------------");

		// !=

		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("----------------");

		// >
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("----------------");

		// >=
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("----------------");

		// 注意事项：
		System.out.println(a == b);
		System.out.println(a = b);
	}
}
