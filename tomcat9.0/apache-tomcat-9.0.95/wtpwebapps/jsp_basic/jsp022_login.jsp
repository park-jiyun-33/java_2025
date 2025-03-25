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
	<div class="my-5"><%=session.getAttribute("username")%></div>
	
		<h3 class = "card-header bg-info text-white"> LOGIN </h3>
		
	<p class="my-5" style="text-align:center"><img src="img/login.png" alt="login"></p>
	
	<form action="jsp022_login_action.jsp" method="post" onsubmit="return form()">
		<div class = "my-3">
			<label for="name" class="form-lable">아이디</label>
			<input type="text" class="form-control" id="name" name="name" />
		</div>
		<div class = "my-3">
			<label for="pass" class="form-lable">비밀번호</label>
			<input type="password" class="form-control" id="pass" name="pass" />
		</div>	
		<div class = "my-3">
			<label for="check" class="form-lable">아이디기억하기</label>
			<input type="checkbox" id="check" name="remember" />
		</div>
		<div class = "my-3">	
			<button type="submit" class="btn btn-info">LOGIN</button>
		</div>
		</form>
		<script>
		function form(){
			let name   = document.querySelector("#name");
			let pass = document.querySelector("#pass");
			
			if(name.value == ""){alert("빈칸입니다."); name.focus(); return false;}
			if(pass.value == ""){alert("빈칸입니다."); pass.focus(); return false;}
		}
		</script>
	</div>
</body>
</html>