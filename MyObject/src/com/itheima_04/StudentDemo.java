package com.itheima_04;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.show();

		student.name = "����ϼ";
		student.setAge(-28);
		student.show();
	}
}
