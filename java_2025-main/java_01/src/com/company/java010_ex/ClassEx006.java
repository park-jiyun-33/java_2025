package com.company.java010_ex;
// 1. 클래스는 부품객체
// 2. 상태, 행위
class Score{
	//상태-멤버변수  
	String stdid; int kor,eng,math,total; double avg;   
	//행위-멤버함수  : 총점/평균/출력 
	void total() {total = (kor + eng + math);}
	void avg() {avg = total/3.0;}
	void info() {
		total(); // 메서드안에서 메서드 호출가능
		avg();
		System.out.println("학번\tkor\teng\tmath\ttotal\tavg");
		System.out.println(this.stdid + "\t" + this.kor + "\t" + this.eng + "\t" + this.math + "\t" + this.total + "\t" + String.format("%.2f", this.avg) );
	}
	// 생성자 - 만든 메모리에 사용자가 넣어준 값 대입
	public Score(String stdid, int kor, int eng, int math) {
		this.stdid = stdid; this.kor = kor; this.eng = eng; this.math = math;}
	// 기본생성자
	public Score() { } // 상속 가능
}

public class ClassEx006 {
	public static void main(String[] args) {
		Score  s1= new Score("std1234" , 100, 100 , 99 ); 
		s1.info();
		Score s2 = new Score();
	}
}
