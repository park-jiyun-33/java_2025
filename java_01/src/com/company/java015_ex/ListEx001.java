package com.company.java015_ex;

import java.util.ArrayList;

public class ListEx001 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		System.out.println(colors);
		System.out.println(colors.get(0)); // red
		System.out.println(colors.get(1)); // green
		System.out.println(colors.get(2)); // blue
		
		for(int i = 0; i<colors.size(); i++)
		{System.out.print(colors.get(i) + "\t");}
	}
}
