package com.company.boot003;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot003.member.Member;
import com.company.boot003.member.MemberRepository;
import com.company.boot003.member.MemberService;



@SpringBootTest
public class Test2_memberservice { 
	@Autowired MemberRepository memberRepository;
	@Autowired MemberService memberService;
	
	// insert, update - save
	// select - findAll , findById
	// delete - delete
	
	@Test
	void insert() {
		Member member = new Member();
		member.setUsername("user2"); 
		member.setPassword("2222"); 
		member.setEmail("user2@gmail.com");
		System.out.println(memberService.insertMember(member)); 
	}

}
