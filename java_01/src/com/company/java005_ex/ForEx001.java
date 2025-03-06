package com.company.java005_ex;

public class ForEx001 {
	public static void main(String [] args) {
		
		// q1 : 1 2 3 4 5 
		System.out.print("q1 : \t");
		for(int i = 1; i <= 5; i++)
		{System.out.print(i + "\t");}
		
		// q2 : 5 4 3 2 1
		System.out.print("\nq2 : \t");
		for(int i = 5; i >= 1; i--)
		{System.out.print( + i + "\t");}
		
		// q3 : JAVA1   JAVA2  JAVA3 
		System.out.print("\nq3 : \t");
		for(int i = 1; i <= 3; i++)
		{System.out.print("JAVA" + i + "\t");}
		
		// q4 : HAPPY3   HAPPY2  HAPPY1 
		System.out.print("\nq4 : \t");
		for(int i = 3; i >= 1; i--)
		{System.out.print("HAPPY" + i + "\t");}
		
		// q5 : 0,1,2 
		System.out.print("\nq5 : \t");
		for(int i = 0; i <= 2; i++)
		{System.out.print((i == 0 ? " " : ", ") + i );} 
		
		// q6 : 0,1,2, ,,,중간생략 ,,, 99
		System.out.print("\nq6 : \t");
		for(int i = 0; i <= 99; i++)
		{System.out.print((i == 0 ? " " : ", ") + i );} 
		
		// q7 : 10, 9,,,,중간생략 ,,, , 1 
		System.out.print("\nq7 : \t");
		for(int i = 10; i >= 1; i--)
		{System.out.print((i == 10 ? " " : ", ") + i);} 
		
		// q8 : 0, 2, 4, 6, 8 
		System.out.print("\nq8 : \t");
		for(int i = 0; i < 9; i+=2)
		{System.out.print((i == 0 ? " " : ", ") + i);} 
		
		// q9 : 0, 2, 4, 6, 8 ,,,중간생략 ,,, 18
		System.out.print("\nq9 : \t");
		for(int i = 0; i <= 18; i+=2)
		{System.out.print((i == 0 ? " " : ", ") + i);}
		
	}
}
