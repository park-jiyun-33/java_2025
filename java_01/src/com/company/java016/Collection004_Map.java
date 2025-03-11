package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
List : 기차   인덱스 [O] , 중복허용[O] , [add(추가), get(가져오기), size(갯수), remove(삭제), contains]
Set  : 주머니  인덱스 [X],  중복허용[X] , [add, get(X) - 향for / Iterator, size, remove, contains]
Map  : 사전   [키:값] - 쌍(Entry) [put, get(key), size, remove, contains]
*/
public class Collection004_Map {
	public static void main(String[] args) {
		//   key     value  - add(X) - put , get , size , remove , contains
		Map<String, String> map = new HashMap<>();
		map.put("one", "하나");
		map.put("two", "두울");
		//map.put("one", "세엣");  키값이 같으면 덮어씀
		map.put("three", "세엣");
		
		System.out.println(map);
		System.out.println(map.get("one"));         // 2. 가져오기  맵아! key를 줄게 value를 다오
		System.out.println(map.size());             // 3. 갯수
		System.out.println(map.remove("three"));    // 4. 삭제 key object(객체)
		System.out.println(map.containsKey("one"));
		System.out.println(map.keySet());  // 키들모으기 [one, two] 키들을 모아주세요!
		System.out.println(map.values());  // 값들모으기 [하나, 두울]
		System.out.println(map.entrySet());// [one=하나, two=두울]
		//                         Set <Entry <String, String>>
		
		System.out.println();
		
		// 출력 향상된 for  Set 
		for(Entry <String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "/" + e.getValue());
		}
		
		System.out.println();
		
		// iter - ver1
		// 1.key 모으기    2.처리대상확인  3.값꺼내오기 
		Iterator <String> iter = map.keySet().iterator();  // iter → [one, two]
		while(iter.hasNext()) { // 2.처리대상확인 hasNext 
			String key = iter.next(); // 3.값꺼내오기 
			System.out.println(key + "/" + map.get(key));
		}
		
		System.out.println();
		
		// iter - ver2
		// 1.Entry 모으기  2.처리대상확인  3.값꺼내오기 
		Iterator <Entry <String, String>> eter = map.entrySet().iterator(); // iter → [one=하나, two=두울]
		while(eter.hasNext()) { // // 2.처리대상확인 hasNext 
			Entry <String, String> temp = eter.next(); // 3.값꺼내오기 
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
	}
}
