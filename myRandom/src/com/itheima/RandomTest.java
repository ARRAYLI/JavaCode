package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();

		int number = r.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("��������Ҫ�µ����֣�");
			int guessNumber = sc.nextInt();
			if (guessNumber > number) {
				System.out.println("���µ�����" + guessNumber + "����");
			} else if (guessNumber < number) {
				System.out.println("���µ�����" + guessNumber + "С��");
			} else {
				System.out.println("���µ�����" + guessNumber + "����ȷ����");
				break;
			}
		}
	}
}
