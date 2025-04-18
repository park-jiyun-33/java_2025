package com.thejoa.boot3.board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class PagingDto {
	private int listtotal;     // #1) 전체글    122
	private int onepagelist;   // #2) 한페이지에 보여줄 게시물의 수 10
	private int pagetotal;     // #3) 총페이지수 122/10 = 13    12페이지 + 2개의 글
	private int bottomlist;    // #4) 하단의 페이지 나누기   이전  11 12 13  .... 몇 개?
	
	private int pstartno;      // #5) 페이지의 스타트번호  [1] : 최신글 0~10개
	
	private int current;       // #6) 현재 페이지 번호
	private int start;         // #7) 시작 페이지 번호
	private int end;           // #8) 마지막 페이지 번호
	
	public PagingDto(int listtotal, int pstartno) {  // 0 1 2 3
		super();
		this.listtotal = listtotal;  // 전체 계산한 값  122
		this.onepagelist = 10;
		
		// 122/10 = 13페이지
		if (this.listtotal <= 0) {
			this.listtotal = 1;
		}
		this.pagetotal = (int) Math.ceil(listtotal/(double)onepagelist);
		
		this.bottomlist = 10;
		
		this.pstartno = pstartno*10;    // limit 0, 10    10, 10    20, 10
		//      1(0)      2(10)   3(20)   4(30)    5(40)    6   7   8   9  10  다음(100)
		// 이전  11(100)  12      13      14      [15]      16  17  18  19  20  다음
		// 현재) pstartno = 10이라고하면 현재페이지번호는 2
		// 현재) pstartno = 40이라고하면 현재페이지번호는 5
		this.current = (this.pstartno/this.onepagelist) + 1;
		
		// 시작)  11  15  20 (20을 11, 15를 11, 11을 11 -> 앞자리를 1 -> 1*10 + 1)
		this.start = ((this.current-1)/this.bottomlist)*this.bottomlist + 1;
		
		// 끝)
		this.end = this.start + this.bottomlist-1;
		//         13 < 20
		if (this.pagetotal < this.end) {
			this.end = this.pagetotal;
		}
	}
}
