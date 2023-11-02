package ch09.exercise.sec01.exam05;

public class BackgroundChangeListener 
   implements  CheckBox.OnSelectListener {

	@Override
	public void onSelect() {
		System.out.println(
			"CheckBox위젯을 누르면 배경을 바꿉니다.");
		
	}

}
