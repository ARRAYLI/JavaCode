package com.itheima_01;

import java.util.Scanner;

/*
	����¼��ѧ�����Գɼ�������ݳɼ��жϸ�ѧ�������ĸ�����
	90-100	����
	80-90	��
	70-80	��
	60-70	����
	60����	������

 */
public class ifTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ѧ���Ŀ��Գɼ���");
		int socre = sc.nextInt();

		if (socre > 100 || socre < 0) {
			System.out.println("������ĳɼ�����");
		}
		if (socre >= 90 && socre <= 100) {
			System.out.println("����");
		} else if (socre >= 80 && socre < 90) {
			System.out.println("��");
		} else if (socre >= 70 && socre < 80) {
			System.out.println("��");
		} else if (socre >= 60 && socre < 70) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
	}
}
