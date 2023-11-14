package com.login.dao;

import java.sql.SQLException;

import com.login.common.DBConnPool;
import com.login.dto.MemberDto;

/**
 * id pw를 전달 받아 DB에 등록된 사용자가 있는지 조회후 MemberDto를 반환
 */
public class MemberDao extends DBConnPool{

	public MemberDto login(String id, String pw) {
		MemberDto dto = null;
		
		String sql = "select * from member where id = ? and pass = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
					
			if(rs.next()) {
				dto= new MemberDto();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setRegidate(rs.getString("regidate"));
//				String name = rs.getString("name");
//				String id = rs.getString("id");
//				String regidate = rs.getString("regidate");
				
//				memberDto = new MemberDao(id, name, regidate);
//				memberDto.setId(rs.getString("1"));
//				memberDto.setName(rs.getString("2"));
//				memberDto.setRegidate(rs.getString("4"));
//				return memberDto;

			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return dto;
	}
}
