package com.company.java_oop;

class Sawon005{
	// 1) 인스턴스변수 : heap - new O - 실체화 - this 각각
	int pay=10000;
	
	// 2) 클래스변수 : method - new X - 공유
	static int su = 10;
	//static int basicpay=pay; // 클래스(static)는 인스턴스 사용불가
	static int basicpay2;
	//static {basicpay=2000;}
	
	// 3) 클래스메서드 : method - new X - 공유  Sawon005.showSu()
	public static void showSu() {System.out.println(su);}
	//public static void showPay() {System.out.println(this.pay);} // static는 인스턴스 사용불가
	
	// 4) 인스턴스메서드 : heap - new O - 실체화 - this 각각
	public void showA11001() {
		System.out.println(su);
		System.out.println(this.pay);}
	
	// 5) 클래스메서드
	//public static void showA11002() { // static는 인스턴스 사용불가
	//	showAll001();
	//	System.out.println(this.pay);
	//}
	
}
public class Oop_003 {
	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		//sola_showA11001(); // undefined for the type
		
	}
}
