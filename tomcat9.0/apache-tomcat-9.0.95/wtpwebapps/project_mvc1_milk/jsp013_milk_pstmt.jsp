<%@page import="java.sql.*"%>
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
<div class="mt-4 p-5 bg-info text-white">
  <h1>MILK ORDER project</h1>
  <p>preparedStatement Ex</p>
</div> <!-- bg-  primary(파랑)  danger(빨강)  warning(노랑)  dark(블랙)  info(하늘색)  secondary(회색) -->
<body>
	<div class ="container card my-5">
		<h3 class = "card-header"> Milk Order </h3>
		
	<table class="table table-bordered table-hover my-5">
    <caption>우유</caption>
    <thead class = "table-info">
      <tr>
        <th scope="col">NO</th>
        <th scope="col">NAME</th>
        <th scope="col">PRICE</th>
      </tr>
    </thead>
    <tbody>
		
		
		<%
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try{
		// 1. 드라이버 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. db연동
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mbasic", "root", "1234");
		
		//3. PreparedStatement
		pstmt = conn.prepareStatement("select * from milk");
		rset = pstmt.executeQuery(); // select 표
		
		while(rset.next()){ // 줄
			// out.println(rset.getInt("mno") + "/" + rset.getString("mname") + rset.getInt("mprice") + "<br/>"); }
			int mno = rset.getInt("mno");
			String mname = rset.getString("mname");
			int mprice = rset.getInt("mprice");
		%>
		<tr>
	        <td><%=mno%></td>
	        <td><%=mname%></td>
	        <td><%=mprice%></td>
	    </tr>
		<%
			}
		//4. 결과물처리
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rset != null){rset.close();}
			if(pstmt != null){pstmt.close();}
			if(conn != null){conn.close();}
		}
		
		%>
		
	
      
    </tbody>
  </table>
		
	</div>
</body>
</html>