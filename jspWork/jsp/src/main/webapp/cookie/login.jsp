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
	//user_id 쿠키에서 찾아서 요청객체로 부터 쿠키정보를 꺼내서 user_id값을 변수에 저장
	String user_id = "";
	String checked = "";

	user_id = CookieManager.readCookie(request, "user_id");
	checked = !"".equals(user_id)?"checked" : "";
	/*
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie cookie : cookies){
			if("user_id".equals(cookie.getName())){
				user_id = cookie.getValue();
				checked = "checked";
				break;
			}
		}
	}
	*/
%>

<form action="loginAction.jsp" method = "post">
	<div class='loginbox'>
        <div id='login'>
            <input type="text" name="id" id="user_id" placeholder='ID를 입력해주세요.' 
            				required="required" value="momo"><br>
            				
            <input type="password" name="pw" id="user_pw" value="1234" placeholder='PW를 입력해주세요.' required="required"><br>
            <input type="checkbox" <%= checked%> name="save_check" value="Y">아이디 저장하기<br>
        </div>
        <div id='button'>
        <input type="submit" value="로그인">
        </div>
    </div>
    <div id='info'>
        <a href="">회원가입</a>
        <a href="">ID찾기</a>
        <a href="">PW찾기</a>
    </div> 
</form>

</body>
</html>