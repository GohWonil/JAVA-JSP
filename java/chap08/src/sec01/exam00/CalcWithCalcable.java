package sec01.exam00;

//인터페이스 상속을 받으면 인터페이스에 있는 내용을 반드시 구현
public class CalcWithCalcable implements CalcAble {
//	//이항연산을 위한 필수 x, y
//	public int x;
//	public int y;
//	
//	//x, y를 초기화 하는 생성자
//	public CalcWithCalcable(int x, int y) {
//	this.x = x;
//	this.y = y;
//	}

	//인터페이스를 구현한 것에만 신경
	@Override
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
}
