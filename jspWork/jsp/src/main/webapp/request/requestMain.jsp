<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 - request</title>
</head>
<body>

<h2>1. 클라이언트와 서버의 환경정보 읽기</h2>
<!--  method를 지정하지 않은 경우 get방식으로 호출 -->
<p>
	<a href = "RequestWebInfo.jsp"> get 방식 요청 </a>
</p>

<h2>2. 클라이언트의 요청 매개변수 읽기</h2>
	<form action = "RequestParameter.jsp" method = "post">
	<!-- 서버에 넘어가려면 name 필수 !! -->
		아이디:<input type="text" name="id" value="momo"> 
		
		<br>
		성별:<input type="radio" name="sex" value="man">
			<input type="radio" name="sex" value="women" checked="checked">
		
		<br>
		관심사항:<input type="checkbox" name="favo" value="eco">경제
			 <input type="checkbox" name="favo" value="pol">정치
			 <input type="checkbox" name="favo" value="ent" checked="checked">연애
		
		<br>
		자기소개: <textarea rows="4" cols="30" name="intro">만나서 반갑습니다</textarea>
		
		<br>
		<!--  홈에 버튼이 하나 있으면 submit 역할을 한다. -->
		<button>전송</button>
	
	</form>

	<h2>3. HTTP 요청 헤더 정보 읽기</h2>
	<a href = "requestHeader.jsp">요청 헤더 정보 읽기</a>

</body>
</html>