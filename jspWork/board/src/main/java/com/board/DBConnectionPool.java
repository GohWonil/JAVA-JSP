package com.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * 톰켓으로 부터 제공받는 기능이므로 서버를 실행후 테스트 할 수 있다.
 * -> main 메소드를 이용한 실행이 불가능하다.
 */
public class DBConnectionPool {
	
	//DB에 접근하기 위해 필요한 데이터
	//-> 리소스에 정의 (context.xml에 정의)
	//DB에 접근하여 쿼리를 질의 하기위해 필요한 객체 선언
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	public DBConnectionPool() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			con = ds.getConnection();
			
		} catch (NamingException e) {
			System.out.println("======NamingException");
			e.printStackTrace();
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	
	}
	
	
	public void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			System.out.println("자원반납 성공");

			
		} catch (Exception e) {
			System.out.println("자원 반납 실패");
			e.printStackTrace();
		}
	}
	
	
	//DB로 부터 게시글 1건에 대한 상세 정보를 조회 후 반환
	public BoardDto getOne(String num) {
		BoardDto dto = new BoardDto();
		String sql = "select * from board where num=?";
		//?를 이용한 인파라메터를 사용할 수 있다.
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setContent(rs.getString("Content"));
				dto.setId(rs.getString("id"));
				dto.setNum(rs.getString("num"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setTitle(rs.getString("title"));
				dto.setVisitcount(rs.getString("visitcount"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
}