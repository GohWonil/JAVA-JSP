package com.login.dto;

public class PageDto {
	//페이지 블럭을 생성하기 위해 필요한 변수
	int startNo;
	int endNo;
	int realEnd;
 	boolean prev;
 	boolean next;
 	
 	// 페이지 블럭을 생성하기 위해 필요한 변수에 값을 넣기 위해서 필요한 값
 	int total;			// 총 게시물의 건수
 	Criteria cri;		// 페이지 번호, 페이지당 게시물의 수
 	int blockAmount = 10;	//하나의 페이지 블럭에서 보여줄 페이지의 갯수
 	
 	public PageDto(int total, Criteria cri, String blockAmount) {
 		this(total,cri);
 		if(blockAmount != null && !"".equals(blockAmount)) {
 			this.blockAmount= Integer.parseInt(blockAmount);
 		}
 	}
 	
	public PageDto(int total, Criteria cri) {
		this.total = total;
		this.cri = cri;
		
		//1~10	 : 시작번호 : 1,  끝번호 : 10
		//11~20  : 시작번호 : 11, 끝번호 : 20
		endNo = (int)(Math.ceil(cri.getPageNo() / (blockAmount * 1.0)) * blockAmount);
		startNo = endNo - (blockAmount - 1);
		
		// 게시글이 66건일 경우 끝페이지 번호는 7페이지가 된다.
		//하지만 페이지 블럭의 끝번호는 10번으로 계산이 되므로 끝번호를 다시 설정 해 주어야 한다.
		realEnd = (int)Math.ceil((total * 1.0)/(cri.getAmount()));
		endNo = (endNo > realEnd) ? realEnd : endNo;
		
		// 페이지 블럭 (앞으로 가기, 뒤로가기) 버튼 활성화 여부
		prev = (startNo > 1) ? true : false;
		next = (endNo < realEnd) ? true : false;
		
		System.out.println("시작 : " + startNo);
		System.out.println("끝 : " + endNo);
		System.out.println("진짜끝 : " + realEnd);
		System.out.println("이전 : " + prev);
		System.out.println("다음 : " + next);
		
		
	}
	
	public int getStartNo() {
		return startNo;
	}
	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}
	public int getEndNo() {
		return endNo;
	}
	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
	public int getRealEnd() {
		return realEnd;
	}
	public void setRealEnd(int realEnd) {
		this.realEnd = realEnd;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
}
