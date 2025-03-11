package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx003 {
	public static void main(String[] args) {
		String[] data = { "A","D","B","D","B","D","B","C","E","C","B" };
		HashMap<String, Integer> map = new HashMap<>();	
		map.put("A", 1);
		map.put("B", 4);
		map.put("C", 2);
		map.put("E", 1);
		
		for(int i = 0; i < data.length; i++) {
			if(map.keySet().equals(data[i])) {
			Iterator <String> iter = map.keySet().iterator();
			
			}
		}
		
	}
}	
