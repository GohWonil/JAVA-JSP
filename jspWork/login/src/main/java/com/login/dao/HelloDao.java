package com.login.dao;

import java.sql.SQLException;

import com.login.common.DBConnPool;

public class HelloDao extends DBConnPool{

	/**
	 * DB로 부터 현재 시간을 조회 후 반환
	 */
	
	public String getTime() {
		String time = "";
		String sql = "select sysdate from dual";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				time = rs.getString(1);
			}
		} catch (SQLException e) {
			System.out.println("==SQLException==");
			e.printStackTrace();
		}
		return time;
		
	}
}
