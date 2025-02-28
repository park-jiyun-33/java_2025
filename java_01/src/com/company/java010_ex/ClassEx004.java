package com.company.java010_ex;

import java.util.Scanner;

// 1. 클래스는 부품객체
// 2. 클래스는 상태(멤버변수)와 행위(멤버함수)
// 3. 생성자를 초기화
class TV{
	// 상태-멤버변수 : 채널/볼륨
	String channel; int volume;
	// 행위-멤버함수 : 채널, 볼륨 입력 : input() / 출력 : show()
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("채널 입력 : "); this.channel = scanner.next();
		System.out.print("볼륨 입력 : "); this.volume = scanner.nextInt();
	}
	void show() {
		System.out.println(this.channel + "\t" + this.volume);}
	TV(String channel, int volume){ this.channel=channel; this.volume=volume;}
	TV(){} // 기본생성자 : TV() 컴파일러 기본 자동생성, 
	       //but .. 생성자를 개발자가 손대는 순간 자동생성 취소
}
public class ClassEx004 {
	public static void main(String[] args) {
		TV t1 = new TV("JDBC", 8);
		t1.show();
		TV t2 = new TV();  // new 객체생성  2. 생성자불러서 초기화  3. t2=2번지(주소담기)
		t2.input(); 
		t2.show();
	}
}
/*
------------------------------- runtime 
[method:정보, static, final] TV.class / ClassEx004.class  ##\1
---------------------------------------------
[heap]                                   | [stack]
30번째줄 :                                  } -> 프로그램 종료
29번째줄 :                                ← t2.show() { 2번지의 channeldl출력, 2번지의 volume출력 }
28번째줄 : 2번지{ channel=aaaa, volume=7 } ← t2.input(){ 2번지의 channeldl입력, 2번지의 volume입력 }
27번째줄 : 2번지{ channel=null, volume=0 } ← t2 : 2번지
26번째줄 :                                  t1.show() { 1번지의 channel출력, 1번지의 volume출력 }
25번째줄 : 1번지{ channel=JDBC, volume=8 } ← t1 : 1번지
                                         | main  #2
---------------------------------------------
*/


