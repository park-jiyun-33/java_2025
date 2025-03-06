package com.company.java009;

import java.util.Arrays;

public class Method005 {
	
	public static void show(int a) {System.out.println(a * 10);}
	public static void show(int a, int b, int c){System.out.println(a*100 + "\t" + b*100 + "\t" + c*100);}
	////////////////////////////////////////////////////
	public static void main(String[] args) {
		int[]a = {1, 2, 3}; 
		// [heap]1번지{0:1, 1:2, 2:3};  ← [stack]a:1번지
		
		// public staic 리턴값 메서드명(파라미터){해야할일}
		// public staic void show(int a){System.out.print(a*10);}
		show(  1 ); 
		show(a[0]); 
		
		
		// public staic 리턴값 메서드명(파라미터){해야할일}
		// public staic void show(int a, int b, int c){해야할값 *100}
		show(1,      2,    3); // 값 - value -> call by value
		show(a[0], a[1], a[2]); 
		System.out.println("main1. 배열값       : " + Arrays.toString(a));
		System.out.println("main2. 배열의 주소 값 : " + System.identityHashCode(a));  // 1406718218
		
		// public static void show(int[]a){}
		show(a);  // 주소 - reference  -> call by reference
		System.out.println("main2. 배열값 : "  + Arrays.toString(a));
	}
	////////////////////////////////////////////////////
	public static void show(int[]a){
		System.out.println("show3. 배열의 주소 값 : " + System.identityHashCode(a));
		for(int i = 0; i < a.length; i++) {a[i]+= 10;};}
}
