package com.momo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.momo.dao.BoardDao;
import com.momo.dto.BoardDto;
import com.momo.dto.Criteria;
import com.momo.dto.PageDto;

@WebServlet("/boardList")
public class BoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//리스트를 조회 하기 위한 파라메터 수집
		Criteria cri = new Criteria(request.getParameter("pageNo")
									, request.getParameter("amount")
									, request.getParameter("searchFiled")
									, request.getParameter("searchWord")
				);
		
		//리스트 조회후 리쿼스트 영역에 저장
		BoardDao dao = new BoardDao();
		List<BoardDto> list = dao.getList(cri);
		request.setAttribute("list", list);
		
		
//		request.setAttribute("cri", cri);
//		request.setAttribute("totalCnt", dao.getTotalCnt());
		//페이지 블럭을 생성하기 위해 필요한 정보를 저장
		//조회 조건을 넣지 않으면 조회되는 게시글의 건수와 페이지블럭이 다르게 표시
		int totalCnt = dao.getTotalCnt(cri);
		PageDto pageDto = new PageDto(totalCnt, cri);
		request.setAttribute("pageDto", pageDto);
		
		dao.close();
		//페이지 전환
		//forward방식으로 전환 하므로 request 영역이 공유됨
		request.getRequestDispatcher("/session/servletEx/board.jsp").forward(request, response);
	}
}
		/*	
	 	//리스트 조회후 리쿼스트 영역에 저장
		BoardDao dao = new BoardDao();

		//페이지 조회에 필요한 정보를 수집
		//pageNo: 요청  페이지 번호
		//amount: 페이지당 게시물 수
		int pageNo = 1;
		int amount = 10;

		//전달된 값이 있으면 변경 없으면 기본값
		if(request.getParameter("pageNo") != null &&
				!"".equals(request.getParameter("pageNo"))) {
			pageNo = Integer.parseInt(request.getParameter("pageNo"));
		}
		
		if(request.getParameter("amount") != null &&
				!"".equals(request.getParameter("amount"))) {
			amount = Integer.parseInt(request.getParameter("amount"));
		}
		
		System.out.println("pageNo = " + pageNo);
		System.out.println("amount = " + amount);
		
		//시작 번호와 끝번호 계산
		int endNum = pageNo * amount;
		int startNum = endNum - (amount-1);
		
		request.setAttribute("list", dao.getList(startNum, endNum));
		
		//페이지 전환 forward방식으로 전환 하므로 request영역이 공유
		request.getRequestDispatcher("/session/servletEx/board.jsp")
			.forward(request, response);
	}
*/

