package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();

		int number = r.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("请输入你要猜的数字：");
			int guessNumber = sc.nextInt();
			if (guessNumber > number) {
				System.out.println("您猜的数据" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("您猜的数据" + guessNumber + "小了");
			} else {
				System.out.println("您猜的数据" + guessNumber + "是正确答案了");
				break;
			}
		}
	}
}
