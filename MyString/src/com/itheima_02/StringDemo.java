package com.itheima_02;

/*
 * String(String original)     ��ʼ��һ���´����� String ����ʹ���ʾһ���������ͬ���ַ����У����仰˵���´������ַ����Ǹò����ַ����ĸ�����
 * String(char[] value) 
          ����һ���µ� String��ʹ���ʾ�ַ���������е�ǰ�������ַ����С�
 * 
 * String(char[] value, int offset, int count) 
          ����һ���µ� String��������ȡ���ַ��������һ����������ַ���
 */
public class StringDemo {
	public static void main(String[] args) {
		String str1 = new String("hello world");
		System.out.println("str1:" + str1);
		System.out.println("----------------------");

		char[] chs = { 'h', 'e', 'l', 'l', 'o' };
		String str2 = new String(chs);

		System.out.println("str2:" + str2);
		System.out.println("----------------------");

		String str3 = new String(chs, 1, 3);
		System.out.println("str3:" + str3);

	}
}
