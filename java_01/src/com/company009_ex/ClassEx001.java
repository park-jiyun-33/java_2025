package com.company009_ex;

// 1. 클래스는 부품객체
// 2. 클래스는 상태와 행위

class Student001{
	// 멤버변수(속성)
	String name;
	int no, kor, eng, math;
	
	// 멤버 함수(행위)
	void info() {System.out.println("이름 : " + this.name + "\n" +
									"총점 : " + (this.kor + this.eng + this.math) + "\n" +
									"평균 : " + String.format("%.2f",  (this.kor + this.eng + this.math)/3.0));}
}

public class ClassEx001 {
	public static void main(String[] args) {
		Student001 s1 = new Student001(); // 1. new(공간빌리기, 객체생성)  2. Student001() 초기화  3. s1 지번
		s1.name = "frist"; s1.no = 11; s1.kor = 100; s1.eng = 100; s1.math=99;
		s1.info();
		Student001 s2 = new Student001(); s2.name="second";
	}
}
/*  클래스는 설계도 / 인스턴스화(heap - new - 객체생성)를 통해 - 객체(객체들 s1, s2, s3 뭉쳐서표현) / 인스턴스(각각의 s1.name, s2.name)
------------------------------------  [runtime data area]
[method:정보, static, final:공용정보]  Student001.class  /  ClassEx001.class
----------------------------------------------------------------------
[heap:동적]                                                  |[stack:잠깐빌리기]
20번째줄 : 1번지{name = frist,ni=11,kor=100,eng=100,math=99} ← s1 : 1번지
19번째줄 : 1번지{name = null,ni=0,kor=0,eng=0,math=0}        ← s1 : 1번지
                                                            |main
----------------------------------------------------------------------
 */
