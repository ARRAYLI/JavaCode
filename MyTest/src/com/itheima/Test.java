package com.itheima;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�������·ݣ�");
		int monnth = scanner.nextInt();
		/*
		 * if (monnth == 1) { System.out.println("����"); } else if (monnth == 2)
		 * { System.out.println("����"); } else if (monnth == 3) {
		 * System.out.println("����"); } else if (monnth == 4) {
		 * System.out.println("����"); } else if (monnth == 5) {
		 * System.out.println("����"); } else if (monnth == 6) {
		 * System.out.println("�ļ�"); } else if (monnth == 7) {
		 * System.out.println("�ļ�"); } else if (monnth == 8) {
		 * System.out.println("�ļ�"); } else if (monnth == 9) {
		 * System.out.println("�＾"); } else if (monnth == 10) {
		 * System.out.println("�＾"); } else if (monnth == 11) {
		 * System.out.println("�＾"); } else if (monnth == 12) {
		 * System.out.println("����"); } else { System.out.println("�������·�����!"); }
		 */
		if (monnth == 1 || monnth == 2 || monnth == 12) {
			System.out.println("����");
		} else if (monnth == 3 || monnth == 4 || monnth == 5) {
			System.out.println("����");
		} else if (monnth == 6 || monnth == 7 || monnth == 8) {
			System.out.println("�＾");
		} else if (monnth == 9 || monnth == 10 || monnth == 11) {
			System.out.println("����");
		} else {
			System.out.println("�����������!");
		}
	}
}
