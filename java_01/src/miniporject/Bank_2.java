package miniporject;

import java.util.Scanner;

public class Bank_2 {
	public static void main(String [] args) {
		
		// 변수
		int num;
		int bal = 0;
		char id = ' ', pass = ' ';
		int p = 0; int m = 0;
		char yn = ' ';
		
		
		Scanner scanner = new Scanner(System.in);
		// 입력 + 처리 + 출력
		// step1) 메뉴판 무한반복
		for(;;) {
			System.out.println("\n=======BANK=======\n" + "1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료\n입력 : ");
			num = scanner.nextInt();
			if(num == 9) {System.out.println("종료기능입니다."); break;}
		//step2. 기능
			switch(num) {
			case 1 : System.out.println("추가기능입니다."); 
		// step3. 
			// *ID :   _입력받기 first
			// *PASS :   _입력받기 1111 
			// *BALANCE : _입력받기 10000
			
			System.out.print("*ID : "); id = scanner.next().charAt(0);
			System.out.print("*PASS : "); pass = scanner.next().charAt(0);
			System.out.print("*BALANCE : "); bal = scanner.nextInt();

			break; // end case1
			
			case 2 : System.out.println("조회기능입니다."); 
		// step4.
			// 변수 - 임시변수 temp_id, 임시변수 temp_pass
			// 입력 - 임시변수 temp_id, 임시변수 temp_pass 입력받기
			// 처리 - if(temp_id와 id가 같고, temp_pass와 pass가 같다면) {사용자정보출력} 
			//       else if(아니라면) {비밀번호 확인해주세요.}
			char temp_id = ' ', temp_pass = ' ';
			
			System.out.print("*ID : "); temp_id = scanner.next().charAt(0);
			System.out.print("*PASS : "); temp_pass = scanner.next().charAt(0);
			
			if(temp_id == id && temp_pass == pass) 
			{System.out.print("아이디 : " + id + "\n비밀번호 : " + pass + "\n조회가 성공했습니다." + "\n잔액 : " + bal);}
			else {System.out.print("비밀번호를 확인해주세요.");}
			
			break; // end case2
			
			case 3 : System.out.println("입금기능입니다."); 
			System.out.print("*ID : "); temp_id = scanner.next().charAt(0);
			System.out.print("*PASS : "); temp_pass = scanner.next().charAt(0);
			System.out.print("입금 : "); p = scanner.nextInt();
			
			if(id == temp_id && pass == temp_pass) 
			{System.out.print("아이디 : " + id + "\n비밀번호 : " + pass + "\n입금 성공했습니다." + "\n잔액 : " + (bal += p));}
			else {System.out.print("비밀번호를 확인해주세요.");}
			
			break; // end case3
			
			case 4 : System.out.println("출금기능입니다.");
			System.out.print("*ID : "); temp_id = scanner.next().charAt(0);
			System.out.print("*PASS : "); temp_pass = scanner.next().charAt(0);
			System.out.print("출금 : "); m = scanner.nextInt();
			
			if(id == temp_id && pass == temp_pass) 
			{System.out.print("아이디 : " + id + "\n비밀번호 : " + pass + "\n출금 성공했습니다." + "\n잔액 : " + (bal -= m));}
			else {System.out.print("비밀번호를 확인해주세요.");}
			
			break; // end case4
			
			case 5 : System.out.println("삭제기능입니다."); 
			
			System.out.print("*ID : "); temp_id = scanner.next().charAt(0);
			System.out.print("*PASS : "); temp_pass = scanner.next().charAt(0);
		
			if(id == temp_id && pass == temp_pass) 
			{System.out.print("계좌를 삭제하시겠습니까?  (y/n) : "); yn = scanner.next().charAt(0);}
			else {System.out.print("비밀번호를 확인해주세요.");}
			
			if(yn == 'y') {System.out.print("삭제 처리 완료했습니다."); id = 0;}
			else if(yn == 'n') {System.out.print("취소 처리 되었습니다.");}
			
			break; // end case51
			
			}
		}
		
	}
}
