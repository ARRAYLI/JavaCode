package com.itheima;

/*
 * 打印回文数
 */
public class Test3 {
	public static void main(String[] args) {
		for (int x = 10000; x < 1000000; x++) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int qian = x / 1000 % 10;
			int wan = x / 10000;

			if (ge == wan && shi == qian) {
				System.out.println(x);
			}
		}
	}
}
