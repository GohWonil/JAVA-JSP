package ch09.exercise.sec01.exam05;

public class CheckBoxExample {
	public static void main(String[] args) {
		// 화면에 CheckBox위젯을 배치합시다.
		//   지금은 CheckBox가 화면에 배치되었다고 가정 
		
		CheckBox checkBox = new CheckBox();
		// checkBox객체에 이벤트 핸들러 등록
		checkBox.setOnSelectListener(
				new BackgroundChangeListener()
			);
		/// checkBox위젯에 강제로 OnSelect이벤트 발생
		checkBox.select();
		
	}
}
