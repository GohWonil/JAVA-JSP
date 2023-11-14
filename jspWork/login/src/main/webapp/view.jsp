<%@page import="com.login.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상세보기</h2>
요청 게시글 번호: <%=request.getParameter("num") %>

<%
	if(request.getAttribute("boardDto") != null){
		BoardDto dto = (BoardDto)request.getAttribute("boardDto");
	
%>

<ul>
	<li>제목: <%=dto.getTitle() %></li>
	<li>내용: <%=dto.getContent() %></li>
	<li>작성자: <%=dto.getId() %></li>
	<li>작성일: <%=dto.getPostdate() %></li>
	<li>조회수: <%=dto.getVisitcount() %></li>
</ul>

<% } %>

</body>
</html>