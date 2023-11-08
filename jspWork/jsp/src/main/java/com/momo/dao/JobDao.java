package com.momo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import com.momo.common.DBConnection;
import com.momo.dto.Job;

/**
<<<<<<< HEAD
 * Dao란?
 * 데이터 액서스 객체(Data Access Object)
 * 데이터베이스와의 상호작용을 관리하고 데이터베이스에서 데이터를 읽고 쓰는 데 사용
 * 
 * 
 */

public class JobDao extends DBConnection{

=======
 * Dao
 * 데이터 액세스 객체(Data Access Object)
 * 
 * 데이터베이스와의 상호작용을 관리하고 데이터베이스에서 데이터를 읽고 쓰는 데 사용
 * 
 * Dto
 * 데이터 전송 객체(Data Transfer Object)
 * 
 * 데이터를 전송하거나 전달하기 위해 사용되는 객체
 */
public class JobDao extends DBConnection{
	
>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
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
<<<<<<< HEAD
//				rs.getString(1);
//				rs.getString(2); job.setJob에 담는다
				job.setJobCode(rs.getString(1));
				job.setJobName(rs.getString(2));
=======
				job.setJobCode( rs.getString(1) );
				job.setJobName( rs.getString(2) );
>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
				
				list.add(job);
			}
			
		} catch (SQLException e) {
<<<<<<< HEAD
			e.printStackTrace();
		}
		
		return list;
	}
}
=======
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
}









>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
