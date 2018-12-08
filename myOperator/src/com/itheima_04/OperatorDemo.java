package com.itheima_04;

/*
 * �߼���������������ӹ�ϵ���ʽ
 * &,|,^,!
 * &&,||
 * 
 * &: �� false �� false
 * |: �� true �� true
 * ^: ��ͬ�� false,��ͬ��true
 * !: true �� false,false ��true
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// �������
		int a = 3;
		int b = 4;
		int c = 5;

		// &
		System.out.println((a > b) & (a > c)); // false & false
		System.out.println((a < b) & (a > c)); // ture & false
		System.out.println((a > b) & (a < c)); // false & ture
		System.out.println((a < b) & (a < c)); // true & ture
		System.out.println("--------------");

		// |
		System.out.println((a > b) | (a > c)); // false & false
		System.out.println((a < b) | (a > c)); // ture & false
		System.out.println((a > b) | (a < c)); // false & ture
		System.out.println((a < b) | (a < c)); // true & ture
		System.out.println("--------------");

		// ^
		System.out.println((a > b) ^ (a > c)); // false & false
		System.out.println((a < b) ^ (a > c)); // ture & false
		System.out.println((a > b) ^ (a < c)); // false & ture
		System.out.println((a < b) ^ (a < c)); // true & ture
		System.out.println("--------------");

		// !
		System.out.println(a > b);
		System.out.println(!(a > b));
		System.out.println(!!(a > b));
		System.out.println("--------------");
	}

}
