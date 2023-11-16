package com.login.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.login.common.DBConnPool;
import com.login.dto.BoardDto;
import com.login.dto.Criteria;

/**
 * DB로 부터 게시글을 조회, 입력, 수정, 삭제 처리를 합니다.
 *
 */
public class BoardDao extends DBConnPool {
	
	public List<BoardDto> getList(Criteria cri){
		List<BoardDto> list = new ArrayList<>();
		String sql = "select * from "
				+ "(select rownum rnum, b.* "
				+ "from "
				+ "(select * from board order by num desc) "
				+ "b) "
				+ "where rnum between ? and ?";
		//db로 부터 게시글의 목록을 조회하여 list 에 담아 반환
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cri.getStartNo());
			pstmt.setInt(2, cri.getEndNo());
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
//				String num = rs.getString("num");
//				//String content = rs.getString("content");
//				String title = rs.getString("title");
//				String id = rs.getString("id");
//				String postdate = rs.getString("postdate");
//				//String visitcount = rs.getString("visitcount");
//				
//				BoardDto dto = new BoardDto(num, title, "" , id, postdate, "");
				BoardDto dto = new BoardDto();
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setNum(rs.getString("num"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setTitle(rs.getString("title"));
				dto.setVisitcount(rs.getString("visitcount"));
				
				list.add(dto);
			}
			return list;
			
		} catch (SQLException e) {
			System.out.println("==SQLException");
			e.printStackTrace();
		}
		
		return list;
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
	
	/**
	 * 게시글을 삭제합니다.
	 * @param num: 삭제할 게시물의 번호
	 * @return res: 삭제된 게시물의 수 
	 */
	public int deleteBoard(String num) {
		int res = 0;
		String sql = "delete from board where num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("==SQLException");
			e.printStackTrace();
		}
		
		return res;
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

	public int getTotalCnt() {
		int total = 0;
		String sql = "select count(*) from board";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				total = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
	
	
	
	
	
}
