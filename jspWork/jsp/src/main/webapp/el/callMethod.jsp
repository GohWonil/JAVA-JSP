<%@page import="com.momo.el.MyElClass"%>
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
	MyElClass myClass = new MyElClass();
	request.setAttribute("myClass", myClass);
%>
<h3>객체를 영역에 저장후 메서드 호출하기</h3>
<p>el 표현언어에서 사용하기 위해서는 내장객체의 영역에 저장되어야한다</p>
<br>000000-100000 : ${myClass.getGender("000000-100000")}
<br>000000-200000 : ${myClass.getGender("000000-200000")}
<br>000000-300000 : ${myClass.getGender("000000-300000")}
<br>000000-400000 : ${myClass.getGender("000000-400000")}
<br>000000-500000 : ${myClass.getGender("000000-500000")}
<br>000000-600000 : ${myClass.getGender("000000-600000")}

<!-- getter메서드를 이용해서 값을 출력 하여 메서드가 없다면 오류가 발생  -->
<!-- <br>${myClass.gender } -->

<h3>정적메서드 호출 하기</h3>
<%
	request.setAttribute("response", response);
%>
response : ${response }
${CookieManager.makeCookie(response, "myCookie", "el사용", 100) }

<h3>메서드 호출하기</h3>
<!-- ${"123-123".replace("-", "") }  오류나는데 상관없음 작동됨 깔끔하게 하려고 주석함 일단-->

</body>
</html>