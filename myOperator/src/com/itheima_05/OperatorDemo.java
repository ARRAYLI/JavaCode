package com.itheima_05;

/*
 * ��Ԫ�������
 * 		��ϵ���ʽ1�����ʽ1�����ʽ2
 * ִ�����̣�
 * 		A�������ϵ���ʽ��ֵ������ true����false 
 * 		B:����� ture,���Ǳ��ʽ1���ǽ��
 * 		     ����� false,����ʽ2���ǽ��
 * 
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// �������
		int a = 10;
		int b = 20;
		int c = (a > b) ? a : b;

		System.out.println("c:" + c);
	}
}
