package com.momo.book.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.momo.common.DBConnPool;
import com.momo.dto.FileDto;


public class FileDao extends DBConnPool{
/*
 * 
--파일 업로드와 다운로드를 위한 테이블 생성
drop table tbl_file;

create table tbl_file (
    file_no number primary key,
    name varchar2(50) not null,
    title varchar2(200) not null,
    cate varchar2(100),
    ofile varchar2(100) not null,
    sfile varchar2(100) not null,
    postdate date default sysdate not null
);

-- 시퀀스 생성
create sequence seq_tbl_file;

-- 데이터 입력
INSERT INTO tbl_file (  file_no, name, title, cate, ofile, sfile)
VALUES ( seq_tbl_file.nextval, '하니', '제목', '카테고리'
                        , 'abc.txt', 'abc_20230621112622.txt');

-- 데이터 조회
SELECT * FROM tbl_file ORDER BY file_no DESC;

commit;



 * */
	public int regFile(FileDto fileDto) {
		String sql = "insert into tbl_file (  file_no, name, title, cate, ofile, sfile)\r\n"
				+ "values ( seq_tbl_file.nextval, ?, ?, ?, ?, ?)";
		int res = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fileDto.getName());
			pstmt.setString(2, fileDto.getTitle());
			pstmt.setString(3, fileDto.getCate());
			pstmt.setString(4, fileDto.getOfile());
			pstmt.setString(5, fileDto.getSfile());
			
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
	}

	public List<FileDto> getList() {
		List<FileDto> list = new ArrayList<>();
		String sql = "select * from tbl_file order by file_no desc";
		
		try {
			pstmt = con.prepareStatement(sql);
			//결과 집합
			rs = pstmt.executeQuery();
			while(rs.next()) {
				FileDto dto = new FileDto();
				
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setCate(rs.getString("cate"));
				dto.setFile_no(rs.getInt("file_no"));
				dto.setOfile(rs.getString("ofile"));
				dto.setSfile(rs.getString("sfile"));
				dto.setPostdate(rs.getString("postdate"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
