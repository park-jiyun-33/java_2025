package com.company.java013;
// Q1. 상속도 그리기
// Q2.각클래스에서 사용할수있는 멤버변수 / 멤버메서드
/*
Object
↑
Papa2   {int money=10000 / void sing() GOD-거짓말}
↑
Son2    {int money=1500  / void sing() 빅뱅-거짓말}
*/


class Papa2 extends Object{
	int money = 10000; // 인스턴스변수
	public Papa2() {super();} // 기본생성자
	public void sing() {System.out.println("GOD-거짓말");} // 인스턴스메서드
}
class Son2 extends Papa2{
	int money = 1500; // 인스턴스변수
	public Son2() {super();} // 기본생성자
	@Override public void sing() {System.out.println("빅뱅-거짓말");} // toString(override) 인스턴스메서드
}

public class PolyMorphism005 {
	public static void main(String[] args) {
		// Q8. 부모 = 자식 관계 / 업 캐스팅 / 타입캐스팅 불필요
		//     부모는 자식을 담을 수 있다.
		Papa2 mypapa = new Son2();
		// Q3. Papa mypapa 의미? : {money=10000 / void sing()} 쓸수있게 해줄게!
		// Q4. 인스턴스화한 실제 메모리 빌려온 그림 : 
		// 1번지 {money=1500 / sing() 빅뱅} - {money=10000 / -------}
		// >> mypapa = 1번지 {money=1500 / [sing() 빅뱅} - {money=10000] / -------}
		System.out.println(mypapa.money); // Q5. 10000 출력
		mypapa.sing(); // Q6. 빅뱅-거짓말 출력
		System.out.println( ((Son2)mypapa).money);  // Q7. 1500 출력
	}
}
