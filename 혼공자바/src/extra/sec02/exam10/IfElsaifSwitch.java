package extra.sec02.exam10;

import java.time.LocalDateTime;

public class IfElsaifSwitch {

	public static void main(String[] args) {

//		/* 연습문제 3. 다중 if ~ else if 또는 switch 이해하고 있을까요 
//		 * 
//		 * 1) 오늘 날짜를 얻어서 현재 월을 구하시요.
//		 * 
//		 * 2) 현재 월이 
//		 * " 3월, 4월, 5월인 경우 현재 월 + "은 봄입니다. spring
//		 * " 6월, 7월, 8월인 경우 현재 월 + "은 여름입니다. summer
//		 * " 9월, 10월, 11월인 경우 현재 월 + "은 가을입니다. autumn
//		 * " 12월, 1월, 2월인 경우 현재 월 + "은 겨울입니다." winter
//		 * 
//		 * 3) 현재 날짜는 LocalDateTime클래스를 참조하세요. 
//		 * import java.util.LocalDateTime;
//		 * 현재 날짜는 다음으로 
//		 * LocalDateTime now = LocalDateTime.now (); 
//		 * 현재월은 다음 메소드로 구합니다. 
//		 * int month = now.getMonthValue();*/
		
		final int spring = 0;
		final int summer = 1;
		final int fall = 2;
		final int winter = 3;
		
//		사계절 이름을 배열로 선언 및 초기화
//		seasons 배열 변수 현재 만들어지면서 
//		봄 여름 가을 겨울의 힙을 바로 가리키고 있다.
		
		String[] seasons = new String[] {"봄", "여름", "가을", "겨울"};
//		이 가르키는 것을 중지시킨다. (가비지 컬렛터가 작동)
		seasons = null;
//		영어로 출력하기를 원해서 새로운 힙창고에
//		새로운 (new) String[4] 크기의 스트링 배열을 만든다
//		데이터는 "Spring/Summer/fall/winter" 로 초기화를 한다
//		{}안의 초기화 데이터로 배열의 크기를 알 수 있다.
		
		seasons = new String[] {
				"Spring", "Summer", "Fall", "Winter"
				};
		
//		오늘 날짜 구하기
//		LocalDateTime이라는 라이브러리가 필요
//		오늘 날짜는 LocalDateTime.now()메소드로 구함
		
		LocalDateTime today = LocalDateTime.now (); //현재날짜
		int month = today.getMonthValue(); //현재월
		
//		자바 17부터 적극적으로 권장하는 문자열 표기법
//		프론트언어에서는 템플릿 문자열이라고 부르는
//		Multi-Line String
//		멀티라인 문자열은 """ 시작 """ 로 닫습니다.
		String msg = """ 
				%s월은(는) %s입니다.
				""";
		if ( 3 <= month && month <= 5 ) {
//		월에 따라 출력메세지를 만듭니다
			msg = msg.formatted(month, seasons[spring]);
		} else if( 6 <= month && month <= 8) {
			msg = msg.formatted(month, seasons[summer]);
		} else if( 9 <= month && month <= 11) {
			msg = msg.formatted(month, seasons[fall]);
		} else if( 12 <= month && month <= 2) {
			msg = msg.formatted(month, seasons[winter]);
		}
		
//		msg출력 문자열을 화면에 출력합니다
		System.out.println(msg);
		
		
		
		
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.print("봄입니다. [spring]  ");
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.print("여름입니다. [summer]  ");
		}	
		else if(month == 9 || month == 10 || month == 11) {
			System.out.print("가을입니다. [fall]  ");
		}
		else if(month == 12 || month == 1 || month == 2) {
			System.out.print("겨울입니다. [winter]  ");
		}
		System.out.print(month + "월");
	}
}
