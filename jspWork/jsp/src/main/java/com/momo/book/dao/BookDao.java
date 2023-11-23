package com.momo.book.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.momo.common.DBConnPool;
import com.momo.dto.Criteria;
import com.momo.lib.dto.BookDto;

/**
 * DB에 접근하여 쿼리를 질의합니다.
 */
public class BookDao extends DBConnPool{
	/**
	 * 도서목록을 조회 후 반환
	 * @return 도서목록
	 */
	public List<BookDto> getList(Criteria cri) {
		List<BookDto> list= new ArrayList<>();
		//--order by  절 보다 select절이 먼저 실행이 되어서 정렬이 되기전 번호가 붙는다
		//--rownum은 가지고와서 처리하기때문에 다시 한번 셀렉으로 처리
		//--최신 게시물을 먼저 조회하기 위해 정렬
		String sql = "select * from(\r\n"
				+ "select t.*, rownum rnum from (\r\n"
				+ "    select *\r\n"
				+ "    from book\r\n"
				+ "    order by no desc)t)\r\n"
				+ "where rownum between ? and ?";
		
		try {
			//sql = pageingQuery(sql);
			pstmt = con.prepareStatement(sql);
			
//			pstmt.setString(1, "시작번호");
//			pstmt.setString(2, "끝번호");
//			pstmt.setInt(1, 2);
//			pstmt.setInt(2, 4);
			pstmt.setInt(1, cri.getStartNum());
			pstmt.setInt(2, cri.getEndNum());
			//쿼리 실행
			rs = pstmt.executeQuery();
			//결과집합으로 부터 도서의 정보를 가지고 와서 dto에 저장 후 리스트에 담는다.
			while(rs.next()) {
				String no = rs.getString("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String rentYn = rs.getString("rentYn");
				
				BookDto dto = new BookDto(no, title, author, rentYn);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * 도서의 상세 정보를 조회 후 반환
	 * @param no
	 * @return
	 */
	public BookDto view(String no) {
		BookDto dto = new BookDto();
		String sql = "select * from book where no = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			//?의 갯수만큼 파라메터를 설정
			pstmt.setString(1, no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setNo(rs.getString("no"));
				dto.setTitle(rs.getString("title"));
				dto.setAuthor(rs.getString("author"));
				dto.setRentYn(rs.getString("rentYn"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public int getTotalCnt() {
		int res = 0;
		String sql = "select count(*) from book";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				res = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} return res;
 	} 
}
