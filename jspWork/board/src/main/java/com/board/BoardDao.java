package com.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao extends DBConnectionPool {

	/**
	 * DB로 부터 리스트를 조회후 반환
	 */
	public List<BoardDto> getList() {
		List<BoardDto> list = new ArrayList<>();
		
		//쿼리 정의
		String sql = "select * from board";
		
		//인파라메터를 설정 할 수 있으므로 쿼리 실행전 sql문장을 세팅 합니다.
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//다음 행이 있는지 확인
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
			
		} catch (SQLException e) {
			System.out.println("쿼리 리스트 실행 오류 발생");
			e.printStackTrace();
		}
		
		return list;
	}
}
