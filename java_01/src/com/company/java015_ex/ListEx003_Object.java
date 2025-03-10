package com.company.java015_ex;

import java.util.ArrayList;
import java.util.Scanner;

class UserInfo{
	private  String name; private  int age;


	public UserInfo() { super();}

	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class ListEx003_Object {
	public static void main(String[] args) {
		// users ArrayList 만들기
		ArrayList<UserInfo> users = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		// 데이터 넣기
		users.add(new UserInfo("아이언맨" , 50));
		users.add(new UserInfo("헐크" , 40));
		users.add(new UserInfo("캡틴" , 120));
		
		// for + size 사용해서 출력
		/*for(int i = 0; i <= users.size(); i++) {
			UserInfo temp = users.get(i);
			System.out.println(temp.getName() + ", " + temp.getAge());
		}*/
		
		// 향상된 for문으로 데이터 출력
		for(UserInfo temp : users) {System.out.println(temp.getName() + ", " + temp.getAge());}
		
		// 사용자들의 이름 받기 - 해당 유저 자료출력
		System.out.print("원하는 유저의 이름을 입력하세요 : ");
		String input = scanner.next();
		
		for(int i = 0; i < users.size(); i++) {
		if(users.get(i).getName().equals(input)) {
			UserInfo temp = users.get(i);
			System.out.println(temp.getName() + ", " + temp.getAge());
			break;}
		}
}
}