package ch20.jdbc.exam01;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {

	public static void main(String[] args) {

		//드라이버가 등록되었는지 확인
		//Class.forName(드라이버명): 특정 jdbc 드라이버가 등록되었는가?
		String driverName = "org.mariadb.jdbc.Driver";
		//String driverNmae = "com.mysql.cj.jdbc.Driver";
		//찾는 종류의 드라이버가 있으며 드라이버저장 없으면 예외발생
		try {
			//드라이버 찾기
			Class.forName(driverName);
			//db와 연결하여 작업하는 Connection 객체 필요
			//getConnection(jdbcUr1, userid, password)
			//db서버와 연결해서 db에 sql명령을 주고 받는 객체 리턴
			Connection conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/thisisjava",
					"root",
					"mariadb"
					);
			System.out.println("Mariadb, 연결성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
