package com.company.boot_board1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test_Board {
	@Autowired BoardRepository boardRepository;
	
	@Disabled  @Test
	public void insertBoard() {
		Board board = new Board();
		board.setBtitle("title1");
		board.setBcontent("content1");
		board.setBpass("1111");
		board.setBfile("1.jpg");
		
		try {
			board.setBip(InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) { e.printStackTrace(); }
		
		boardRepository.save(board);
	}
	
	
	@Test
	public void findAllBoard() {
		List<Board> list = boardRepository.findAll();
		System.out.println(list.get(0).getBtitle());
	}
}
