<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>


<!-- index로 돌리기! -->

<div class ="container my-5">
	<h3>NAVER BOOK</h3>
	<div class="result">
	</div>
	
	<script>
		//window.onload = function(){}; 브라우저 로딩되면 동작
		// $() jquery
		$(function(){
			/* alert("test"); */
			
		      $.ajax({
		          url:"${pageContext.request.contextPath}/books",
		          dataType:"json", 
		          type:"GET",
		          success:function(json){ // object
		        	  // 1. 데이터 분해
		        	  //console.log(json); 
		        	  let items = json.items;
		        	  //console.log(items[0]);  // 객체1개 items[0] = {title:"", image:"",,,};
		        	  
		        	  for(let i=0; i<items.length; i++){
		        		  var div12 = $('<div class="row my-3">');  // <div></div> 태그만들기
		        		  var div4  = $('<div class="col-sm-4 naverimg">').html(
		        				  	'<img src="'+items[i].image+'" style="width:100%" alt="" />');
		        		  var div8  = $('<div class="col-sm-8">').html( 
		        				  '<a href="'+items[i].link +'"><p>'+ items[i].title
		        				  +'</p><p>'+ items[i].author
		        				  +'</p><p>'+ items[i].pubdate
		        				  +'</p><p>'+ items[i].price
		        				  +'</p></a>');   // html reset해서 넣기
		        		  div12.append(div4).append(div8);  // div태그안에 p1 추가하고 p2추가
		        		  $(".result").append(div12);
		        	  }
		        	  // 2. 보여줄 화면에 껴넣기
		        	  
		        	  }, error:function(xhr, textStatus, errorThrown){
		             	$(".result").html(textStatus + "(HTTP-" + xhr.status + "/" + errorThrown);
		          } // $(".result")  document.querySelector(".result")
		       });
			
		}); // 2. jquery 브라우저 로딩되면 동작
	</script>

</div>


	<div class ="container card my-5">
		<h3 class="my-2 " style="text-align:center"> BOARD </h3>
		<%-- <%=request.getAttribute("list")%> --%>
		
		<table class = "table table-hover text-center">
		<!-- <caption>BOARD-LIST</caption> -->
		<thead>
		<tr>
			<th scope="col">NO</th>
			<th scope="col">TITLE</th>
			<th scope="col">WRITE</th>
			<th scope="col">DATE</th>
			<th scope="col">HIT</th>
		</tr>
		</thead>
		<tbody>
		<!-- for(BoardDto dto : list) -->
		<c:forEach var="dto" items="${list}"  varStatus="status">
			<tr>
				<td>${list.size() - status.index}</td> <!--  전체 5 - (0,1,2,,) -->
				<td><a href="detail.do?bno=${dto.bno}">${dto.btitle}</a></td>
				<td>${dto.bname}</td>
				<td>${dto.bdate}</td>
				<td>${dto.bhit}</td>
			</tr>
		</c:forEach>
		</tbody>
		</table>
		
	<div class="my-3" style="text-align:right">
		<a href="write_view.do" class="btn btn-info text-white">글쓰기</a>
	</div>
	</div>
	
	
<%@ include file ="../inc/footer.jsp"%>