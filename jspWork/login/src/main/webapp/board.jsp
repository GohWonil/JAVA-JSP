<%@page import="com.login.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
	window.onload = function(){
		
		let logoutBtn = document.querySelector("#logoutBtn");
		let loginBtn = document.querySelector("#loginBtn");
		if(logoutBtn != null){
			logoutBtn.onclick = function(){
				//로그아웃 처리 -> 로그인 페이지로 이동
				location.href = "logoutAction";
			}
		}
		
		if(loginBtn != null){
			loginBtn.addEventListener('click', function(){
				//로그인 페이지로 이동
				location.href = "login.jsp";			
			});
		}
	}
</script>

<%
	if(session.getAttribute("id") != null && !"".equals
		(session.getAttribute("id").toString())){
		//로그인 사용자
		out.print(session.getAttribute("id").toString() + " 환영합니다.");
		out.print("<button id='logoutBtn'>로그아웃</button>");
	} else {
		//로그인 전
		out.print("<button id='loginBtn'>로그인</button>");
	}
%>
<h2>게시글 목록 조회</h2>

<table border="1">
	<tr>
		<th>일련번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
	</tr>

<%
 if(request.getAttribute("list") != null){
	 List<BoardDto> list = (List<BoardDto>)request.getAttribute("list");
	 for(BoardDto dto : list){
	
%>
	<tr>
		<td><%= dto.getNum()%></td>
		<td><a href ="view?num=<%=dto.getNum()%>"><%= dto.getTitle()%></a></td>
		<td><%= dto.getId()%></td>
		<td><%= dto.getPostdate()%></td>
	</tr> 
	<% }
	 }
 	%>
</table>

</body>
</html>