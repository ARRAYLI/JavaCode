package com.itheima_04;

/*
 * &&:  && �� & �Ľ��һ��
 * ||:  || �� | �Ľ��һ��
 * 
 * && �� & ������
 * 		&& �ж�·Ч�������false���ұ߲�ִ��
 * 		& ���������ʲô���ұ߶�ִ��
 */
public class OperatorDemo2 {
	public static void main(String[] args) {
		// �������
		int a = 3;
		int b = 4;
		int c = 5;

		// &
		System.out.println((a > b) && (a > c)); // false & false
		System.out.println((a < b) && (a > c)); // ture & false
		System.out.println((a > b) && (a < c)); // false & ture
		System.out.println((a < b) && (a < c)); // true & ture
		System.out.println("--------------");

		// |
		System.out.println((a > b) || (a > c)); // false & false
		System.out.println((a < b) || (a > c)); // ture & false
		System.out.println((a > b) || (a < c)); // false & ture
		System.out.println((a < b) || (a < c)); // true & ture
		System.out.println("--------------");

		// �������
		int x = 10;
		int y = 20;
		System.out.println((x++ > 10) && (y++ > 20));
		System.out.println("x:" + x);
		System.out.println("y:" + y);

	}
}
