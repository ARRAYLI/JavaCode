package com.itheima;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[6];

		for (int x = 0; x < arr.length; x++) {
			System.out.println("�������+" + (x + 1) + "Ԫ��");
			arr[x] = scanner.nextInt();
		}

		// ���Ԫ��
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + "  ");
		}
		System.out.println();

		// ʵ������Ԫ�ط�ת
		for (int x = 0; x < arr.length / 2; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length - x - 1];
			arr[arr.length - x - 1] = temp;
		}

		// ���Ԫ��
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + "  ");
		}
		System.out.println();
	}
}
