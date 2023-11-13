package com.momo.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnPool {

	//데이터베이스 연결을 나타내는 객체입니다. 이 객체를 사용하여 데이터베이스에 연결하고 SQL 쿼리를 실행합니다.
	public Connection con;
	
	//매번 실행될 때마다 SQL 쿼리가 데이터베이스 서버로 전송되고 실행됩니다. 
	//각 실행마다 쿼리를 파싱하고 컴파일하기 때문에 동일한 쿼리를 여러 번 실행하는 경우에는 효율적이지 않을 수 있습니다.
	
	//SQL 문을 실행하는 데 사용되는 객체입니다. 
	//Statement 객체를 사용하여 데이터베이스로부터 데이터를 가져오거나 데이터베이스에 데이터를 저장할 수 있습니다. 
	//주의해야 할 점은 Statement를 사용하면 SQL 쿼리가 직접 실행되므로 SQL 인젝션 공격에 취약할 수 있습니다.
	public Statement stmt;
	
	// SQL 쿼리를 미리 컴파일하여 캐시에 저장한 후 재사용합니다. 따라서 동일한 쿼리를 여러 번 실행할 때 성능상의 이점이 있습니다
	//또한, 파라미터화된 쿼리에 대한 보안 면에서도 더 좋은 방법을 제공
	
	//미리 컴파일된 SQL 문을 실행하는 데 사용되는 객체입니다. 
	//PreparedStatement를 사용하면 SQL 쿼리의 매개변수를 쉽게 처리하고 SQL 인젝션을 방지할 수 있습니다.
	public PreparedStatement pstmt;
	
	//데이터베이스로부터 검색한 데이터를 저장하는 데 사용되는 객체입니다. 
	//ResultSet를 사용하여 데이터베이스에서 검색한 결과를 반복 및 검색할 수 있습니다
	public ResultSet rs;
	
	public DBConnPool() {
		try {
			//JNDI를 통해 커넥션풀 얻어오기
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			
			//커넥션풀을 통해 연결 객체를 멤버변수 con에 담아줍니다.
			con = ds.getConnection();
			
			System.out.println("JNDI를 통해 커넥션풀에서 커넥션을 가져오기");
		} catch (NamingException e) {
			System.out.println("======NamingException");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("======SQLException");
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
