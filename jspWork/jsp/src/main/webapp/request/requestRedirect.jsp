<%@page import="com.momo.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendRedirect</title>
</head>
<body>


<% 
	String str = "";
	Person person = new Person();

	if(request.getAttribute("request_str") != null){
		str = request.getAttribute("request_str").toString();
	}
	
	if(request.getAttribute("request_person") != null){
		person = (Person)request.getAttribute("request_person");
	}
%>

<h2>getAttribute result</h2>
<p>리다이렉트시 request 영역은 공유 되지 않아 값이 출력 되지 않음</p>
str : <%= str%>
<br>person : <%= person%>

<h2>queryString 출력</h2>
<p>queryString으로 전달한 데이터는 getParameter메서드를 이용해서 수집</p>
isRedirect : <%= request.getParameter("isRedirect") %>

<h3>session을 이용한 값 출력</h3>
session_str : <%= session.getAttribute("session_str") %>

<%
	//세션에 저장된 속성을 제거합니다.
	session.removeAttribute("session_str");
%>
<h3>세션 제거</h3>
session_str : <%= session.getAttribute("session_str") %>


</body>
</html>