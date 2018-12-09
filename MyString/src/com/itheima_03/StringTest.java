package com.itheima_03;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String name;
		String paws;

		String username = "admin";
		String password = "admin";

		for (int i = 0; i < 3; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入用户名：");
			name = scanner.nextLine();
			System.out.println("请输入密码：");
			paws = scanner.nextLine();

			if (username.equals(name) && password.equals(paws)) {
				System.out.println("登录成功!");
				break;
			} else {
				if (2 - i == 0) {
					System.out.println("用户被锁定，不能再登录");
				} else {
					System.out.println("登录失败,你还有" + (2 - i) + "次机会");
				}
			}
		}
	}
}
