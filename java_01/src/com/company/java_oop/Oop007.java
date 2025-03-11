package com.company.java_oop;
/*
	Object
	 ↑
	Papa {money = 10000 / sing()}
	 ↑
	Son2 {money = 1500 /  sing()}
*/
class Papa extends Object{
	int money = 10000;
	public Papa() { super(); }
	public void sing() {System.out.println("GOD-거짓말");}
}
class Son2 extends Papa{
	int money = 1500;
	public Son2() { super(); }
	@Override public void sing() {System.out.println("빅뱅-거짓말");}
}

public class Oop007 {
	public static void main(String[] args) {
		Papa myPapa = new Son2();
		// Papa myPapa                           {money = 10000 / sing()}
		// new Son2() {money = 1500 /  sing()} - {money = 10000 / ------} @Override
		System.out.println(myPapa.money); // 10000
		myPapa.sing(); // 빅뱅-거짓말
		
		System.out.println(((Son2)myPapa).money);
	}
}
