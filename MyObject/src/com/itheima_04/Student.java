package com.itheima_04;

public class Student {
	String name;
	private int age;

	public void show() {
		System.out.println("�����ǣ�" + name + ",������:" + age);
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("���������������!");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}
}
