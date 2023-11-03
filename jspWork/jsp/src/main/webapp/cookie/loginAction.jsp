<%@page import="com.momo.utils.CookieManager"%>
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
	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("pw");

	//save_check값이 null이 아니라면 체크박스는 값이 선택된 경우에만 넘어온다.
	//체크박스 값 수집
	String save_check = request.getParameter("save_check");
	out.print("save_check : " + save_check);
	//save_check값이 null이 아니라면
	if (save_check != null) {
		//쿠키에 아이디 저장
		CookieManager.makeCookie(response, "user_id", user_id, 3600);
		Cookie cookie = new Cookie("user_id", user_id);
		cookie.setMaxAge(3600);

		response.addCookie(cookie);
		out.print("아이디를 쿠키에 저장~");
	}

	if(true){
	//if ("momo".equals(id) && "1234".equals(pw)) {
		out.print("<h1>로그인 성공<h1>");
	} else {
		String script = "<script type='text/javascript'>" + "alert('id/pw 확인 ㄱ');" + "history.go(-1);" + "</script>";
		out.print(script);
	%>
	<!-- <script type='text/javascript'>
 	alert('id/pw 확인 ㄱ');
 	history.go(-1);
 </script>
 -->
	<%
	}
	%>
</body>
</html>