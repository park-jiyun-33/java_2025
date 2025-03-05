package com.company.java009;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx006 {
	
	//아이디를입력받아서 나라조회 
	public static void who_are_you(String [][] users){ 
		// 변수
		String id = ""; String st = "";
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("아이디를 입력해주세요 :"); id = scanner.next();
		// 처리
		// if(입력 받은 id? "aaa" 같니) {aaa는 한국사람입니다.}
		// if(입력 받은 id? "bbb" 같니) {bbb는 호주사람입니다.}
		// if(입력 받은 id? "ccc" 같니) {ccc는 중국사람입니다.}
		
		// if(id.eqals(users[0][0]) {users[0][0]+"는" +  users[0][2] +"사람입니다."}
		// if(id.eqals(users[1][0]) {users[1][0]+"는" +  users[1][2] +"사람입니다."}
		// if(id.eqals(users[2][0]) {users[2][0]+"는" +  users[2][2] +"사람입니다."}
		
		// equals()는 내용 비교.(객체끼리 내용 비교 - call by value)
		for(int ch = 0; ch < users.length; ch++) {
			if(id.equals(users[ch][0])) {st = users[ch][0] + "는" + users[ch][2] + "사람입니다.";}
		}
		// 출력
		System.out.println(st);}
	
	//아이디,비밀번호가 맞으면 비밀번호 바꾸기
	public static void who_pass_change(String [][] users){ 
			// 변수
			String temp_id = "", temp_pass;
			String result = "유저를 확인해주세요.";
			Scanner scanner = new Scanner(System.in);
			//입력
			System.out.println("아이디를 입력해주세요 : "); temp_id = scanner.next();
			System.out.println("비밀번호를 입력하세요 : "); temp_pass = scanner.next();
			//처리
			// 1) 사용자 인증  - if(입력받은 아이디와 "aaa" / 입력받은 비번과 111같다면) { 해당유저의 층확인(0층) }
			//              - if(입력받은 아이디와 "bbb" / 입력받은 비번과 222같다면) { 해당유저의 층확인(1층) }
			//    사용자 인증2 - if((temp_id.equals(users[0][0]) && (temp_id.equals(users[0][1])) { 0층 }
			//              - if((temp_id.equals(users[1][0]) && (temp_id.equals(users[1][1])) { 0층 }
			// 2) 맞다면 새로운 비번 입력 - 변경하실 비밀번호를 입력해주세요123 
			int find = -1;
			for(int ch = 0; ch < users.length; ch++) {
			if(temp_id.equals(users[ch][0]) && temp_pass.equals(users[ch][1]) ) { find = ch; break;}
			}
			if(find != -1) {
				System.out.println("변경하실 비밀번호를 입력해주세요 : ");
				users[find][1] = scanner.next(); result =Arrays.toString(users[find]);
			}
			// 출력
			System.out.println("정보확인 : " + result);
	}
	
	////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		 // 변수
		   String [][] users = {{"aaa", "111", "한국"} ,     // 00 01 02
		                        {"bbb", "222", "호주"} ,     // 10 11 12
		                        {"ccc", "333", "중국"}};     // 20 21 22
		   
		   // 입력
		   who_are_you(users);   
		   // public static 리턴값 메소드명(파라미터){해야할일}
		   // public static void who_are_you(String [][] users){  아이디를입력받아서 나라조회 }
  
		   who_pass_change(users); 
		   // public static void who_pass_change(String [][] users){ 아이디,비밀번호가 맞으면 비밀번호 바꾸기}
		}
	
	}
