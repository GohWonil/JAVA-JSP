<%@page import="com.momo.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<script type="text/javascript">
window.onload = function(){
	//버튼을 클릭 하면 리스트 페이지로 이동
	listBtn.onclick = function(){
		location.href = '/boardList';
	}
	
	//editBtn.addEventListener('click', function(){ 아래와 같은말임
	deleteBtn.addEventListener('click', ()=>{
		//jsp를 단독으로 실행할 경우, 경로문제가 발생하지 않는다 왜냐 같은 경로에 들어있기 때문이다
		//하지만 서블릿을 통해 들어오는 경우, 경로문제가 발생 할 수 있다.
		//그래서 루트경로부터 풀 경로를 적어주는 것이 오류가 발생하지 않도록 하는 방법이다.
		location.href =
			'/session/servletEx/deleteProcess.jsp?num=${param.num}';
	});
}
</script>

<h2>게시글 상세보기 El</h2>
<button id="listBtn">리스트 이동</button>
<button id="editBtn">수정</button>
<button id="deleteBtn">삭제</button>

<br>제목 : ${dto.Title} 
<br>내용 : ${dto.Content}
<br>작성자 : ${dto.Id}
<br>작성일 : ${dto.Postdate}
<br>조회수 : ${dto.Visitcount}


</body>
</html>