package com.itheima_01;

import java.util.Scanner;

/*
 * ����¼���������ݣ���ȡ���������ݵ����ֵ
 * 
 * ������
 * 		A���ֶ�����
 * 		B:�������Զ�����
 * 		C����ݼ�
 * 				ctrl+shift+o
 */
public class ifTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		/*
		 * if (a > b) { System.out.println("�����ֵ��:" + a); } else {
		 * System.out.println("�����ֵ��:" + b); }
		 */
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("���ֵ�ǣ�" + max);
	}
}
