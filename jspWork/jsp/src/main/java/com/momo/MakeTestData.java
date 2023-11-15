package com.momo;

import java.sql.SQLException;

import com.momo.common.DBConnection;

import oracle.net.aso.d;

/**
 * JDBC를 활용한 테스트 데이터 생성
 * board 테이블에 테스트 데이터를 생성
 */
public class MakeTestData extends DBConnection{
	/**
	 * board 테이블에 데이터 삽입
	 */
	public void insert() {
		//입력 쿼리
		String sql = 
			"INSERT INTO board (NUM, TITLE, CONTENT, ID, POSTDATE, VISITCOUNT)"
			+ "VALUES"
			+ 		"(seq_board_num.nextval,"
			+ 		"'제목'||seq_board_num.currval||'입니다',"
			+ 		"'내용'||seq_board_num.currval||'입니다',"
			+ 		"'test',"
			+ 		"SYSDATE,"
			+ 		"0)";
		try {
			pstmt = con.prepareStatement(sql);
			
			//입력 실행
			int res = pstmt.executeUpdate();
			System.out.println(res + "건 입력 되었습니다");
			
		} catch (SQLException e) {
			System.out.println("==SQLException");
			e.printStackTrace();
		}
	}

	/**
	 * 자바 프로그램 실행 main 메소드 
	 * @param args
	 */
	public static void main(String[] args) {
		MakeTestData d = new MakeTestData();
		//반복문을 이용해서 자료 많이 넣어보기
		for(int i=0; i<100; i++) {
			d.insert();
		}
	//자원 반납
	d.close();
	}
}