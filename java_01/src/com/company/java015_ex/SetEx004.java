package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Score{
	private String name;
	private int no1, no2, no3;
	
	public Score() { super(); }

	public Score(String name, int no1, int no2, int no3) {
		super();
		this.name = name;
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
	}

	@Override public String toString() { return "Score [name=" + name + ", no1=" + no1 + ", no2=" + no2 + ", no3=" + no3 + "]"; }

	@Override
	public int hashCode() {
		return Objects.hash(name, no1, no2, no3);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(name, other.name) && no1 == other.no1 && no2 == other.no2 && no3 == other.no3;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getNo1() { return no1; }
	public void setNo1(int no1) { this.no1 = no1; }
	public int getNo2() { return no2; }
	public void setNo2(int no2) { this.no2 = no2; }
	public int getNo3() { return no3; }
	public void setNo3(int no3) { this.no3 = no3; }
}
public class SetEx004 {
	public static void main(String[] args) {
		//1. HashSet 만들기
		HashSet<Score> scores = new HashSet<>();
		
		//2. 데이터 넣기
		scores.add(new  Score("아이언맨",30,40,50));
		scores.add(new  Score("아이언맨",30,40,50));
		scores.add(new  Score("아이언맨",30,40,50));
		scores.add(new Score("헐크"   ,40,60,70));
		scores.add(new  Score("캡틴",80,90,100));
		
		//갯수는 3개로 나오게 만들기
		System.out.println("유저수 : " + scores.size() + "명");
		
		//3. Iterator로 출력하기 - 사용자정보,총점, 평균 
		Iterator<Score>iter = scores.iterator(); // 1) set모으기
		while(iter.hasNext()) { // 2. 처리대상 확인
			Score s = iter.next(); // 3. 꺼내오기
			int total = s.getNo1() + s.getNo2() + s.getNo3();
			double avg = total/3.0;
			System.out.println("이름 : " + s.getName() + "\t" +
								s.getNo1() + "\t" + s.getNo2() + "\t" + s.getNo3() + "\t" +
								"총점 : " + total + "\t" +
								"평균 : " + String.format("%.2f", avg) );
		}
		
	}
}
