package com.company.boot003.board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.boot003.member.Member;
import com.company.boot003.member.MemberRepository;

import net.bytebuddy.asm.MemberRemoval;

@Service  //##
public class BoardService{
	@Autowired BoardRepository boardRepository; //##
	@Autowired MemberRepository memberRepository; 
	
	public List<Board> findAll() {// 전체리스트뽑기
		//return boardRepository.findAll();
		return boardRepository.findAllByOrderByDesc(); // BoardRepository - 최신글이 위로
	}
	
	@Transactional // commit(반영) / rollback(되돌리기)
	public Board find(Long id) { // 조회수올리고 / 상세보기기능
		Board board = boardRepository.findById(id).get();
		
		board.setBhit(board.getBhit()+1);  // 기존 조회수 +1
		boardRepository.save(board);
		return board; // 상세보기
	}

	public void insert(Board board) { // 글쓰기기능
		
		board.setMember(
				memberRepository.findByUsername(board.getMember().getUsername()).get()
			);
		
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}

	public Board update_view(Long id) { // 수정 폼
		return boardRepository.findById(id).get();
	}

	public int update(Board board) { // 글수정기능
		//boardRepository.save(board);
		return boardRepository.updateByIdAndBpass(board.getId(), board.getBpass(), 
												  board.getBtitle(), board.getBcontent());
	}

	public int delete(Board board) { // 글삭제기능
		//boardRepository.delete(board);  기본 : delete from board where id=?
		return boardRepository.deleteByIdAndBpass(board.getId(), board.getBpass());
		
	}

}


/*
public List<Board> findAll();     // 전체리스트뽑기
public Board       find(Long id); // 조회수올리고 / 상세보기기능

public void  insert(Board board);  // 글쓰기기능

public Board update_view(Long id); // 수정 폼
public void  update(Board board); // 글수정기능

public void  delete(Board board); // 글삭제기능
*/
