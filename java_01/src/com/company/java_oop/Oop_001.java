package com.company.java_oop;

class Coffee012{
	// 멤버변수
	String name = "커피";
	int num = 1, price = 2000;

	public Coffee012() { super();}

	public Coffee012(String name, int num, int price) {
		super();
		this.name = name;
		this.num = num;
		this.price = price;
	}

	@Override public String toString() { return "Coffee012 [name=" + name + ", num=" + num + ", price=" + price + "]"; }
	
	//멤버함수
	void show() {
		System.out.println("커피이름 : " + this.name + "\n" +
						   "커피잔수 : " + this.num + "\n" +
						   "커피가격 : " + this.price);
	}
	
}
public class Oop_001 {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("카페라떼", 2, 4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();
	}
}
