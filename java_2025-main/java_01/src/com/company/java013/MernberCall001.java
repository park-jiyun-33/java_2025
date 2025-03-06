package com.company.java013;
// 클래스는 부품객체(상태-멤버변수 / 행위-멤버함수)
//클래스변수, 인스턴스변수, 지역변수  / 클래스메서드, 인스턴스메서드
// Q6. 컴파일 에러가 발생하는 라인과 그 이유 : 
// 라인A, 라인B, 라인D - static가 없음
// 변수 초기화 단계 :  기본값 명시적초기화 초기화블록 생성자
// classValue       1)0      2)20  3)20   4)x
// instanceValue    5)0      6)10  7)20   8)10

class MernberCall001 {
	int instanceValue = 10; // 인스턴스변수, heap - new O - this
	static int classValue = 20; // 클래스변수, methid - new X - 공유 , 클래스명.변수명
	
	int instanceValue2 = classValue; // 인스턴스변수(5) = 클래스변수(1)
	// static int classValue2 = instanceValue; // static은 인스턴스 사용불가
	// static jvm로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리 할당받고 객체생성후 사용
	// 1) 라인A
	
	static void staticMethod1() { 
		System.out.println(classValue);
		//System.out.println(instanceValue); //  static은 인스턴스 사용불가
	// 2) 라인B	
	}
	void instanceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue);
	// 3) 라인C	
	}
	/*
	static void staticMethod2() {  //  static은 인스턴스 사용불가
		System.out.println(classValue);
		System.out.println(instanceValue);
	// 4) 라인D	
	}
	*/
	
	void instanceMethod2() { // 인스턴스 메서드 - heap - new O - this 각각
		staticMethod1();
	// 5) 라인E	
	}
}
