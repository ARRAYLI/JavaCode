package com.itheima_01;

/*
 * ++,--:�����Լ�,���ڶԱ����ӻ��߼� 1
 * ����ʹ�õ�ʱ��++����--���ڱ�����ǰ����ߺ��棬�����һ��
 * ��������������ʱ�򣺱���
 * 		++�ں��棬���ñ�����������Ȼ�����++
 * 		++���ں��棬�ȱ���++��Ȼ����������
 * 
 */
public class OperatorDemo4 {
	public static void main(String[] args) {
		// �������
		int a = 10;
		System.out.println("a:" + a);

		// ++ ����ʾ
		// a++;
		// int b = a++;
		int b = ++a;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}
