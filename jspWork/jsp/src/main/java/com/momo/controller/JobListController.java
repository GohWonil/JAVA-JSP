package com.momo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.momo.dao.JobDao;
import com.momo.dto.Job;

/**
 * 사용자가 /JobList경로를 요청하면
 * 요청 URL에 매핑에 의해 실행
 * 
 * 요청 전달된 메서드에 의해 실행될 메서드가 결정된다.
 * - 사용자가 지정하지 않은 경우 get 방식 (doget 메서드가 실행)
 * - 링크를 클릭했을때, 주소창에서 직접 입력 했을때 (dopost 메서드가 실행)
 * 
 * 해당 요청방식이 구현되어 있지 않은 경우, 오류가 발생한다.
 * 
 * 그리고 서블릿이 아닌 자바 파일을 키면 404 에러가 뜰 수 있다.
 */
@WebServlet("/JobList")
public class JobListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * 1. DB로 부터 직급목록을 조회
	 * 2. 화면에 직급목록 출력
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		JobDao jobDao = new JobDao(request.getServletContext());
		List<Job> list = jobDao.getList();
		System.out.println("=========");
		System.out.println(list);
		//화면에 출력하기 위해 request에 저장
		request.setAttribute("list", list);
		//화면전환
		request
		.getRequestDispatcher("JobList.jsp")
		.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
