package miniporject;

import java.util.Scanner;

public class Bank_3 {
	public static void main(String [] args) {
		// 변수
		int num = 0, age = 0, bal = 0, p = 0, m = 0;
		char id = ' ', pass = ' ', yn = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 메뉴판 무한 반복 
		for(;;) {
			System.out.println("\n=======BANK=======\n" + "1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료\n입력 : ");
			num = scanner.nextInt();
			if(num == 9) {System.out.println("종료"); break;}
			
		// 2. 기능 - (1)추가
			if(num == 1) {System.out.println("추가 기능입니다.");
			System.out.print("ID : "); id = scanner.next().charAt(0);
			System.out.print("PASS : "); pass = scanner.next().charAt(0);
			System.out.println("AGE : "); age = scanner.nextInt();
			System.out.println("BALANCE : "); bal = scanner.nextInt();
		} // E : if(1)
		
		// 3. 기능 - (2)조회
			// 임시 변수
			char temp_id = ' ', temp_pass = ' ';
			
			for(; num == 2 || num == 3 || num == 4 || num == 5;) {
				System.out.print("*ID : "); temp_id = scanner.next().charAt(0);
				System.out.print("*PASS : "); temp_pass = scanner.next().charAt(0);
				if(id == temp_id && pass == temp_pass) {break;}
				else {System.out.println("비밀번호를 확인해주세요.");}
			} // E : 로그인 확인 반복
			
			if(num == 2) {
			System.out.print("아이디 : " + id + "\n비밀번호 : " + pass + "\n조회 성공했습니다." + "\n잔액 : " + bal);
			} // E : 조회기능
			if(num == 3) {
				System.out.print("입금 : "); p = scanner.nextInt();
				System.out.print("아이디 : " + id + "\n비밀번호 : " + pass + "\n입금 성공했습니다." + "\n잔액 : " + (bal += p));
			}// E : 입금 기능
			if(num == 4) {
				System.out.print("출금 : "); m = scanner.nextInt();
				System.out.print("아이디 : " + id + "\n비밀번호 : " + pass + "\n출금 성공했습니다." + "\n잔액 : " + (bal -= m));
			} // E : 출금 기능
			if(num == 5) {
				System.out.print("계좌를 삭제하시겠습니까?  (y/n) : "); yn = scanner.next().charAt(0);
				if(yn == 'y') {System.out.print("삭제 처리 완료했습니다."); id = 0;}
				else if(yn == 'n') {System.out.print("취소 처리 되었습니다.");}
			} // E : 삭제 기능
		} // E : for(무한반복)

		
		
		
	} // E : main
} // E : class
