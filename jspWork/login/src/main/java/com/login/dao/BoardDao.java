package com.login.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.login.common.DBConnPool;
import com.login.dto.BoardDto;

/**
 * DB로 부터 게시글을 조회, 입력, 수정, 삭제 처리를 합니다.
 *
 */
public class BoardDao extends DBConnPool {
	public List<BoardDto> getList(){
		List<BoardDto> list = new ArrayList<>();
		String sql = "select num,content,id,to_char(postdate, 'yyyy-mm-dd') postdate,title,visitcount from board";
		//db로 부터 게시글의 목록을 조회하여 list 에 담아 반환
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String num = rs.getString("num");
				//String content = rs.getString("content");
				String title = rs.getString("title");
				String id = rs.getString("id");
				String postdate = rs.getString("postdate");
				//String visitcount = rs.getString("visitcount");
				
				BoardDto dto = new BoardDto(num, title, "" , id, postdate, "");
//				BoardDto dto = new BoardDto();
//				dto.setContent(rs.getString("content"));
//				dto.setId(rs.getString("id"));
//				dto.setNum(rs.getString("num"));
//				dto.setPostdate(rs.getString("postdate"));
//				dto.setTitle(rs.getString("title"));
//				dto.setVisitcount(rs.getString("visitcount"));
				
				list.add(dto);
			}
			return list;
			
		} catch (SQLException e) {
			System.out.println("==SQLException");
			e.printStackTrace();
		}
		
		return null;
	}
	
	public BoardDto getOne(String num) {
		BoardDto dto= new BoardDto();
		try {
			pstmt = con.prepareStatement("select * from board where num = ?");
			pstmt.setString(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setNum(rs.getString("num"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} return dto;
	}
	
	
	
	
	
	
	public int visitCountUp(String num) {
		int res = 0;
		String sql = "update board set visitcount = visitcount + 1 where num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			//첫번째 있는 문장 1번에 num을 실행하다
			pstmt.setString(1, num);
			
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	
	
	
	
}
