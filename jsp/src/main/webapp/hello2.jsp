<!-- 
지시어 JSP 페이지를 자바(서블릿) 코드로 변환하는 데 필요한 정보를 JSP 엔진에 알려주며,
주로 스크립트 언어나 인코딩 방식 등을 설정
*페이지 지시어가 없는 경우, 오류가 발생 ! ! 
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//자바코드를 입력하기 위해 스크립트를 열어줍니다.
	//외부 클래스를 사용하기 위해 page지시어 import속성을 이용
	Date today = new Date();

	//웹 브라우저에 출력하기 위한 내장객체
	//내장객체: 생성하지 않았지만 자동으로 클래스로 변환되면서 자동으로 생성 해주는 객체
	//out: 웹 브라우저에 출력 하기 위한 내장객체
	out.print("오늘날짜 : " + today);
%>
<hr>
오늘날짜는 뭘까: <%=today %>

<!-- 
	jsp 파일 호출 방법
	localhost: 포트/path/파일이름
	
	* 웰컴페이지 확인 꼭 하기 !!
	
	
	servlet 호출 방법
	localhost: 포트/path/매핑주소
	
 -->
<h1>hello JSP!!!!</h1>

</body>
</html>