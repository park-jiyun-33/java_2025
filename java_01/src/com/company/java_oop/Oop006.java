package com.company.java_oop;
/*
1. 상속 ? : 재사용
2. class 자식 extends 부모
3. 
	Object			#4 Object() {         #5} 객체생성
	  ↑
	  A1   {a}		#3 A1()     {    a=0; #6}
	  ↑
	  B1   {b}		#2 B1()     {    b=0; #7}
	  ↑
	  C1   {c}		#1 C1()     {    c=0; #8}
	  
	  객체 호출순서 :  C1()    B1()  A1()  Object()
	  객체 생성순서 :  Object  A1    B1    C1
*/
class A1 extends Object{ 
	int a;
	public A1() { super(); }
	public A1(int a) { super(); this.a = a; }
}
class B1 extends A1{
	int b;
	public B1() { super(); }
	public B1(int b) { super(); this.b = b; }
	public B1(int a, int b) {super(a); this.b=b;}
}
class C1 extends B1{
	int c;
	public void showC() {
		System.out.println("상속받은 A클래스의 a : " + a);
		System.out.println("상속받은 B클래스의 b : " + b);
		System.out.println("자심의멤버C클래스의 c : " + c);
	}
	public C1() { super(); }
	public C1(int a, int b) { super(a, b); }
	public C1(int b) { super(b); }
	
}
public class Oop006 {
	public static void main(String[] args) {
		C1 myc = new C1();
		myc.a = 10;
		myc.b = 20;
		myc.c = 30;
		myc.showC();
	}
}

