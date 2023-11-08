package com.momo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import com.momo.common.DBConnection;
import com.momo.dto.DepDto;

public class depDao extends DBConnection {

	public depDao(ServletContext application) {
		super(application);
	}
public List<DepDto> getList(){
	List<DepDto> list = new ArrayList<>();
	String sql = "SELECT * from department";
	try {
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			DepDto dto = new DepDto();
			dto.setDept_Id(rs.getString("dept_Id"));
			dto.setDept_title(rs.getString("dept_title"));
			dto.setLocation_id(rs.getString("location_id"));
			
			list.add(dto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	
		return list;
	}
}
