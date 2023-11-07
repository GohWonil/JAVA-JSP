package sec01.exam12;

public class StringCharAtExample {

	public static void main(String[] args) {

		//주민등록번호에서 뒤에 7자리의 첫번째 숫자 이용하여 남/여 구분
		String ssn = "010624-1230123";
		
		//7자리중에 첫번쨰 글자를 가져오세요
		//ssn에 중간에 "-"이 들어있어 인덱스는 7이됩니다
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다");
			break;
		}
	}

}
