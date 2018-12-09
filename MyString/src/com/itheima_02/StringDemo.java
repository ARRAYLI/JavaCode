package com.itheima_02;

/*
 * String(String original)     初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
 * String(char[] value) 
          分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
 * 
 * String(char[] value, int offset, int count) 
          分配一个新的 String，它包含取自字符数组参数一个子数组的字符。
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
