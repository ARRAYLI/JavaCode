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
			System.out.println("�������û�����");
			name = scanner.nextLine();
			System.out.println("���������룺");
			paws = scanner.nextLine();

			if (username.equals(name) && password.equals(paws)) {
				System.out.println("��¼�ɹ�!");
				break;
			} else {
				if (2 - i == 0) {
					System.out.println("�û��������������ٵ�¼");
				} else {
					System.out.println("��¼ʧ��,�㻹��" + (2 - i) + "�λ���");
				}
			}
		}
	}
}
