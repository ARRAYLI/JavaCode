/**
 * 
 */
package com.itheima;

import java.util.Scanner;

/**
* @author  ARRAYLI
* @version 创建时间：2018年12月4日 下午9:42:27
* 类说明
*/
/**
 * @author ARRAYLI 键盘录入三个数据，获取三个数据的最大值
 */
public class ScannerTest3 {
	public static void main(String[] args) {
		// 创建键盘输入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();

		int res = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("res:" + res);
	}
}
