package sec02.exam02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		//현재 달력만들기
		//Calendar클래스는 추상클래스로 직접 객체를 생성못함
		//대신 스태틱메소드로 getInstance()함수 이용
		//운영체제 시간을 얻어옴
		Calendar now = Calendar.getInstance();
		
		//연도구하기
		int year = now.get( Calendar.YEAR);
		
		//월 구하기
		int month = now.get( Calendar.MONTH) + 1;
		
		//일구하기
		int day = now.get( Calendar.DAY_OF_MONTH);
		
		//요일구하기
		int week = now.get( Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
			
		case Calendar.THURSDAY:
			strWeek = "목";
			break;			
 		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(strWeek);
		System.out.println(strAmPm);

	}

}
