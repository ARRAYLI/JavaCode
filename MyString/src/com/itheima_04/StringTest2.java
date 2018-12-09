package com.itheima_04;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入一个字符数据：");
		String string = scanner.nextLine();

		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= '0' && ch <= '9') {
				numberCount++;
			}
		}
		System.out.println("大写字母：" + bigCount);
		System.out.println("小写字母：" + smallCount);
		System.out.println("数字字符：" + numberCount);
	}
}
