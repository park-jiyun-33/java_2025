package com.company.java_oop_re;

class Papa extends Object{
	int money = 10000;

	public Papa() { super(); }
	public void sing() {System.out.println("GOD-거짓말");}
}
class Son2 extends Papa{
	int money = 1500;

	public Son2() { super(); }
	public void sing() {super.sing(); System.out.println("빅뱅-거짓말");}
}
public class Oop_7 {
	public static void main(String[] args) {
		Papa mypapa = new Son2();
		System.out.println(mypapa.money); // 10000
		mypapa.sing(); // GOD, 빅뱅
		
		System.out.println( ((Son2)mypapa).money);
	}
}
