package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx001 {
	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("green");
		
		//1. 향상된 for
		for(String c :colors) {System.out.print(c + "\t");} System.out.println();
		//2. iterator
		Iterator<String> iter = colors.iterator(); // set요소들 모으기
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
		System.out.println();
		
		System.out.println(colors);
		System.out.println("갯수 출력 : " + colors.size());
	}
}	
