<%@page import="com.login.dto.BoardDto"%>
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
	//화면이 모두 불러들여져 오면 실행한다.
	window.onload = function(){
		//화면에 있는 요소를 선택해서 변수에 저장
		let listBtn = document.querySelector("#listBtn");
			if(listBtn != null){
				listBtn.onclick = function(){
					//alert('리스트 버튼이 클릭됨');
					//리스트 페이지로 이동
					location.href = '/list';
				}
			}
		
		//삭제 버튼을 클릭하면 '정말 삭제 할겁니까?' 확인 후 삭제 컨트롤러 호출
		//삭제 성공하면 리스트페이지 호출 삭제 실패하면 '삭제중 예외 발생' 메세지 출력 후 상세페이지 이동(뒤로가기 history)
		let deleteBtn = document.querySelector("#deleteBtn");
			if(deleteBtn != null){
				//삭제 버튼에 이벤트 추가
				deleteBtn.addEventListener('click', function(){
					deleteFnc();
				});
			}
			
		//게시글을 삭제합니다.
		function deleteFnc(){
			//컨펌창: 확인, 취소 버튼이 출력
			//확인 = true 를 반환, 취소 = false를 반환
			if(confirm('정말 삭제하시겠습니까?')){
				alert('확인 클릭');
				//터든을 클릭하면 삭제 컨트롤러를 요청
				viewForm.action='/delete';
				viewForm.submit();
			} else {
				alert('취소 클릭');
			}	
		}	
			
		let editBtn = document.querySelector("#editBtn");
		
		
	}
	

</script>

<h2>상세보기</h2>
요청 게시글 번호: <%=request.getParameter("num") %>

<br>boardDto : <%=request.getAttribute("boardDto") %>

<form method="post" name="viewForm">
	<input type="text" name="num" value="<%=request.getParameter("num") %>"> <!-- 타입은 나중에 hidden으로 숨김처리함 -->	
</form>

<br><button id="listBtn">리스트</button>

<!-- 글의 작성자만 수정, 삭제가 가능하며 게시글의 id가 로그인한 id와 동일하다면 수정, 삭제 버튼 보여주기 -->
<%
	if(request.getAttribute("boardDto") != null){
		BoardDto dto = (BoardDto)request.getAttribute("boardDto");
		String id = "";
		
		if(session.getAttribute("id") != null){
			id = session.getAttribute("id").toString();
			
			if(id.equals(dto.getId())){
				out.print("<button id='deleteBtn'>삭제</button> &nbsp");//&nbsp - html공백
				out.print("<button id='editBtn'>수정</button>");
			}
			
		}
%>
	

<ul>
	<li>제목: <%=dto.getTitle() %></li>
	<li>내용: <%=dto.getContent() %></li>
	<li>작성자: <%=dto.getId() %></li>
	<li>작성일: <%=dto.getPostdate() %></li>
	<li>조회수: <%=dto.getVisitcount() %></li>
</ul>

<% } %>

</body>
</html>