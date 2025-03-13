package com.company.java018_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Age{
	private int no;
	private String name;
	private int age;
	
	public Age() { super(); }
	public Age(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Age [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Age other = (Age) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
	
}

public class OOP_Q7_8_9 {
	public static void main(String[] args) {
	//ArrayList * 	 dto 를 이용하여 ArrayList + Iterator  이용해서 만들기
		List<Age> list = new ArrayList<>();
		list.add(new Age( 1, "iron", 45));
		list.add(new Age( 2, "hulk", 38));
		list.add(new Age( 3, "captain", 120));
		
		System.out.println("=====================\n" + "NO\tNAME\tAGE\n"+ "=====================");
		Iterator<Age> li = list.iterator(); // 1. 모으기
		int total = 0;
		
		while(li.hasNext()) { // 2. 처리대상확인
			Age a = li.next(); // 3. 꺼내오기
			total += a.getAge();
			System.out.println(a.getNo() + "\t" + a.getName() + "\t" + a.getAge());
		}System.out.println("\n나이총합 : " + total + "\n" + 
							"나이평균 : " + String.format("%.2f", (total/3.0)) ); // (total / list.size())
		
	//HashSet *   dto 를 이용하여 HashSet   + Iterator  이용해서 만들기
		Set<Age> set = new HashSet<>();
		set.add(new Age( 1, "iron", 45));
		set.add(new Age( 2, "hulk", 38));
		set.add(new Age( 3, "captain", 120));

		System.out.println("\n=====================\n" + "NO\tNAME\tAGE\n"+ "=====================");
		Iterator<Age> se = set.iterator();
		total = 0;
		while(se.hasNext()) {
			Age a = se.next();
			total += a.getAge();
			System.out.println(a.getNo() + "\t" + a.getName() + "\t" + a.getAge());
		}
		System.out.println("\n나이총합 : " + total + "\n" + 
							"나이평균 : " + String.format("%.2f", (total/3.0)) );
		
	//HashMap *   dto 를 이용하여 HashMap   + Iterator  이용해서 만들기
		Map<Integer, Age> map = new HashMap<>();
		map.put(1, new Age( 1, "iron", 45));
		map.put(2, new Age( 2, "hulk", 38) );
		map.put(3, new Age( 3, "captain", 120));
		
		System.out.println("\n=====================\n" + "NO\tNAME\tAGE\n"+ "=====================");
		
		Iterator <Entry <Integer, Age>> ma = map.entrySet().iterator();
		total = 0;
		while(ma.hasNext()) {
			Age a = ma.next().getValue();
			total += a.getAge();
			System.out.println(a.getNo() + "\t" + a.getName() + "\t" + a.getAge());
		} System.out.println("\n나이총합 : " + total + "\n" + 
				"나이평균 : " + String.format("%.2f", (total/3.0)) );
		
	}
}
/*
ㅁ 출력된결과
		 ======================
		 NO	NAME	AGE
		 ======================
		 1	iron		45
		 2	hulk		38
		 3	captain	120
		 
		 나이총합 : 203
		 나이평균 : 67.67
*/
