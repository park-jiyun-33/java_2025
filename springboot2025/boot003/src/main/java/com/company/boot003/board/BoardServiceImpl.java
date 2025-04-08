package com.company.boot003.board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //##
public class BoardServiceImpl implements BoardService {
	@Autowired BoardRepository boardRepository; //##
	
	
	/*
	public List<Board> findAll();     // 전체리스트뽑기
	public Board       find(Long id); // 조회수올리고 / 상세보기기능
	
	public void  insert(Board board);  // 글쓰기기능
	
	public Board update_view(Long id); // 수정 폼
	public void  update(Board board); // 글수정기능
	
	public void  delete(Board board); // 글삭제기능
	*/
	
	@Override public List<Board> findAll() {// 전체리스트뽑기
		return boardRepository.findAll();
	}
	
	@Transactional // commit(반영) / rollback(되돌리기)
	@Override public Board find(Long id) { // 조회수올리고 / 상세보기기능
		Board board = boardRepository.findById(id).get();
		
		board.setBhit(board.getBhit()+1);  // 기존 조회수 +1
		boardRepository.save(board);
		return board; // 상세보기
	}

	@Override public void insert(Board board, Long member_id) { // 글쓰기기능
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}

	@Override public Board update_view(Long id) { // 수정 폼
		return boardRepository.findById(id).get();
	}

	@Override public void update(Board board) { // 글수정기능
		boardRepository.save(board);
	}

	@Override public void delete(Board board) { // 글삭제기능
		boardRepository.delete(board);
	}

}
