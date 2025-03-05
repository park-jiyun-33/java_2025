package com.company.java009;

import java.util.Scanner;

public class MethodEx006_2 {
	
	public static void  who_are_you(String [][] users){ //아이디를 입력받아서 나라조회
		// 변수
		String id = ""; String st = "";
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("아이디를 입력하세요 : ");
		id = scanner.next();
		// 처리
		for(int ch = 0; ch < users.length; ch++) {
		if(id.equals(users[ch][0])) {st = users[ch][0] + "는 " + users[ch][2] + "사람입니다.";}
		}
		// 출력
		System.out.println(st);
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// 변수
		   String [][] users = {{ "aaa"  , "111"   , "한국"     } ,     // 00 01 02
		                      { "bbb" , "222"   , "호주"       } ,       // 10 11 12
		                      { "ccc"  , "333"   , "중국"      }};      // 20 21 22
		   // 입력
		   who_are_you(users);    
		   // public static 리턴값 메소드명(파라미터){해야할일}
		   // public static void  who_are_you(String [][] users){아이디를 입력받아서 나라조회}
		   
		 //  who_pass_change(users); 
		   

	}
}
