package com.company.java014;
/* Q9.
 * abstract  : 추상화, 일반화, 공통의 기능 IS-A(고양이는 동물이다)
 * interface : 실체화 관계, can do this! 약속할게,, 구현객체를 통해서 이서비스 약속 
 * 공통점 : 자식클래스를 통해 설계부분을 구현한다.
 * 차이점 : abstract 일반클래스 + 설계도 
 *        interface           설계도 추상화정도가 interface 가 높다 
 *        멤버변수는 public static final 이 붙은 상수 
 *        멤버함수는 public abstract     abstract 메서드
    Fruit(---------)
 	↑	  ↑        ↑
 Apple  Banana  Coconut - myfruit() - @Override
 * */
abstract class Fruit{
	@Override public String toString() {return "Fruit []";}
	public abstract void myfruit();
}
class Apple extends Fruit{
	@Override public void myfruit() {System.out.println("사과는 빨갛다");}	
}
class Banana extends Fruit{
	@Override public void myfruit() {System.out.println("바나나는 노랗다");}	
}
class Coconut extends Fruit{
	@Override public void myfruit() {System.out.println("코코넛은 코코하다");}	
}
public class Question003 {
	public static void main(String[] args) {
		Fruit[] fruits = {new Apple(), new Banana(), new Coconut()};
		// 부모         = 자식들
		// 한개의 자료형(부모)으로 여러개의 객체들(자식들)을 관리
		for(Fruit f: fruits) {f.myfruit();}
		
	}
}
