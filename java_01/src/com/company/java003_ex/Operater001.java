package com.company.java003_ex;

import java.util.Scanner;

public class Operater001 {
	public static void main(String [] args) {
		// 먼저() 값(+, -, *, /, %, ++, --) 비교(>, <, >=, <=) 조건(&&, ||, ?:) 대입(=)
		// 1. 값(+, -, *, /, %, ++, --)
		int a = 10, b= 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 몫    : 3
		System.out.println(a % b); // 나머지 : 1
	
		// Q1. 나머지 연산자 - 짝수니? 홀수니?
			// 짝수 : 0(짝) 1(홀) 2(짝) 3(홀) - 2로 나눴을때 나머지가 0이라면 짝수
			// 0%2 == 0  0이면 짝수
			// 1%2 == 1  1이면 홀수
			// 2%2 == 0  0이면 짝수
			System.out.println(0%2 + " " + 1%2 + " " + 2%2 + " " + 3%2);
		
		// Q2. 3의 배수?
			// 1%3 = 1  나머지 1
			// 2%3 = 2  나머지 2
			// 3%3 = 0  나머지 3   // 3의 배수라면 0 / 나머지는 0, 1, 2
			System.out.println(1%3 + " " + 2%3 + " " + 3%3);  // 1 2 0
		
		// 2. 비교( == , != , < , > , <=(이하) , >=(이상) )
		// Q1. 나머지 연산자 - 짝수니? 홀수니?
		// Q2. 3의 배수?
		System.out.println(10 > 3);  // true
		System.out.println(10 < 3);  // false
		// a = 10   a가 짝수니?  == 2로  나머지연산시 0 ==  a%2==0
		System.out.println( a%2 == 0 );  // 짝수 표현 true
		System.out.println( a%2 == 1 );  // 홀수 표현 false
		// b =3  b가 3의 배수니?  ==  3으로 나머지연산시 0
		System.out.println( b%3 == 0 );
		
		// 3. 조건( & , &&(조건, 조건2 모든조건 만족시) , | , ||(조건1, 조건2 여러조건중 하나) )
		System.out.println( true & true );   // true
		System.out.println( true && true );  // true  모든 조건 만족시
		System.out.println( false & true );  // &         처음도 false  뒤에 조건까지 읽음
		System.out.println( false && true ); // Dead code
		
		System.out.println( true  |  true );  // 하나라도 조건에 맞으면 ok
		System.out.println( true  || true );  // Dead code
		System.out.println( false |  true );  // 
		System.out.println( false || true );  // 
		
		// 4.  (조건)?  참:거짓 
		System.out.println( (a > b)? "a > b" : "a < b" );
		System.out.println( (3 % 2 == 0)? "짝수" : "홀수" );
		
		// q1. 2의 배수이면서 5의 배수라면 true / false
		System.out.println( a%2 == 0 && a%5 == 0);
		// q1. 2의 배수이거나 3의 배수라면 true / false
		System.out.println( a%2 == 0 || a%3 == 0);
		// q1. 숫자를 입력받아 0보다 크면 양수, 0보다 작으면 음수, 아니라면 0
		int c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		c = scanner.nextInt();
		System.out.println((c > 0)? "양수" : (c < 0)? "음수" : "0");
		
		
		// 대입
		a = 10;
		System.out.println( a += b );  // 1)a + b  2) a = 1번한 결과
		System.out.println( a -= b );
		System.out.println( a *= b );
		System.out.println( a /= b );
		System.out.println( a %= b );
		//////////// () 값 비교조건 대입
	
		// 6. ++ , -- (단항)
		int a1 = 1, b1 = 1, c1 = 1, d1 = 1;
		//                    ←
		System.out.println(++a1); // 2   (1)증가 (2)출력
		System.out.println(a1);   // 2    
		//                 ←
		System.out.println(b1++); // 1   (1)출력 (2)증가
		System.out.println(b1);   // 2
		//                    ←
		System.out.println(--c1); // 0   (1)감소 (2)출력
		System.out.println(c1);   // 0
		//                 ←
		System.out.println(d1--); // 1   (1)출력 (2)감소
		System.out.println(d1);   // 0
		
	}
}
