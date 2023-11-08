package extra.sec01.exam01;

import java.util.Date; //패키지의 대문자단어는
						//이 패키지에는 Date클래스 데이트 날짜 데이터 타입이 있습니다.

import java.util.Random;
import java.text.SimpleDateFormat;

public class SimpleFortuneGame {

	public static void main(String[] args) {

//	오늘의 날짜를 얻어야 합니다.
//	java.util.date. 라이브러리 패키지에 있음.
//	import java.util.date 라는 라이브러리를 가져와야합니다.
//	오늘의 운세를 랜덤정수로 판별할 것
//	random 라이브러리가 필요
//	java.util.Random 라이브러리 패키지 사용
//	날짜는 각 나라마다 출력형식이 다릅니다.
//	따라서 출력형식을 지정할 필요가 있음
//	날짜 출력형식 지정 클래스는 java.text.SimpleDateFormat안에
//	있습니다.
		
//	포츈게임 만드는 방법
//	1. 오늘 날짜를 얻습니다. today = new Date();
		Date today = new Date(); //오늘날짜를 가지고 있는 Date객체 생성
		
//	2. 날짜 객체는 현재 국가에 따라 다르게 표시가 됩니다.
//	따라서 이부분을 한국형식으로 바꾸어 출력
//	SimpleDateFormat ("yyyy년 MM월 dd일")
//	이 객체는 문자열을 리턴합니다.
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일\n");
		
// 	3. 위의 오늘의 날짜를 어떻게 한국식으로 출력할 것인가?
//		위의 dateFormat 객체의 format(날짜객체)를 실행하면
//		지정한 형식의 현재 날짜 문자열을 반환합니다.
//		System.out.print(): 출력하고 커서가 마지막 칸에 머뭄
//		System.out.println(): 출력하고 커서가 다음줄로 이동
//		System.out.print(""\n"): 출력하고 커서가 마지막 칸에 머뭄

		System.out.print(dateFormat.format(today));
		
//	4. 오늘의 운세를 얻어야 합니다.
//		오늘의 운세는 단순하게 난수를 0~100 사이의 숫자를 구해
//		이 숫자가 운세 백분율을 의미합니다. 실제라면 운세 판단 공식이 필요
		Random rnd = new Random();
		
//	5. 만들어진 랜덤객체로 부터 지정한 범위까지의 정수르 얻는다.
//		random.nextInt() % 100 : 임의의 수를 100으로 나눈 나머지를 구함 (0~99)
//		random 객체는 음수도 발생시킴에 따라 무조건 양수로 변환필요
//		Math.abs(변환숫자): 변환숫자를 무조건 양수로 반환
		int randomNum = Math.abs(rnd.nextInt() % 100) +1; // +1하면 100%도 가능
//		100으로 나눈 나머지의 양수에 +1을 해주면 100%행운표시 가능
		
//	6. 행운의 내용을 출력
		System.out.print("금전운(100%) : " + randomNum + "%");
		
	}

}
