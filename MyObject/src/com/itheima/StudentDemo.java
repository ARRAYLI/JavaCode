package com.itheima;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("student:" + student);
		System.out.println("������" + student.name);
		System.out.println("���䣺" + student.age);
		student.study();
		student.eat();

		student.name = "����ϼ";
		student.age = 28;
		System.out.println("������" + student.name);
		System.out.println("���䣺" + student.age);
	}
}
