/**
 * 
 */
package com.itheima;

import java.util.Scanner;

/**
* @author  ARRAYLI
* @version ����ʱ�䣺2018��12��4�� ����9:28:57
* ��˵��
*/
/**
 * @author ARRAYLI
 * 
 *         Ϊ����߳��������ԣ����� �Ͱ����ݸ�Ϊ�Ӽ���¼��
 *
 *         ʹ�ò��裺 A:���� import java.until.Scanner; B:��������¼��Ļ������� Scanner sc = new
 *         Scanner(System.in) C:�������� int i = sc.nextInt();
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// ���������������
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("������һ�����ݣ�");
		int i = sc.nextInt();

		// ������
		System.out.println("i:" + i);
	}
}
