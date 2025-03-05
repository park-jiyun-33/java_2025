package com.company.java010_ex;

class Area1{

	static double pi = 3.141592;
	static double rect(int a, int b){return a*b;}
	static double triangle(int a, int b) {return a*b*0.5;}

}
public class StaticEX001 {
	public static void main(String[] args) {
		 System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
		 System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
		 //             리턴값   메서드명(){해야할일}
		 //            double  rect(10,5){return 10*5;}
		 //   static   double  rect(int a,int b){return a*b;}
		 System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
		 //             리턴값   메서드명(){해야할일}
		 //            double  triangle(10,5){return 10*5*0.5;}
		 //   static   double  triangle(int a,int b){return a*b*0.5;}
	}
}
