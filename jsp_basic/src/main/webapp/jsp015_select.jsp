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
		<h3 class = "card-header"> SELECT - 단일선택 </h3>
	</div>
	<%
	// username=asa&color=bg-danger
	String username = request.getParameter("username");
	String color    = request.getParameter("color");
	%>
	<table class="table table-striped">
			<caption>select 데이터 확인</caption>
			<tbody>
				<tr><th scope="row">USER</th><th><%=username%></th></tr>
				<tr><th scope="row">CHECK</th><th>
				<div class="<%=color%> text-white p-5"><%=color%></div>
				</th></tr>
			</tbody>
		</table>
</body>
</html>