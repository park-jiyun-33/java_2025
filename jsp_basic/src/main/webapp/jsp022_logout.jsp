<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// logout.jsp
	//1. session 초기화코드
	// session.removeAttribute("username");
	session.invalidate();
	
	// >>>> 경로 바로 넘기기
	//2. 10초뒤에 login.jsp 페이지로 넘기기
	//ver1
	//response.sendRedirect("jsp022_login.jsp"); // 알림창 처리안됨
	
	//ver2
	//out.println("<script>alert('로그아웃합니다.'); location.href='jsp022_login.jsp';</script>");
	
	//ver3      새로고침=http-equiv='refresh' content='초; url=경로'
	out.println("<meta http-equiv='refresh' content='1; url=jsp022_login.jsp'/>");
	
	// >>>> sendRedirect (request, response 유지안됨) / dispatcher의 차이점
	// request.getRequestDispatcher("jsp022_my.jsp").forward(request, response);
	
%>