package com.company.java008_ex;

public class Repeat003 {
	public static void main(String[] args) {
//		for(int i = 100; i <= 300; i++) {
//		if(i%100 == 0) {System.out.print(i + "\t");}
//	}
		// for
		for(int i = 100; i <= 300; i+=100) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		// while
		int i = 100; 
		while(i <= 300) {
			System.out.print(i + "\t"); i+=100;
		}
		
		System.out.println();
		
		// do while
		i = 100; 
		do{System.out.print(i + "\t"); i+=100;} while(i <= 300);
		
		System.out.println();
		
//		// while
//		i = 1; 
//		int data = 0;
//		while(i <= 3) {
//			data += 100; System.out.print(data + "\t"); i++;}
//		
//		System.out.println();
//		
//		// do while
//		i = 1; 
//		data = 0;
//		do{data += 100; System.out.print(data + "\t"); i++;} while(i <= 3) ;
//		
	
}
}

