package com.itheima_06;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("����ϼ");
		student.setAge(28);
		System.out.println(student.getName() + "----" + student.getAge());

		Student student2 = new Student("����ϼ", 28);
		System.out.println(student.getName() + "----" + student.getAge());

	}
}
