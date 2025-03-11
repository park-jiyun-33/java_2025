package com.company.java_oop;

class A{
	int a; // 인스턴스변수 , heap area , new O , 실체화 this 각각
	static String company; // 클래스변수 , method area , new X , 공용
	void method() {int a;} // 지역변수 , stack , 임시  *주의사항 : 무조건 초기화!
	               // int a = 0으로 초기화 하기!
}

public class Oop_002 {
	public static void main(String[] args) {
		
	}
}
