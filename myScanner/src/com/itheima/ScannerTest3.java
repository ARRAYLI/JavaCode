/**
 * 
 */
package com.itheima;

import java.util.Scanner;

/**
* @author  ARRAYLI
* @version ����ʱ�䣺2018��12��4�� ����9:42:27
* ��˵��
*/
/**
 * @author ARRAYLI ����¼���������ݣ���ȡ�������ݵ����ֵ
 */
public class ScannerTest3 {
	public static void main(String[] args) {
		// ���������������
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		System.out.println("��������������ݣ�");
		int c = sc.nextInt();

		int res = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("res:" + res);
	}
}
