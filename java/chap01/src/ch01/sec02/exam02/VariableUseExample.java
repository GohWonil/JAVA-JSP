package ch01.sec02.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		//현재 설정된 시간 출력
		System.out.println(hour + "시간 " + minute + "분");
		
		//시간을 분으로 환산하기
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");
	}

}
