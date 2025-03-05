package com.company.java009;

public class Method004 {
	
	public static void show(int a) {System.out.println(a * 10);}
	public static void show(int a, int b, int c){System.out.println(a*100 + "\t" + b*100 + "\t" + c*100);}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3}; 
		
		show(a[0]);  // 10 출력
		// public staic 리턴값 메서드명(파라미터){해야할일}
		// public staic void show(int a){System.out.print(a*10);}
		
		
		show(a[0], a[1], a[2]);  // 100, 200, 300 출력
		// public staic 리턴값 메서드명(파라미터){해야할일}
		// public staic void show(int a, int b, int c){해야할값 *100}
		
		
		// Q1. 위에 메서드 작성
		// Q2. 메서드 이름이 같고 파라미터가 다르면 ? (오버로딩)
	}
}
