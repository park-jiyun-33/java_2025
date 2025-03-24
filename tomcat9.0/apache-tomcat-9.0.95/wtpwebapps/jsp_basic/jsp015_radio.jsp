<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class ="container card my-5">
		<h3 class = "card-header"> RADIO - 단일선택</h3>
		<%
		// username=a&optradio=yes
		// request.getParameter("name값") - 값 한개일때
		String username = request.getParameter("username");
		String optradio  = request.getParameter("optradio");
		%>
		<table class="table table-striped">
		<caption>radio 데이터 확인</caption>
		<tbody>
			<tr><th scope="row">USER</th><th><%=username%></th></tr>
			<tr><th scope="row">CHECK</th><th><%=optradio%></th></tr>
		</tbody>
		</table>
	</div>
</body>
</html>