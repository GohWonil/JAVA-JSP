<%@page import="com.momo.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>forward 페이지</h2>
<h3>requestMain페이지 forward</h3>
<%
	request.getAttribute("request_person");
	request.getAttribute("request_str");
	
	/*		request.setAttribute("request_str", "request영역에 문자열 저장");
	request.setAttribute("request_person", new Person("momo",30));
	*/
	String request_str = "값 없음";
	Person request_person = new Person();
	
	if(request.getAttribute("request_str") != null) {
		request_str = (String)request.getAttribute("request_str");
	}
	if(request.getAttribute("request_person") != null){
		request_person = (Person)request.getAttribute
				("request_person");
	}
	
	String title = 
	request.getParameter("isRedirect")!= null ? "redirect" : "forward";
%>
isRedirect : <%=request.getAttribute("isRedirect") %>
<br><%= title %> 방식으로 호출
<br><%= request_str %>
<br><%= request_person %>


</body>
</html>