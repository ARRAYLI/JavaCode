package com.itheima;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入一个字符串数据：");
		String string = scanner.nextLine();
		System.err.println("string = " + string);
	}
}
