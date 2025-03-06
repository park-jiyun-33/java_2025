package com.company.java013;
// 클래스는 부품객체
// 상태(멤버변수) 행위(멤버함수)
//Q1. 클래스 변수 : , 인스턴스변수 : , 지역변수 : , 클래스메서드 : , 인스턴스메서드 : 
//Q2. 클래스 A11 에서 오류나는 곳 수정
class A11{
	int a; // (1) : 인스턴스변수 (heap) - new O - this 각각
	A11(){}
	A11(int a){this.a = a;} // (2) : 지역변수 
	
	// void show()  (3) : 인스턴스메서드 - heap new O this
	void show() {this.a = 11; System.out.println(this.a);}
	
	// static void classMethid()  (4) 클래스 메서드 - method - new X 공유
	static void classMethid() { /*this.a = 12;*/} // static이 jvm 로딩시 제일먼저 메모리상에 올라감
	// static은 인스턴스 사용불가
	
	//int show2()  (5) : 인스턴스메서드 - heap - new O - this
	int show2() {int a=0; return a;}  // show2 메서드 안에 있는 int a는 지역변수
	// int a는 stack - 임시공간 - 변수 초기화 안됨. 주의
}

public class RepeatQ123 {
	public static void main(String[] args) {
		A11 a1 = new A11(); // (6) : 지역변수 - stack영역
		
		// Q3. 메모리 빌려오고 객체 생성하는 역할 : new
		// String은 null, int는 0으로 초기화하는 역할 : A11()
		// new A11()한 주소를 갖고 있는 것 : a1
		// Q4. 기본 생성자 반드시 선언해야하는 경우 : 생성자 오버로딩, 상속시에
		// Q5. 오버로딩이 성립하기 위한 조건이 아닌 것 : 
		// c. 리턴 타입이 달라야한다 / d. 매개변수의 이름이 달라야한다
		// 비슷한 기능의 메서드들의 이름을 같게 만들고, 알규먼트(파라미터)자료형과 갯수로 구분
	}
}
