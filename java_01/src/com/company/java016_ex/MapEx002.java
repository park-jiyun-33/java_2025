package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class UserInfo{
	String name;
	int num;
	
	@Override public String toString() { return "UserInfo [name=" + name + ", num=" + num + "]"; }
	public UserInfo() { super(); }
	public UserInfo(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getNum() { return num; } public void setNum(int num) { this.num = num; }
}
public class MapEx002 {
	public static void main(String[] args) {
		Map<Integer, UserInfo> map = new HashMap<>();
			
		map.put(  1,  new UserInfo("아이언맨"    , 50) );  // 1 넣어도 Integer( 클래스, 객체 )
		map.put(  2,  new UserInfo("헐크"       , 40) );  // wrapper 클래스
		map.put(  3,  new UserInfo("캡틴"       , 120) ); // boxing
		map.put(  1,  new UserInfo("아이언맨-new", 50) ); 
		
//		    int a = 1; // 기초값 - 객체의 기능사용 불가
//		Integer e = 1; // 객체   - 객체의 기능사용 가능  /  객체 = 기초값 boxing - wrapper클래스
//		System.out.println(a + "\t" + e.byteValue());
		
		//출력
		
		// 향상된 for1                                          key        map! key주세요!
		for( Integer key : map.keySet()) { System.out.println(key + "/" + map.get(key)); }
		
		System.out.println();
		
		// 향상된 for2
		for( Entry<Integer, UserInfo> m : map.entrySet()) {
			System.out.println(m.getKey() + "/" + m.getValue());}
		
		System.out.println();
		
		// key set
		Iterator <Integer> iter = map.keySet().iterator();	// iter →[1, 2, 3] 1. 모으기
		while(iter.hasNext()) { // 2. 처리대상확인
			Integer key = iter.next(); // 3. 꺼내오기
			System.out.println(key + "/" + map.get(key));
		}
		
		System.out.println();
		
		// entry set
		Iterator <Entry <Integer, UserInfo>> iter2 = map.entrySet().iterator(); // 1. 모으기
		while(iter2.hasNext()) { // 2. 처리대상확인
			Entry <Integer, UserInfo> temp = iter2.next(); // 3. 꺼내오기
			System.out.println(temp.getKey() +"/" + temp.getValue());
		}
		
	}
}
