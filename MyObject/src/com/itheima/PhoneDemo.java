package com.itheima;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone = new Phone();

		System.out.println("Ʒ��:" + phone.brand);
		System.out.println("�۸�:" + phone.price);
		System.out.println("��ɫ:" + phone.color);
		System.out.println("------------------");

		phone.brand = "����";
		phone.price = 2999;
		phone.color = "��ɫ";
		System.out.println("Ʒ��:" + phone.brand);
		System.out.println("�۸�:" + phone.price);
		System.out.println("��ɫ:" + phone.color);

		phone.call("����ϼ");
		phone.sendMessage();
	}
}
