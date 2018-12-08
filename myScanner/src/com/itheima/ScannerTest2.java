package com.itheima;

import java.util.Scanner;

/**
* @author  ARRAYLI
* @version 创建时间：2018年12月4日 下午9:39:13
* 类说明
*/
/**
 * @author ARRAYLI 键盘输入两个数据，判断这两个数据是否相等
 */
public class ScannerTest2 {
	public static void main(String[] args) {
		// 创建键盘输入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		boolean res = (a == b);

		System.out.println("res:" + res);

	}
}
