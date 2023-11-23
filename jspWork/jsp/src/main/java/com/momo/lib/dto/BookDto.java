package com.momo.lib.dto;

/**
 * 도서 테이블의 정보를 담아줍니다.
 */
public class BookDto {
	private String no;
	private String title;
	private String author;
	private String rentYn;
	private String rentYnStr;
	
	public BookDto() {
		
	}
	
	public BookDto(String no, String title, String author, String rentYn) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.rentYn = rentYn;
		rentYnStr = rentYn.equals("Y") ? "대여중" : "";
	}

	public String toString() {
		return "[title: " + title + "]";
	}
		
	
	public String getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRentYn() {
		return rentYn;
	}

	public String getRentYnStr() {
		return rentYnStr;
	}

	public void setRentYn(String rentYn) {
		this.rentYn = rentYn;
		
		this.rentYnStr = rentYn.equals("Y") ? "대여중" : "";
	}

	public void setRentYnStr(String rentYnStr) {
		this.rentYnStr = rentYnStr;
	}

}
