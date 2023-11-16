package com.login.dto;

public class Criteria {

	//사용자의 요청 정보가 없는 경우를 대비해 초기값을 설정
	private int pageNo = 1; //사용자의 요청 정보
	private int amount = 10; // 사용자의 요청 정보
	private int endNo;
	private int startNo;
	
	//기본생성자
	public Criteria() {
		
	}
	
	//매번 형 변환을 할수 없으니 String으로 값을 설정하고 셋팅 (생성자)
	public Criteria(String pageNo, String amount) {
		
		
			if(pageNo != null && "".equals(pageNo)) {
				//필드에 설정
				this.pageNo = Integer.parseInt(pageNo);
			}	
			
			if(amount != null && "".equals(amount)) {
				this.amount = Integer.parseInt(amount);
			}
		
		//시작 번호와 끝번호 
		endNo = this.pageNo * this.amount;
		startNo = endNo - (this.amount)-1;
		
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getEndNo() {
		return endNo;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}
}
