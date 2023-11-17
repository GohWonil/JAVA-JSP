package com.momo.el;

public class MyElClass{
	
	public String gender="str";
	
	/**
	 * 주민등록번호를 입력 받아서 성별을 반환
	 * @param jumin
	 * @return 성별(남,여)
	 */
	public String getGender(String jumin) {
		String gender = "";
		//문자열의 위치 확인 indexOf
		int startIndex = jumin.indexOf("-")+1;
		//subString(시작인덱스-포함, 끝인덱스-미포함)
		String str = jumin.substring(startIndex,startIndex + 1);
		//주민등록 번호 뒤의 첫번째문자가 1,3이면 남자 2,4면 여자를 반환
		if("1".equals(str)||"3".equals(str)){
			System.out.println("남자");
			gender = "남자";
		} else if("2".equals(str)||"4".equals(str)){
			System.out.println("여자");
			gender = "여자";
		} else {
			System.out.println("주민등록번호를 확인해주세요.");
			gender = "주민번호확인";
		}
		
		this.gender = gender;

		return gender;
	}
	
	//static은 프로그램 실행시 바로 시작되기 때문에 getGender에 static을 붙여 주거나 main에 객체를 생성한다
	//MyElClass e = new MyElClass();
	public static void main(String[] args) {
		MyElClass e = new MyElClass();
		
		String str = "000000-2000000";
		//indexOf: 문자열의 위치를 확인
		System.out.println("-의 위치" + str.indexOf("-"));
		int startIndex = str.indexOf("-")+1;
		System.out.println("주민등록 뒷 첫번째 자리" + str.substring(startIndex,startIndex + 1));
		
		//subString : 문자열을 잘라서 원하는 위치의 문자열을 반환
		//subString(시작인덱스-포함, 끝인덱스-미포함)
		//인덱스는 0부터 시작
		System.out.println(str.substring(7));
		System.out.println(str.substring(7,8));
		if("1".equals(str.substring(7,8))||"3".equals(str.substring(7,8))){
			System.out.println("남자");
		} else if("2".equals(str.substring(7,8))||"4".equals(str.substring(7,8))){
			System.out.println("여자");
		} else {
			System.out.println("주민등록번호를 확인해주세요.");
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}