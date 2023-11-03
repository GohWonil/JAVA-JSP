<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	//POST방식일때 발생하는 한글 깨짐 처리 -> 필터로 처리
	//필터작성 : web.xml, 어노테이션
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String sex = request.getParameter("sex");
	String favo = "";
	//String favo = request.getParameter("favo");
	//체크박스인 경우 여러개가 선택 될 수 있어 배열형태로 받아서 처리
	String[] favoArr = request.getParameterValues("favo");
	//1. 반복문을 이용해서 하나씩 출력
	
	//배열의 처음부터 끝까지 돌면서 값을 저장
	//for(String favoStr : favoArr)
	//	favo += favoStr + "";
	
	//인덱스를 이용한 반복문 장점은 범위를 지정하고 증감을 나타낼 수 있다.
	for(int i=0; i<favoArr.length; i++){
		favo += favoArr[i] + "";
	}
	//2. Arrays.toString()
	//out.print(Arrays.toString(favoArr));
	
	String intro = request.getParameter("intro");
%>

<ul>
	<li>아이디: <%=id %></li>
	<li>성별: <%=sex %></li>
	<li>관심사항: <%=favo %></li>
	<li>자기소개: <%=intro %></li>
</ul>

</body>
</html>