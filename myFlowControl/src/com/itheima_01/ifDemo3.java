package com.itheima_01;

public class ifDemo3 {
	public static void main(String[] args) {
		System.out.println("��ʼ");

		// �������
		int x = 5;
		int y;
		if (x >= 3) {
			y = 2 * x + 1;
		} else if (x >= -1 && x < 3) {
			y = 2 * x;
		} else if (x <= -1) {
			y = 2 * x - 1;
		} else {
			y = 0;
			System.out.println("������������x");
		}
		System.out.println("y:" + y);
		System.out.println("����");
	}
}
