package com.itheima;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("student:" + student);
		System.out.println("姓名：" + student.name);
		System.out.println("年龄：" + student.age);
		student.study();
		student.eat();

		student.name = "林青霞";
		student.age = 28;
		System.out.println("姓名：" + student.name);
		System.out.println("年龄：" + student.age);
	}
}
