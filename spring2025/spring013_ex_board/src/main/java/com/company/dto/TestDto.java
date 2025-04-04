package com.company.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
// @NoArgsConstructor - 해결1 : 수동생성하기
@NoArgsConstructor(force=true) // 해결2 : 강제로 필드에 null or 0초기화
@RequiredArgsConstructor  // final   TestDto(String)
public class TestDto {
	private final String company;
	private int year;
	
	
}
