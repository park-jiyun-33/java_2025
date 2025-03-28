package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;

public class BDetail implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 언어셋팅 UTF-8
	      request.setCharacterEncoding("UTF-8");
	      response.setContentType("text/html; charset=UTF-8");
		
	    // 2. request 데이터 받아오기 no
	      int bno = Integer.parseInt(request.getParameter("bno"));
	      
	    // 3. dao 조회수올리기 dao.updateHit(번호) / 해당글상세 dao.select(번호)  
	      BoardDao dao = new BoardDao();
	      dao.updateHit(bno);
	      
	    // 4. 결과물 셋팅 : request.setAttribute()
	      request.setAttribute("dto", dao.select(bno));
	}

}
