package sec01.exam06;


/// 버튼 클래스의 OnClickListener구현 클래스
// 가상의 전화를 건다
public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
		
	}
	
}
