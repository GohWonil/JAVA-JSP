package com.momo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.momo.dto.Job;

public class DBConnectionJob {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "ORCLSTUDY";
		String pw = "orcl";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 커넥션 생성
			con = DriverManager.getConnection(url, id, pw);
			
			//3. 쿼리문장 준비
			String sql = "SELECT * from job";
			
			//4. 쿼리 문장 실행
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			//5. 결과출력
//			rs.next();
//			rs.getString(0); 문자로 출력
//			rs.getInt(0); 숫자로 출력
			
			//반복문으로 필요 모든 자료 출력
			while(rs.next()) {
				Job job = new Job();
				job.setJobCode(rs.getString(1));
				job.setJobName(rs.getString(2));
				System.out.print(rs.getString (1));
				System.out.println(rs.getString (2));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 - 라이브러리 어디있음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 실패임");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();				
			} catch(Exception e) {
				System.out.println("자원 해제중 예외사항 발생!");
				e.printStackTrace();
			}
		}
	}

}
