package sec01.exam06;

public class ButtonExample {
	public static void main(String[] args) {
		Button button = new Button();
		
		// 실제 버튼을 누르면 실행할 이벤트핸들러 등록
		//   버튼이 눌려지면 자동으로 호출할 함수등록
		button.setOnClickListener(new CallListener());
		// 실제 버튼 동작(touch)
		button.touch();
		
		
		// 또다른 이벤트 핸들러 등록
		button.setOnClickListener(new MessageListener());
		button.touch();
		
	}

}
