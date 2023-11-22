package com.momo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.momo.common.DBConnPool;
import com.momo.dto.BoardDto;
import com.momo.dto.Criteria;

//DBConnPool
//톰켓에서 제공해주는 기능을 사용하여 커넷견풀이라는 공간에 커넥션 객체를 미리 생성 해놓고 사용하는 객체
//main메서드 사용이 불가능, 서버가 실행되어야 사용이 가능하고 
//만약, main 메서드를 이용해서 테스트를 하고 싶다면 상속받는 객체를 DBConnection으로 변경

public class BoardDao extends DBConnPool {
//	public int insertBoard(BoardDto dto) {
//		
//	}
	/**
	 * 
	 * @param num
	 * @return
	 */
	public int deleteBoard(String num) {
		int res = 0;
		String sql = "delete from board where num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * 게시글 조회수 1증가 시켜줌
	 * insert, update, delete의 반환 타입은 int(몇건이 처리 되었는지 반환)
	 * 반환타입은 int로 설정
	 */
	public int visitCountUp(String num) {
		int res = 0;
		String sql = "update board\r\n"
				+ "set visitcount = visitcount + 1\r\n"
				+ "where num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);

			res = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;

	}
	
	
	/**
	 * 한건의 게시글을 조회후 반납합니다
	 * @return
	 */
	public BoardDto getOne(String num) {
		BoardDto dto = null;
		
		try {
			pstmt = con.prepareStatement("select * from board where num = ?");
			pstmt.setString(1, num);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new BoardDto();
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
	
	/**
	 * 게시글 목록을 반환합니다 + 페이징 처리
	 * @return List<BoardDto>
	 */
	public List<BoardDto> getList(Criteria cri) {
		List<BoardDto> list = new ArrayList<>();
		try {
			String where = ""; 
			//검색어와 검색필드에 값이 들어있다면 조건문장을 생성
			if(!"".equals(cri.getSearchField())
					&& !"".equals(cri.getSearchWord())) {
				where = "where " + cri.getSearchField() 
				+ " like '%" + cri.getSearchWord() + "%'";
			}
			
			System.out.println("where : " + where);
			
		pstmt = con.prepareStatement("select * from "
				+ "(select rownum rnum, b.* "
				+ "from "
				+ "(select * from board "
				+ where
				+ "order by num desc) "
				+ "b) "
				+ "where rnum between ? and ?");
		
			//시작번호 = 끝번호 - (페이지당 게시물수 - 1)
			pstmt.setInt(1, cri.getStartNum());
			
			//끝번호 = 페이지 번호 * 페이지당 게시물수
			pstmt.setInt(2, cri.getEndNum());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDto dto = new BoardDto();
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
				
				list.add(dto);
				
			}

			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	/**
	 * 게시글의 총 건수를 조회후 반환
	 * 집게함수를 이용하여 게시글의 총 건수(count(*))를 구함
	 * @return 게시글의 총 건수
	 */
	public int getTotalCnt(Criteria cri) {
		int res = 0;
		String where = ""; 
		//검색어와 검색필드에 값이 들어있다면 조건문장을 생성
		if(!"".equals(cri.getSearchField())
				&& !"".equals(cri.getSearchWord())) {
			where = "where " + cri.getSearchField() 
			+ " like '%" + cri.getSearchWord() + "%'";
		}
		
		String sql = "select count(*) from board" + where;
		
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				res = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}
