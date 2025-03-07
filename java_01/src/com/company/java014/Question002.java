package com.company.java014;

import java.util.ArrayList;

/* 1. 클래스는 부품객체
 * 2. 상태(멤버변수) 행위(멤버함수)
 * 
Q2. 상속도 그리기
Object										Object(){#3 }#4
↑
Papa    {money = 10}           / toString     Papa(){#2 }#5
↑
Son     {money = 150; car = 2;}/ toString      Son(){#1 }#6   Override
*/
class Papa{
	int money = 10;
	public Papa() {}
	public Papa(int money) {this.money = money;}
	@Override public String toString() {return "Papa [money=" + money + "]";}
	
}
class Son extends Papa{
	int money = 150;
	int car = 2;
	public Son() {super();}
	public Son(int money) {this.money = money;}
	public Son(int money, int car) {this.money = money; this.car = car;}
	@Override public String toString() {return "Son [money=" + money + ", car=" + car + "]";}
}


public class Question002 {
	public static void main(String[] args) {
		Papa p1 = new Papa();     // [money = 10, toString] 
                                 // 1번지 {money = 10 / toString}
		System.out.println(p1); // Q3. Papa [money=10]
		
		Son s2 = new Son();       // [money = 150, car = 2, toString]-[money = 10, toString] 
		                         // s2 = 2번지{money = 150, car = 2 / -----}
		System.out.println(s2); // Q4. Son [money=150, car=2]
		
	 // Son s3 = new Papa();      // [money = 150, car = 2, toString]-[money = 10, toString]
								 // s3 = 3번지                   Papa(){money = 10, toString}
	 // System.out.println(s3); // Q5. 실행시 오류 
		
		Papa p4 = new Son();    // s2 = 4번지 [money = 150, car = 2, toString]-[money = 10, -----]  @Override 
		System.out.println(p4); // Q6. Son [money=150, car=2]
		System.out.println(p4.money); // 10
		
		Papa p5 = new Son(); // 1. 부모 = 자식 / 부모는 자식을 담을 수 있다(업캐스팅 - 타입캐스팅 필요X)
		Son s5 = (Son)p5;    // 2. 자식 = 부모 / 자식은 부모를 담을 수 있다(다운캐스팅 - 타입캐스팅 필요O) / 부모는 자식생성자를 호출한 적이 있어야한다.
		// Son         s5 [money = 150, car = 2, toString]-[money = 10, toString]
		// p5 = 5번지 Son(){money = 150, car = 2, toString}-Papa(){money = 10, ------}
		System.out.println(s5); // Q7. Son [money=150, car=2]
		System.out.println(s5.money); // Q8. 150
		System.out.println(((Papa)s5).money); // 10
		System.out.println(((Papa)s5).toString()); // 오버라이딩 : Son [money=150, car=2]
		
		ArrayList<String> list = new ArrayList<>(); // 다음주 진행 ctrl + shift + o
		//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
		
		/* Q8.
		 * 오버로딩 : 메서드의 이름을 같게, 알규먼트(파라미터)의 자료형과 갯수를 다르게해 구분 / 비슷한 기능
		 * 오버라이딩 :상속시 부모의 메서드를  자식에게 맞게 수정해서 사용
		*/
	}
}
