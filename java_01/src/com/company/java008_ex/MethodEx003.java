package com.company.java008_ex;

public class MethodEx003 {
	
	public static int return_num() { return 1;}
	public static double return_float() { return 10/3.0;}
	public static String mycolor() {return "PURPLE";}
	public static String jangsu() {return "★★★★★";}
	public static int myadd(int a, int b) { return a+b; }
	public static String myban(char ch) {
		return ch == 'A'? "나는 노랑조" : ch == 'B'? "나는 주황조" : "";}
	public static String stdId(int a) {return "G" + a;}
	public static char stdAvg(int avg) {
		return avg >= 90 ? 'A' : avg >= 80 ? 'B' : avg >= 70 ? 'C' : 'D';}
	
	////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println("1. 내가 좋아하는 숫자 : " + return_num());
		System.out.println("2. 10/3.0을 실수로 표현 : " + String.format("%.4f", return_float()) ); 
		System.out.println("3. BEST COLOR : " + mycolor()); 
		System.out.println("4. 장수돌침대 별이 : " + jangsu()); 
		System.out.println("5. 10+20 = " + myadd(10,20));
		System.out.println("6. 반(노랑조/주황조) = " + myban('A'));
		System.out.println("7. 당신의 학번은? " + stdId(1111));
		System.out.println("8. 당신의 평균은? " + stdAvg(88));
	}
	////////////////////////////////////////
}
