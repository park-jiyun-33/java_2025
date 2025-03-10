package com.company.java_oop;

class Sawon005{
	int pay=10000;
	
	static int su = 10;
	//static int basicpay=pay; // static는 인스턴스 사용불가
	static int basicpay2;
	//static {basicpay=2000;}
	
	public static void showSu() {System.out.println(su);}
	
	//public static void showPay() {System.out.println(this.pay);} // static는 인스턴스 사용불가
	public void showA11001() {
		System.out.println(su);
		System.out.println(this.pay);
	}
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
