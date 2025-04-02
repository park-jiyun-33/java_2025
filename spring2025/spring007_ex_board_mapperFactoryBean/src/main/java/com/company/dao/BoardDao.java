package com.company.dao;

import java.util.List;

import com.company.dto.BoardDto;

public interface BoardDao {
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(BoardDto dto);
	public int updateHit(int dto);
	public BoardDto select(int dto);
	public List<BoardDto> selectAll();
	
	
}
