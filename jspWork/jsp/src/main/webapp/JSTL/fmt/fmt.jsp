<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>숫자 포맷 설정</h2>
<!-- 
    formatNumber
    	var 	: 변수명 (변수명을 지정하지 않으면 바로 출력)
    	value 	: 출력할 숫자
    	pattern : 숫자패턴
    	scope 	: 영역
    	
    	type 	: 출력양식을 설정
    		- percent 	: 퍼센트
    		- currency 	: 통화 - 원화 기호(₩)를 붙여줍니다.
    		- number 	: 기본값, 일반숫자
    
    	groupingUsed : 구분기호 사용여부
     -->
     
<!-- 화면에 출력할때 숫자에 콤마 설정 -->
<c:set var="num" value="12345"/>
<!-- 화면에 출력할때
 	문자의 정렬 
 	숫자의 정렬:오른쪽정렬, 세자리 컴마
	금액을 표현 하거나 수량을 표현하는 경우가 많음 -->
콤마 출력: <fmt:formatNumber value="${num }"></fmt:formatNumber>

<br>콤마 출력 안함: <fmt:formatNumber value="${num }" groupingUsed="false"></fmt:formatNumber>

<!-- 변수에 저장 -->
<fmt:formatNumber value="${num }" var="saveVar" type="currency"></fmt:formatNumber>
<br>변수에 저장된 값을 출력 ${saveVar }

<br>타입지정: <fmt:formatNumber value="0.3" type="percent"></fmt:formatNumber>

<h2>패턴을 지정해서 숫자를 활용</h2>
0, # : 자릿수를 의미
0 : 자릿수를 지정했는데 해당 자리에 수가 없으면 0을 출력
# : 자릿수를 지정했는데 해당 자리에 수가 없으면 출력 하지 않음
<!-- 
ex) 300
00000 - 00300 - 자릿수를 맞추고 싶을 때(코드값)
##### - 300 으로 표기된다. 

출력 형식을 지정하는 것은 매우 중요할 일이지만 보통 쿼리를 실행하면서 포맷을 지정하여 dto에 담기 때문에 
jstl 태그를 이용한 출력 형식 지정은 매우 드물게 사용된다.-->
<!-- 사용할 일이 거의 없다고 보면된다 알고만 가자 -->
<c:set var="num1" value="12345.0111"/>
<fmt:formatNumber value="${num1 }"/><br>
<fmt:formatNumber value="${num1 }" pattern="0,00.0"/><br>
<fmt:formatNumber value="${num1 }" pattern="0,000,00.0"/><br>
<fmt:formatNumber value="${num1 }" pattern="#,###.##"/><br>
<fmt:formatNumber value="${num1 }" pattern="###,###.0000000"/><br>
<fmt:parseNumber value="${num1 }" integerOnly="true" var="saveVar"/><br>
정수 부분만 : ${saveVar }


<!-- 아래는 자주 사용안되지만 보기만 하자 -->
<!-- 자주 사용안되지만 보기만 하자 -->

<h2>날짜 포맷</h2>
<c:set var="today" value="<%=new Date() %>"/>
오늘날짜 : ${today }<br>

<fmt:formatDate value="${today }" type="date" dateStyle="full"/><br>
<fmt:formatDate value="${today }" type="date" dateStyle="short"/><br>
<fmt:formatDate value="${today }" type="date" dateStyle="long"/><br>
<fmt:formatDate value="${today }" type="date" dateStyle="default"/><br>
<fmt:formatDate value="${today }" type="date" dateStyle="medium"/><br>

<h2>시간 포맷</h2>
<fmt:formatDate value="${today }" type="time" timeStyle="full"/><br>
<fmt:formatDate value="${today }" type="time" timeStyle="short"/><br>
<fmt:formatDate value="${today }" type="time" timeStyle="long"/><br>
<fmt:formatDate value="${today }" type="time" timeStyle="default"/><br>
<fmt:formatDate value="${today }" type="time" timeStyle="medium"/><br>

<h2>날짜/시간 표시</h2>
<fmt:formatDate value="${ today }" type="both" dateStyle="full" timeStyle="full"/> 
   <br />

<h2>pattern 지정후 출력</h2>
<fmt:formatDate value="${ today }" type="both" 
				pattern="yyyy-MM-dd hh:mm:ss"/> 
   
<h2>타임존 설정</h2>
<!-- 세계협정시(GMT, 대한민국보다 9시간 빠름) -->
<fmt:timeZone value="GMT"> 
     <fmt:formatDate value="${ today }" type="both" dateStyle="full" 
     			timeStyle="full"/>
     <br />    
 </fmt:timeZone>
 <fmt:timeZone value="America/Chicago">
     <fmt:formatDate value="${ today }" type="both" dateStyle="full" 
     			timeStyle="full"/>
 </fmt:timeZone>
 
 <h2>로케일 설정</h2>    
 <c:set var="today" value="<%=  new java.util.Date() %>"/>
 
 한글로 설정 : <fmt:setLocale value="ko_kr" />
 <fmt:formatNumber value="10000" type="currency" /> /
 <fmt:formatDate value="${ today }" /><br />

 일어로 설정 : <fmt:setLocale value="ja_JP" />
 <fmt:formatNumber value="10000" type="currency" /> /
 <fmt:formatDate value="${ today }" /><br />
 
 영어로 설정 : <fmt:setLocale value="en_US" />
 <fmt:formatNumber value="10000" type="currency" /> /
 <fmt:formatDate value="${ today }" /><br /> 
 
</body>
</html>