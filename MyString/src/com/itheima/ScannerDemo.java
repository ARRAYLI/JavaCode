package com.itheima;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������һ���ַ������ݣ�");
		String string = scanner.nextLine();
		System.err.println("string = " + string);
	}
}
