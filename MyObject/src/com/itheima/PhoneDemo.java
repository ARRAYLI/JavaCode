package com.itheima;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone = new Phone();

		System.out.println("品牌:" + phone.brand);
		System.out.println("价格:" + phone.price);
		System.out.println("颜色:" + phone.color);
		System.out.println("------------------");

		phone.brand = "锤子";
		phone.price = 2999;
		phone.color = "棕色";
		System.out.println("品牌:" + phone.brand);
		System.out.println("价格:" + phone.price);
		System.out.println("颜色:" + phone.color);

		phone.call("林青霞");
		phone.sendMessage();
	}
}
