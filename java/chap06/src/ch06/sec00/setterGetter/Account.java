package ch06.sec00.setterGetter;

public class Account {

	private int regNumber; // 계좌번호
	private String name; // 소유자
	private int balance; // 잔고

	Account() {
	
	}
	
	public Account(int regNumber) {
		this.regNumber = regNumber;
	}

	// 속성함수 정의
//	void setRegNumber(int regNumber) {
//		this.regNumber = regNumber;
//	}


	void setName(String name) {
		this.name = name;
	}

	void setBalance(int balance) {
	// 만약 입금액이 <0이면 입금액을 0으로 설정
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}

	// set을 지움으로 읽기만 가능한 속성함수
	int getRegNumber() {
		return this.regNumber;
	}

	String getName() {
		return this.name;
	}

	int getBalance() {
		return this.balance;
	}

}
