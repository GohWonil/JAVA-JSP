package com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.BoardDao;

/**
 * 게시글의 목록 조회 후 반환
 */
@WebServlet("/list")
public class BoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao= new BoardDao();
		request.setAttribute("list", dao.getList());
		
		request.getRequestDispatcher("/board.jsp").forward(request, response);
	}


}
