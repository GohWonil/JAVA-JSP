<!-- 
지시어 JSP 페이지를 자바(서블릿) 코드로 변환하는 데 필요한 정보를 JSP 엔진에 알려주며,
주로 스크립트 언어나 인코딩 방식 등을 설정
*페이지 지시어가 없는 경우, 오류가 발생 ! ! 
 -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 사용자의 요구에 따라서 변수에 따라 동적인 페이지 설정 
5페이지에서 1페이지 가는 경우도 있어서 원하는 페이지로 가려면 이렇게 해야함 -->
<!-- java 코드 사용 하는 방법 -->

 <!-- %!는 선언부 -->
 <%!
 	String title = "hello JSP"; 
 %> 
 <!-- %= 하나의 값 출력 -->
 <h1><%= title %></h1>
 <hr>
 <h1>
 <!-- 내장객체를 이용한 출력 -->
 <% 
 	out.print(title + "학습");
 %>
 </h1>
 
</body>
</html>