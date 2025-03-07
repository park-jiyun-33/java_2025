package com.company.java014;
/*
 * 1. 클래스는 부품객체
 * 2. 상태(멤버변수) 행위(멤버함수)
 
 Object                                                       Object() {#3  }#4  객체틀
 ↑
 Parent   x = 100;                        24번[x=100 / method] Parent() {#2  }#5 x=100 / -----
          method(Parent Method)
 ↑
 Child    x = 200; / method(Chlid Method) 25번[x=200 / method] 1번지 Chil() {#1  }#6 x = 200 / method
*/
class Parent{
	int x = 100;
	void method() {System.out.println("Parent Method");}
}
class Child extends Parent{
	int x = 200;
	void method() {System.out.println("Chlid Method");}
}

public class Question001 {
	public static void main(String[] args) {
		Parent p = new Child();  // 1. 메모리 빌려오고, 객체 생성  2. Child() Parent() Objcet  3. p = 1번지
		//[x=100 / method]							            {		    사용범위          } 
		//                              p = 1번지 child()[x=200 / method] - Parent() [x=100 / -----]
		Child c = new Child();  
		// [x=200 / method] - [x=100 / method] 
		//                              c = 2번지 child()[x=200 / method] - Parent() [x=100 / -----]
		System.out.println("p.x = " + p.x);
		p.method(); 
		// #1. 자식생성자 호출시 #2. 부모생성자호출(부모인스턴스 변수 청소 x=100)  
		// #3. 같은 메서드가 있다면 자식메서드로 오버라이드  - 자식메서드 호출
		System.out.println("c.x = " + c.x);
		c.method();
	}
}
