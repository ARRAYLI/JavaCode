package com.itheima_02;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone = new Phone();

		System.out.println(phone.brand + "--" + phone.price + "----" + phone.color);

		phone.brand = "����";
		phone.color = "��ɫ";
		phone.price = 2999;
		System.out.println(phone.brand + "--" + phone.price + "----" + phone.color);

	}
}
