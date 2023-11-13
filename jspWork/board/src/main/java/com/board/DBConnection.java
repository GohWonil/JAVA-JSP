package com.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ojdbc를 이용하여 DB를 접근하고 커넷견을 얻어온다.
 */
public class DBConnection {

	public static void main(String[] args) {
		//DB 접속 정보
		//jdbc:oracle:thin:@아이피:포트:SID
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "ORCLSTUDY";
		String pw = "orcl";
		
		try {
			//드라이버 로딩 : ojdbc6
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//connection 생성
			//DB 접근 후 인증과정 거쳐 커넥션을 얻어옴
			Connection con = DriverManager.getConnection(url,id,pw);
						
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select sysdate from dual");
			rs.next();
			System.out.println(rs.getString(1));
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 확인");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 생성 실패 url,id,pw 정보 확인");
			e.printStackTrace();
		}
	}
	
}
