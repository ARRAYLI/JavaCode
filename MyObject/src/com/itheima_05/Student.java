package com.itheima_05;

public class Student {
	private String name;
	private int age;

	public Student() {
		System.out.println("这是构造方法");
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("姓名：" + this.name + ",年龄：" + this.age);
	}
}
