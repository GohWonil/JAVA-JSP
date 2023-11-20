<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>리스트를 출력</h2>
 <table border="1">
 	<tr>
 		<th>번호</th>
 		<th style="width:60%">제목</th>
 		<th>작성자</th>
 		<th style="width:5%">작성일</th>
 		<th style="width:5%">조회수</th>
 	</tr>
 	
 	<!-- 데이터가 없는경우, empty-->
<c:if test="${empty list }" var="res">
	<tr>
		<td colspan="5" align="center">게시글이 존재하지않습니다. 
	</tr>
</c:if>

<c:if test="${empty not list }" var="res">
 	<tr>
 		<td>${dto.num }</td>
 		<td>${dto.title }</td>
 		<td>${dto.id }</td>
 		<td>${dto.postdata }</td>
 		<td>${dto.visitcount }</td>
 	</tr>
</c:if>

<c:forEach items="${list}" var="dto">
 	<tr>
 		<td>${dto.num }</td>
 		<td>${dto.title }</td>
 		<td>${dto.id }</td>
 		<td>${dto.postdata }</td>
 		<td>${dto.visitcount }</td>
 	</tr>
</c:forEach>
 </table>
 
 ${list }
 <c:forEach items="${list }" var="dto">
 	${ dto.titel}
 </c:forEach>
 ${list }
 <%=request.getAttribute("list") %>
</body>
</html>