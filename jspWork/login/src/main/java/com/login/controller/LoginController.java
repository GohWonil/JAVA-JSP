package com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.login.dao.MemberDao;
import com.login.dto.MemberDto;


@WebServlet("/loginAction")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 로그인 처리
	 * - 요청 데이터 확인
	 * 		id, pw가 일치하는 사용자가 있는지 확인 후 
	 * 		사용자가 있으면 로그인 성공
	 * 			- 사용자 정보를 세션에 저장 후 board.jsp 페이지로 이동
	 * 		사용자가 없으면 로그인 실패 
	 * 			- id, pw를 확인해주세요 메세지를 띄우고 이전페이지로 이동
	 * - 요청 메서드에 따라 doGet, doPost 메서드가 실행 됩니다.
	 * 
	 * 요청방식(method) - 요청방식을 지정하지 않으면 get 방식으로 호출
	 * 				- 요청방식에 해당 하는 메서드가 구현 되어 있지 않은 경우 405 에러가 뜰 수 있다. 
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청 데이터 수집 (id , pw)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//2. 사용자 정보 조회 (MemberDao.login(id, pw)
		//		MemberDto, MemberDao 생성
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.login(id, pw);
		
		//자원반납
		dao.close();
				
		//3. 화면전환
		if(dto != null) {
			//로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("id", dto.getId());
			session.setAttribute("dto", dto);
			//세션영역에 로그인 정보를 저장 forward, redirect 어느것으로 해도 상관없음
			//리스트 서블릿 요청
			response.sendRedirect("list");
			//서블릿을 요청시 주의사항
			//forward 방식으로 페이지를 전환시 405 오류가 발생
			//loginAction은 post
			//list는 get
			//요청 받을 당시 방식 method 가 유지 되므로 405 오류가 발생할 소지가 있다.
			
			//request.getRequestDispatcher("/board.jsp").forward(request, response);
		} else {
			//로그인 실패
			response.setContentType("text/html; charset=UTF-8");
			
			request.setAttribute("msg", "아이디 비밀번호 확인");
			//response.sendRedirect("/msgBox.jsp");
			request.getRequestDispatcher("/msgBox.jsp").forward(request, response);
//			response.getWriter().append("<script>");
//			response.getWriter().append("	alert('아이디 비밀번호 확인');");
//			response.getWriter().append("	history.back();");
//			response.getWriter().append("</script>");
			
			//request.getRequestDispatcher("/login.jsp?isError=1").forward(request, response);
		}
	}

}
