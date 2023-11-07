package ch09.exercise.sec01.exam05;

public class CheckBox {
	// 체크박스 자신이 선택되면 
	//   실행할 데이터타입(인터페이스)
	// 이벤트핸들러 = 이벤트리스너 = 이벤트처리기 : 
	//   이벤트(어떤 약속한 상태)의 변화를 감지하면
	//   예정된 행동을 실행하는 것 
	OnSelectListener listener; // 이벤트핸들러 필드
	
	// 속성함수
	void setOnSelectListener(
		OnSelectListener listener) {
		 this.listener = listener;
	}
	
	// 이벤트 발생을 시뮬레이션하는 메소드
	///  실제 이벤트를 발생시키는 상황
	///   보통 하드웨어나 물리적인 상호작용에서
	///     자동으로 발생
	void select() {
		listener.onSelect();
	}
	
	// 이벤트 자바에서는 이벤트를 인터페이스를 
	//   이용해서 선언(정의)합니다.
	static interface OnSelectListener {
		void onSelect();
	}
}
