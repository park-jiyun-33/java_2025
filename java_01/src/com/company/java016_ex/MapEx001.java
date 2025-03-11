package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
// 사전 : Entry<key, value> put , get , size , remove , contains
public class MapEx001 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		// 출력                                   // 1. key, value 줄을 서시오.
		Iterator <Entry <String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry <String, String> temp = iter.next();
			System.out.println(temp.getKey() +"\t" + temp.getValue());
		}
		
		//
		System.out.println("KING의 정보를 제공중입니다. \n 이름을 입력하세요 : ");
		Scanner scanner= new Scanner(System.in);
		String name = scanner.next();
		
		String result = "왕의 정보를 확인해주세요";
		if(map.containsKey(name)) {
			result = "ㅁ" + name + ":" + map.get(name);
		}
		System.out.println(result);
}
}
