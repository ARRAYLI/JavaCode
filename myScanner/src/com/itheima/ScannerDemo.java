/**
 * 
 */
package com.itheima;

import java.util.Scanner;

/**
* @author  ARRAYLI
* @version 创建时间：2018年12月4日 下午9:28:57
* 类说明
*/
/**
 * @author ARRAYLI
 * 
 *         为了提高程序的灵活性，我们 就把数据改为从键盘录入
 *
 *         使用步骤： A:导包 import java.until.Scanner; B:创建键盘录入的基本对象 Scanner sc = new
 *         Scanner(System.in) C:接收数据 int i = sc.nextInt();
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// 创建键盘输入对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入一个数据：");
		int i = sc.nextInt();

		// 输出结果
		System.out.println("i:" + i);
	}
}
