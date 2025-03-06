package com.company.java013;
/*
 * 클래스는 부품객체 ( 상태(멤버변수) + 행위(멤버함수) )
Object		               Object() { #3            } #4             
↑
Parent   i, j  Parent(int i, int j) { #2   i=10/j=20} #5 
↑
Child    k        Child(10, 20, 30) { #1        k=30} #6
*/
class Parent extends Object{
	int i, j;
	public Parent() {super();}  // 1. 누구 호출 : Object()
	public Parent(int i, int j) {
		super();  // 2. 누구 호출 : Object()
		this.i = i;
		this.j = j;
	}
}
class Child extends Parent{
	int k;
	public Child() {super();}   // 3. 누구 호출 : parent()
	public Child(int i, int j, int k) { 
		super(i,j); // 4. 누구 호출 : Parent(int i, int j)
		this.k = k;}  
}

public class ExtendsBasic007_Super {
	public static void main(String[] args) {
		Child child = new Child(10, 20, 30);
		System.out.println(child.i);  // 10
		System.out.println(child.j);  // 20
		System.out.println(child.k);  // 30
		
	}
}
