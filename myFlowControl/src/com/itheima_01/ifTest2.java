package com.itheima_01;

import java.util.Scanner;

/*
	键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
	90-100	优秀
	80-90	好
	70-80	良
	60-70	及格
	60以下	不及格

 */
public class ifTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入学生的考试成绩：");
		int socre = sc.nextInt();

		if (socre > 100 || socre < 0) {
			System.out.println("您输入的成绩有误！");
		}
		if (socre >= 90 && socre <= 100) {
			System.out.println("优秀");
		} else if (socre >= 80 && socre < 90) {
			System.out.println("好");
		} else if (socre >= 70 && socre < 80) {
			System.out.println("良");
		} else if (socre >= 60 && socre < 70) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
}
