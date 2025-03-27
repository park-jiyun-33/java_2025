<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>

	<div class ="container card my-5 p-3">
		<h3 class = "my-2" style="text-align:center"> BOARD - 글쓰기 </h3>
		
		<form action="list.jsp" method="post" onsubmit="return form()">
		<div class = "my-3">
			<label for="dname" class="form-lable">이름</label>
			<input type="text" class="form-control" id="dname" name="dname" />
		</div>
		<div class = "my-3">
			<label for="btitle" class="form-lable">제목</label>
			<input type="text" class="form-control" id="btitle" name="btitle" />
		</div>	
		<div class = "my-3">
			<label for="bcontent">내용</label>
			<textarea class="form-control" rows="5" id="bcontent" name="bcontent"></textarea>
		</div>	
		<div class="d-grid gap-2">
  		<input type="submit" value ="입력" class="btn btn-info text-white" />
  		<input type="reset" value ="취소" class="btn btn-outline-info" />
  		<a href="list.jsp" class="btn btn-outline-info">목록보기</a>
		</div>
		</form>
		
		<script>
		function form(){
			let dname = document.querySelector("#dname");
			let btitle = document.querySelector("#btitle");
			let bcontent = document.querySelector("#bcontent");
			
			if(dname.value == ""){alert("이름을 입력해주세요."); dname.focus(); return false;}
			if(btitle.value == ""){alert("제목을 입력해주세요."); btitle.focus(); return false;}
			if(bcontent.value == ""){alert("내용을 입력해주세요."); bcontent.focus(); return false;}
		}
		</script>
	</div>
	
<%@ include file ="../inc/footer.jsp"%>