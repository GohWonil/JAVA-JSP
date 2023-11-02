package sec01.exam18;

public class StringSubstringExample {

	public static void main(String[] args) {

		String ssn = "880815-1234567 ";
		
		System.out.println("012345678901234");
		System.out.println(ssn);
		
		//substring(시작인덱스, 끝인덱스)
		//부분문자열을 가져옴 시작인덱스부터 출발해서 마지막 인덱스 -1까지
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		//두번째 구간 숫자의 시작이 7번인덱스부터 
		//끝나는 마지막 인덱스 문자열의 크기 -1로 구함
		String secondNum1 = ssn.substring(7, 13);
		String secondNum2 = ssn.substring(7, ssn.length());
		System.out.println(secondNum1);
		System.out.println(secondNum2);

	}

}