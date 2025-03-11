package com.company.java016;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/*
1. 콜렉션프레임워크
- [배열]의 단점을 개선한 클래스 [객체]만 저장가능(동적배열)
- 저장공간의 크기를 [동적]으로 관리함

2. 핵심 인터페이스[List, Set, Map]
- 인터페이스를 통해서 틀이 잡혀 있는 방법으로 다양한 컬렉션 클래스를 이용함.

  List : 기차   인덱스 [O] , 중복허용[O] , [add(추가), get(가져오기), size(갯수), remove(삭제), contains]
  Set  : 주머니  인덱스 [X],  중복허용[X] , [add, get(X) - 향for / Iterator, size, remove, contains]
  Map  : 사전   [키:값] - 쌍(Entry) [put, get(key), size, remove, contains]
*/
class UserInfo{
	private String name;
	private int age;
	
	public UserInfo() { super(); }
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age;}
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	
	public String getName() { return name; } 
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; } 
	public void setAge(int age) { this.age = age; }
	
	
	//
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}
public class Collection_EX {
	public static void main(String[] args) {
		ArrayList<UserInfo> user = new ArrayList<>();
		
		user.add(new UserInfo("아이언맨" , 50));
		user.add(new UserInfo("헐크" , 40));
		user.add(new UserInfo("캡틴" , 120));
		
		// for + size
		for(int i = 0; i < user.size(); i++) {
			UserInfo temp = user.get(i);
			System.out.println(temp.getName() +"\t"+ temp.getAge());
		}
		
		System.out.println();
		
		// 향 for  꺼내오는 자료형 : 리스트, 배열
		for(UserInfo temp : user) {
			System.out.println(temp.getName() +"\t"+ temp.getAge());
		}
		System.out.println();
		
		
		// Set
		HashSet<UserInfo> sets = new HashSet<>();
		sets.add(new UserInfo("아이언맨" , 50));
		sets.add(new UserInfo("헐크" , 40));
		sets.add(new UserInfo("캡틴" , 120));
		
		for(UserInfo u : sets) {
			System.out.println(u.getName() + "\t" + u.getAge());
		}
		
		System.out.println();
		
		Iterator <UserInfo> iter = sets.iterator(); // sets모으기
		while(iter.hasNext()) {// 처리대상확인
			UserInfo u = iter.next(); // 꺼내오기
			System.out.println(u.getName() + "\t" + u.getAge());
		}
	}
}
