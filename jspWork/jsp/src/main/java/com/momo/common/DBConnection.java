package com.momo.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;

public class DBConnection {
	//Connection이 null인 경우 데이터베이스 조회가 안되기 때문
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	/**
	 * 생성자: 객체생성*/
	public DBConnection(){
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//DB에 연결하기 위해 필요한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "ORCLSTUDY";
			String pw = "orcl";
			
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("연결 성공");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("객체 생성 실패");
			e.printStackTrace();
		}
	}
	
	public DBConnection(String driver, String url, String id, String pw) {
		try {
			//1. 드라이버 로딩
			Class.forName(driver);
			
			//2.DB Connection 객체 생성
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 라이브러리 확인");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("connection 생성 실패");
			e.printStackTrace();
		}
		
	}
	
	public DBConnection(ServletContext application) {
		String driver = application.getInitParameter("driver");
		String url = application.getInitParameter("url");
		String id = application.getInitParameter("id");
		String pw = application.getInitParameter("pw");
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("application 내장객체를 활용한 Connection 생성");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 - 라이브러리 확인");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("객체 생성 실패");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 연결해제(자원반납)*/
	public void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();	
			System.out.println("자원반납 성공");

		} catch (Exception e) {
			System.out.println("자원반납 예외 발생");
			e.printStackTrace();
		}
		
	}
}
