package com.itheima_04;

public class Student {
	String name;
	private int age;

	public void show() {
		System.out.println("姓名是：" + name + ",年龄是:" + age);
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("您输入的年龄有误!");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}
}
