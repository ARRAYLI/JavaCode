package com.itheima_02;

/*
 * 赋值运算符：
 * 		基本的赋值运算符：=
 * 		扩展的赋值运算符：+=，-=，/=，*=，==....
 */
public class OperatorDemo {
	public static void main(String[] args) {
		// 定义变量
		int a = 10; // 把 10 赋值给 int 型的变量 a

		// += 的操作
		// 拿 += 的左边和右边的数据做+，然后再把结果赋值给左边
		a += 20;
		System.out.println("a:" + a);

		// 注意：扩展的赋值运算符，隐含了强制类型转换
		// 有一个变量a,a+=10
		// 相当于 a = (a 的数据类型)(a+10)
		short s = 1;
		s += 1;
		System.out.println(s);

	}
}
