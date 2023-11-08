package com.momo.controller;

import java.io.IOException;
<<<<<<< HEAD
=======
import java.io.PrintWriter;
>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.momo.dao.DeptDao;
import com.momo.dto.DeptDto;

/**
<<<<<<< HEAD
 * URL매핑(/dpetList 페이지를 요청하면 실행)
 * -요청 매서드에 따라서 실행되는 메서드가 결정
 * 
 * 주소표시줄, 링크 -> get방식 ->goGet()메서드 호출
 * 
 * Controller
 * -사용자의 요청 정보 수집
 * -View 페이지 전환(Forward, redirect를 통해 전환)
 * -비지니스로직 호출
=======
 * Servlet implementation class DeptListController
>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
 */
@WebServlet("/deptList")
public class DeptListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//DB에 접근해서 리스트를 조회
=======
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// DB에 접근해서 리스트를 조회
>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
		DeptDao dao = new DeptDao(request.getServletContext());
		List<DeptDto> list = dao.getList();
		
		request.setAttribute("list", list);
<<<<<<< HEAD
		//Controller에서 화면을 구성하는 태그를 작성하는 것은 매우 번거롭기 때문에 
		//JSP를 이용해서 화면을 작성 후 페이지 전환을 한다.
		request.getRequestDispatcher("deptList.jsp").forward(request, response);
		

=======
		request.getRequestDispatcher("deptList.jsp").forward(request, response);
		
>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
