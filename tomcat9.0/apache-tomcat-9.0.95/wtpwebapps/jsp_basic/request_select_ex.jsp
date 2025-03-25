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
		<h3 class = "card-header"> select box </h3>
		
		<form action="select_ex.jsp" method="get" onsubmit="return select()">
			<div class="mb-3 mt-3">
			<!-- label for / id 같게 -->
			    <label for="username" class="form-label">NAME:</label>
			    <input type="text" class="form-control" id="username"
			    	   placeholder="사용자이름을 적어주세요!" name="username">
			 </div><!-- user name -->
			 <!-- select -->
			 <!-- select -->
			 <label for="fruit">과일 선택 : </label>
			<select class="form-select" id="fruit" name="fruit">
			  <option value="" >-- 선택 --</option>
			  <option value="apple" >APPLE</option>
			  <option value="banana">BANANA</option>
			  <option value="coconut">COCONUT</option>
			</select>
			<!-- select -->
			<!-- select -->
			<div class="my-3">
			<button type="submit" class="btn btn-danger">수신체크하러가기</button>
			</div>
			<script>
			function select(){
				let username = document.querySelector("#username");
				let fruit     = document.querySelector("#fruit option:checked");
				console.log(fruit.value);
				
				if(username.value == ""){alert("빈칸입니다."); username.focus(); return false;}
				if(   fruit.value == ""){alert("옵션선택해주세요!"); fruit.focus(); return false;}
			}
			</script>
		</form>
	</div>
</body>
</html>