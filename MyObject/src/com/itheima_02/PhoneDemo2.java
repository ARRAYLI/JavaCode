package com.itheima_02;

public class PhoneDemo2 {
	public static void main(String[] args) {
		Phone phone = new Phone();

		phone.brand = "小米5S";
		phone.price = 1999;
		phone.color = "棕色";

		System.out.println(phone.brand + "--" + phone.price + "----" + phone.color);
		phone.call("林青霞");
		phone.sendMessage();

		Phone phone2 = new Phone();
		phone.brand = "IPhon7S";
		phone.price = 7999;
		phone.color = "土豪金";
		System.out.println(phone.brand + "--" + phone.price + "----" + phone.color);
		phone.call("张曼玉");
		phone.sendMessage();
	}
}
