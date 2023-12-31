package com.login.common;

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
	
	public Connection con;
	public Statement stmt;
	public ResultSet rs;
	public PreparedStatement pstmt;
		
	public DBConnPool() {
		
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			con = ds.getConnection();
			
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select sysdate from dual");
//			
//			if(rs.next()) {
//				System.out.println(rs.getString(1));
//			}
			
		} catch (NamingException e) {
			System.out.println("==NamingException==");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("==SQLException==");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 자원 반납 
	 */
	public void close() {

		try {
			if(rs != null)		rs.close();
			if(pstmt != null)	pstmt.close();
			if(stmt != null)	stmt.close();
			if(con != null)		con.close();
			System.out.println("자원반납 성공");
			
		} catch (SQLException e) {
			System.out.println("DB 자원 반납 중 오류 발생");
			e.printStackTrace();
		}
	}
	
}
