package com.itheima;

import java.util.Scanner;

/**
* @author  ARRAYLI
* @version ����ʱ�䣺2018��12��4�� ����9:39:13
* ��˵��
*/
/**
 * @author ARRAYLI ���������������ݣ��ж������������Ƿ����
 */
public class ScannerTest2 {
	public static void main(String[] args) {
		// ���������������
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		boolean res = (a == b);

		System.out.println("res:" + res);

	}
}
