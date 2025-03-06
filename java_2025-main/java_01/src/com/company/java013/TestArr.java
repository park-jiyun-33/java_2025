package com.company.java013;import java.util.Arrays;
// Q12. Dto 역할하는 A
class A{
	private String name;
	
	// 기본생성자 (상속/오버로딩사용시)
	public A() {super();}
	
	// getters/setters(private 접근자 사용시)
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	// toString(객체상태 출력)
	@Override public String toString() {return "A [name=" + name + "]";}
}
// Q13. 클래스배열
public class TestArr {
	public static void main(String[] args) {
		A[] arr = new A[3];
		arr[0] = new A(); 
		arr[1] = new A(); 
		arr[2] = new A();
		// 생성자를 호출해 인스턴스변수를 사용가능하게 만들어야함.
		//for(int i=0; i<arr.length; i++) {System.out.println(arr[i]);}  
		for(A a : arr) {System.out.println(a);}  // 향상된 for문
		
// Q14. 오버라이딩 : 상속시 부모메서드와 같은 메서드
	}
}
