package com.momo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionMain {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "ORCLSTUDY";
		String pw = "orcl";
		
		/*
		 * 1. 드라이버 로딩
		 * 	DB에 접근하기 위해 필요한 라이브러리가 있는지 확인
		 * 2. 커넥션 객체를 생성
		 * 	
		 * */
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 커넥션 생성
			Connection con = DriverManager.getConnection(url, id, pw);
			
			//3. 쿼리문장 준비
			String sql = "SELECT sysdate from dual";
			
			//4. 쿼리 문장 실행
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			//숫자를 입력할 경우 1부터
			//숫자 또는 결과 집합의 컬럼명을 getString(에 넣는다.)
			System.out.println(rs.getString("sysdate"));
			//stmt.executeQuery(sql);
			//System.out.println("con");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 - 라이브러리 어디있음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 실패임");
			e.printStackTrace();
		}
	}

}
