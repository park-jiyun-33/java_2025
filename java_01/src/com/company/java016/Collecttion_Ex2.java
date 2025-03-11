package com.company.java016;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class UserInfo2{
	private  String name; 
	private  int age;
	
	public UserInfo2() { super(); }
	public UserInfo2(String name, int age) { super(); this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo2 [name=" + name + ", age=" + age + "]"; }
	
	public String getName() { return name; } 
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; } 
	public void setAge(int age) { this.age = age; }
	
	// Set 사용시
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
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name);
	} 
}
public class Collecttion_Ex2 {
	public static void main(String[] args) {
		HashSet<UserInfo2> user2 = new HashSet<>();
		
		user2.add(new UserInfo2("아이언맨" , 50) );
		user2.add(new UserInfo2("헐크" , 40));
		user2.add(new UserInfo2("캡틴" , 120));
		
		//향 for 
		for(UserInfo2 u : user2) {
			System.out.println(u.getName() +"\t"+u.getAge());
		}
		
		//Iterator
		// 1. sets 모으기(Iterator) / 2. 처리대상확인(hasNext) / 3. 꺼내오기(next)
		Iterator <UserInfo2> iter = user2.iterator();
		while(iter.hasNext()) {
			UserInfo2 s = iter.next();
			System.out.println(s.getName() + "\t" + s.getAge());
		}
	}
}
