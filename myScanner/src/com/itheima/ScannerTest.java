/**
 * 
 */
package com.itheima;

import java.util.Scanner;

/**
* @author  ARRAYLI
* @version ����ʱ�䣺2018��12��4�� ����9:35:07
* ��˵��
*/
/**
 * @author ARRAYLI ���������������ݣ���������������ͣ�������
 */
public class ScannerTest {
	public static void main(String[] args) {
		// ���������������
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		// ���
		int sum = a + b;
		// ������
		System.out.println("sum:" + sum);
	}
}
