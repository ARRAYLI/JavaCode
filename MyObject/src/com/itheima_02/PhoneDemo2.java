package com.itheima_02;

public class PhoneDemo2 {
	public static void main(String[] args) {
		Phone phone = new Phone();

		phone.brand = "С��5S";
		phone.price = 1999;
		phone.color = "��ɫ";

		System.out.println(phone.brand + "--" + phone.price + "----" + phone.color);
		phone.call("����ϼ");
		phone.sendMessage();

		Phone phone2 = new Phone();
		phone.brand = "IPhon7S";
		phone.price = 7999;
		phone.color = "������";
		System.out.println(phone.brand + "--" + phone.price + "----" + phone.color);
		phone.call("������");
		phone.sendMessage();
	}
}
