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
	//변수 선언 및 값 할당
	int num1 = 3;

	//페이지 영역에 값을 저장
	pageContext.setAttribute("num2", 4);
	pageContext.setAttribute("num3", "5");
	pageContext.setAttribute("num4", "8");
%>

<h3>변수 선언 및 할당</h3>
<!-- num1은 영역(page, request, session, application)에 저장되지 않음 출력해도 값이 안나온다. -->
<p>스크립틀릿에서 선언한 변수 : ${num1 } </p>
<p>페이지 영역에 저장한 변수 : ${num2 }, ${num3 }, ${num4 }</p>

<!--  3.0버전 부터 대입연산자(=)을 이용하여 값을 대입할 수 있다. -->
<p>변수 할당 및 즉시 출력 : ${num1 = 7 }</p>
<p>변수 할당 : ${num2 = 8;"" }</p>
<p>할당 값 출력 : ${num2}</p>

<hr>

num1 = ${num1}, num2 = ${num2}, num3 = ${num3}, num4 = ${num4}

<hr>

<br>num1 + num2 = ${num1 + num2}
<br>num1 - num2 = ${num1 - num2}
<br>num1 * num2 = ${num1 * num2}
<br>num1 / num2 = ${num1 / num2}

<hr>

<!-- 표현언어를 이용하면 산술연산시 자동으로 숫자로 변환(문자형태의 숫자를 숫자로 변환 하여 연산) -->
<br>num3 / num4 = ${num3 / num4 }
<br>num3 % num4 = ${num3 % num4 }

<hr>

<!-- 문자 형태의 연산자
	/ = div
	% = mod
	 -->
<br>num3 div num4 = ${num3 div num4 }
<br>num3 mod num4 = ${num3 mod num4 }

<hr>

<!--  +연산자 : 문자열의 연결은 불가능 하지만 숫자와는 가능하다 -->
<br>${num1 + "34" }
<br>\${num1 + "str" }

<hr>

<h3>비교 연산자</h3>
<!-- 문자 형태의 연산자: 문자형태의 연산자를 사용하여 코드를 좀 더 직관적으로 작성이 가능하다 -->
<br>num1 == num4 : ${num1 eq num4 }
<br>num1 > num4 : ${num1 gt num4 }
<br>num1 < num4 : ${num1 lt num4 }
<br>num1 >= num4 : ${num1 ge num4 }

<hr>

<h3>논리 연산자</h3>
<br>num3 <= num4 && num3 == num4 : ${ num le num4 and num3 eq num4 }
<br>num3 >= num4 || num3 != num4 : ${ num ge num4 or num3 ne num4 }
<br>${num3 <= num4 && num3 == num4}
<br>${num3 >= num4 || num3 != num4}


</body>
</html>