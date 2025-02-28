package com.company.java010_ex;

import java.util.Scanner;

// 1. 클래스는 부품객체
// 2. 상태(멤버변수)와 행위(멤버함수)

class Calc{
	// 상태-멤버변수
	static String name="*계산기*";
	int num1, num2;  char op;  double result;
	// 행위-멤버함수
	void input() {// 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1 > "); num1 = scanner.nextInt();
		System.out.print("숫자2 > "); num2 = scanner.nextInt();
		System.out.print("연산자 > "); op = scanner.next().charAt(0);
	} 
	void opcalc() {// +,-,*,/라면 계산
		if(op == '+') {result = num1 + num2;}
		else if(op == '-') {result = num1 - num2;}
		else if(op == '*') {result = num1 * num2;}
		else if(op == '/') {result = (double)num1 / num2;}
	}
	void show() {// 연산출력
		opcalc();
		//System.out.printf("%d%s%d = %.2f\n",num1,op,num2,result);
		System.out.println("" + num1 + op + num2 + " = " 
				+ (op !='/' ? ("" + (int)result) : String.format("%.2f", result)) );
	}
	
	// 생성자-초기화   -> Calc() 기본생성자 자동생성깨짐
	public Calc(int n1, int n2, char op2) { // 이름 힘들면 변수 이름 변경하기(this 빼도됨)
		num1 = n1; num2 = n2; op = op2;
	}
	public Calc() { }
}

public class ClassEx007 {
	public static void main(String[] args) {
		System.out.println(Calc.name); // 클래스명.static 변수 - new를 이용해서 사용 x
		
		Calc  c1= new Calc(10,3,'+');  
		c1.show();  
		System.out.println(c1.name); // 클래스명.static변수
		// The static field Calc.name should be accessed in a static way
		Calc  c2= new Calc();  
		c2.input();   
		c2.show(); 
		
		
	}
}
// c1, c2.. : 인스턴스   /   Calc.name : 클래스변수
/* 소스파일                                               -- 컴파일(번역)  -- 바이트코드
 * ClassEx007.java [Class Calc{} / class ClassEx007{}]                   Calc.class / ClassEx007.class
 * ## Class Loader
------------------------------- [ ## runtime ] 
[method:정보,static,final / 공유] 
 #1.  Calc.class / ClassEx007.class / Calc.name[*계산기*] / main
---------------------------------------------
[heap : 동적]                                  | [stack : 임시]
47번째줄 : 2번지{num1=0,num2=0,op=0,result:0.0} ←  c2 : 2번지
44번째줄 :                                        c1.show();
43번째줄 : 1번지{num1=10,num2=3,op='+',result}  ←  c1 : 1번지
41번째줄 :                                        println(Calc.name);  // *계산기*   
                                              |#2. main
---------------------------------------------
*/
