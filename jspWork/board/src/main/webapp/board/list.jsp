<%@page import="com.board.BoardDto"%>
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

<h2>목록</h2>

<!-- jsp를 단독으로 실행 할 경우 request 영역에 list를 저장하지 않았으므로 null이 출력된다
null값이 안나오게 하기 위해 controller를 거쳐서 실행해야 값이 나온다.
즉, controller에서 리스트를 조회후 request 영역에 저장한다. -->
	
<%
List<BoardDto> list = (List<BoardDto>)request.getAttribute("list"); 
%>

<table border = "1" >
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>id</td>
		<td>등록일</td>
	</tr>
	<%
	//조회 결과가 존재 한다면
	if(list != null && list.size()>0){
		//반복문을 돌면서 리스트 출력
		for(BoardDto dto : list){
	%>
		<tr>
			<td><a href="/board/boardView?num=<%= dto.getNum()%>"><%= dto.getTitle()%></a></td>
			<td><%= dto.getContent()%></td>
			<td><%= dto.getId()%></td>
			<td><%= dto.getPostdate()%></td>
		</tr>
	<% 
		}
	} else {
		out.print("<td colspan='5'> 조회결과가 없습니다.</td>");
	}
	%>
</table>
</body>
</html>