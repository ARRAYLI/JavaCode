package com.itheima_01;

/*
 *  ���ӷ�����
 * 	'A'  65
 * 	'a'  97
 * 	'0'  48
 * �ַ�������ӷ����㣬��ʵ���Ĳ��Ǽӷ����㣬�����ַ�����ƴ��
 */
public class OperatorDemo3 {
	public static void main(String[] args) {
		// �������
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println("---------------------------");
		
		// �ַ�����ӷ�����
		char c = '0';
		char c2 = 'A';
		System.out.println(a+c);
		
		// �ַ�������ӷ�����
		System.out.println("hello"+a);
		System.out.println("hello"+a+b);
		System.out.println(a+b+"hello");
	}
}
