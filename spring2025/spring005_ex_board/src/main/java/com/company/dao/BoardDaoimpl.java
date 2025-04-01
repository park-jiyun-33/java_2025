package com.company.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dto.BoardDto;

@Repository
public class BoardDaoimpl implements BoardDao{
	@Autowired SqlSession sqlSession;
	private static final String namespace="com.company.dao.BoardDao";
	
	@Override public int insert(BoardDto dto) { return sqlSession.insert(namespace+".insert", dto); }
	@Override public int update(BoardDto dto) { return sqlSession.update(namespace+".update", dto); }
	@Override public int delete(BoardDto dto) { return sqlSession.delete(namespace+".delete", dto); }
	@Override public int updateHit(int dto) { return sqlSession.update(namespace+".updateHit", dto); }
	@Override public BoardDto select(int dto) { return sqlSession.selectOne(namespace+".select", dto); }
	@Override public List<BoardDto> selectAll() { return sqlSession.selectList(namespace+".selectAll"); }

}
