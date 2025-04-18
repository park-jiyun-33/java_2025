package com.thejoa.boot3;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot3.member.Member;
import com.thejoa.boot3.member.MemberRepository;
import com.thejoa.boot3.member.MemberService;


@SpringBootTest
class Test2_MemberService {
	@Autowired MemberRepository memberRepository;
	@Autowired MemberService memberService;

//	@Disabled
	@Test
	public void insert() {
		Member member = new Member();
		member.setUsername("first");
		member.setPassword("1111");
		member.setEmail("first@gmail.com");
		System.out.println( memberService.insertMember(member) );
	}
	
	@Disabled
	@Test
	public void findAll() {
		List<Member> list = memberRepository.findAll();
		System.out.println(list);
	}
	
	@Disabled
	@Test
	public void findId() {
		System.out.println(memberRepository.findById(1L).get());
	}
	
	@Disabled
	@Test
	public void findUsername() {
		System.out.println(memberRepository.findByUsername("first").get());
	}
	
	@Disabled
	@Test
	public void update() {
		Member member = memberRepository.findById(1L).get();
		member.setUsername("one");
		memberRepository.save(member);
	}
	
	@Disabled
	@Test
	public void updatePassword() {
		memberRepository.updateByIdAndPassword("1234", "1111", 1L);
	}
	
	@Disabled
	@Test
	public void delete() {
		Member member = memberRepository.findById(1L).get();
		memberRepository.delete(member);
	}
}
