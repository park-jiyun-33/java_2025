<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- login.jsp -->
<!-- login.jsp -->

<!-- header.jsp --> 
<%@ include  file="jsp022_header.jsp" %> 
<!-- header.jsp --> 

	<div class ="container card my-5">
		<h3 class = "card-header bg-info text-white"> JOIN </h3>
		
	<p class="my-5" style="text-align:center"><img src="img/login.png" alt="login"></p>
	
	<form action="<%=request.getContextPath()%>/user_join" method="post" onsubmit="return form()">
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
			<button type="submit" class="btn btn-info text-white">LOGIN</button>
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
	
<!-- login.jsp -->
<!-- login.jsp -->

<!-- footer.jsp -->
<%@ include  file="jsp022_footer.jsp"%>
<!-- footer.jsp -->

<!-- 로그인시 아이디 유지하기 체크기능 -->