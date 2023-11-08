package com.momo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import com.momo.common.DBConnection;
import com.momo.dto.Job;

/**
 * Dao란?
 * 데이터 액서스 객체(Data Access Object)
 * 데이터베이스와의 상호작용을 관리하고 데이터베이스에서 데이터를 읽고 쓰는 데 사용
 * 
 * 
 */

public class JobDao extends DBConnection{

	public JobDao(ServletContext application) {
		super(application);
	}
	
	/**
	 * job 테이블의 내용을 조회 후 리스트에 담아서 반환
	 * @return
	 */
	public List<Job> getList(){
		List<Job> list = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from job");
			while(rs.next()) {
				Job job = new Job();
//				rs.getString(1);
//				rs.getString(2); job.setJob에 담는다
				job.setJobCode(rs.getString(1));
				job.setJobName(rs.getString(2));
				
				list.add(job);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
