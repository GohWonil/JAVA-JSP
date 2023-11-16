package com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.BoardDao;
import com.login.dto.Criteria;
import com.login.dto.PageDto;

/**
 * 게시글의 목록 조회 후 반환
 */
@WebServlet("/list")
public class BoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao= new BoardDao();
		
		//페이지 번호와 페이지당 게시물수를 설정후 게시물의 시작 번호화 끝번호를 알아낸다.
		Criteria cri = new Criteria(request.getParameter("pageNo"), request.getParameter("amount"));
		
		int total = dao.getTotalCnt();
		//페이지블럭을 생성하기위해 PageDto를 생성합니다.
		PageDto pageDto = new PageDto(total, cri);
		
		//request.setAttribute("list", dao.getList(cri.getStartNo(), cri.getEndNo()));
		request.setAttribute("pageDto", pageDto);
		
		request.getRequestDispatcher("/board.jsp").forward(request, response);
	}


}
