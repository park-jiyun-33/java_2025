package com.company.java_oop_re;

class Coffee012{
	String name = "아메리카노";
	int num = 1;
	int price = 2000;
	
	void show() {System.out.println("=====커피\n" +
	                                "커피명 : " + this.name +
	                                "\n커피잔수 : " + this.num  +
	                                "\n커피가격 : " + this.price);}
	
	public Coffee012() { super(); }
	public Coffee012(String name, int num, int price) { super(); this.name = name; this.num = num; this.price = price; }
	@Override public String toString() { return "Coffee012 [name=" + name + ", num=" + num + ", price=" + price + "]"; }
	
}

public class Oop_1 {
	public static void main(String[] args) {
	Coffee012 a1 = new Coffee012("카페라떼", 2, 4000);
	a1.show();
	
	Coffee012 a2 = new Coffee012();
	a2.show();
	}
}
