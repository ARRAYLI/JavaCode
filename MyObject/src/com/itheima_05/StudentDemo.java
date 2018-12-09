package com.itheima_05;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.show();

		Student student1 = new Student("林青霞");
		student1.show();

		Student student2 = new Student(28);
		student2.show();

		Student student3 = new Student("林青霞", 27);
		student3.show();
	}
}
