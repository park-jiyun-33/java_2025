package com.company.java013;

//Q7. 접근제어자 사용범위를 순서대로
// public(아무데서나) > protected(extends : 상속) > package(폴더내부) > private(클래스내부)

//Q8. 
// 8-1. 접근제어자 private -> #getters / #setters 세팅
// 8-2. 객체 상태를 표현하는 출력 #toString

// Q10. 상속의 이유 : 클래스 재사용
// Q11. 상속의 형식 : class 자식클래스 extends 부모클래스
class Car4{
	private String color;
	
	// 디폴트 생성자
	public Car4() {super();}
	
	// getters/setters  9-1
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	
	// toString
	@Override
	public String toString() {return "Car4 [color=" + color + "]";}
}

public class A011_Car4 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.setColor("red");  // 9-2
		System.out.println(c1);
	}
}
