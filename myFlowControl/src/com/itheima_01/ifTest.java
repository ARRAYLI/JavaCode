package com.itheima_01;

import java.util.Scanner;

/*
 * 键盘录入两个数据，获取这两个数据的最大值
 * 
 * 导包：
 * 		A：手动导包
 * 		B:点击鼠标自动生成
 * 		C：快捷键
 * 				ctrl+shift+o
 */
public class ifTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		/*
		 * if (a > b) { System.out.println("大的数值是:" + a); } else {
		 * System.out.println("大的数值是:" + b); }
		 */
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("大的值是：" + max);
	}
}
