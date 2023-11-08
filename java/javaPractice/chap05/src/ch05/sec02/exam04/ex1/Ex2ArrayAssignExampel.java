package ch05.sec02.exam04.ex1;

public class Ex2ArrayAssignExampel {

	public static void main(String[] args) {
		
//		1. 크기가 10인 정수형 배열 생성 (데이터 모델에 해당 - Model)
//		2. 각 배열에 0부터 9까지 값을 채움(실제 데이터를 처리하는 비즈니스로직)
//			Business Logic - Controller라고 부름
//		3. 배열의 내용을 출력 
//			(Model과 Controller를 이용해서 화면에 출력할 내용을 보여줌 (view)
//			이런방식으로 프로그램을 설계해서 작성
//			MVC(Model -View-Controller) 디자인 패턴
			
		int[] s = new int[10];
		
		
		for(int i = 0; i < s.length; i++) {
			s[i] = i;
			System.out.println(s[i]);
		}
		
		int count = 0;
		while (count < s.length) {
			System.out.println(s[count] + ", ");
//			루프를 빠져나가려면 count변수가 조건식보다 커야함
			count++;
		}
		
		s[s.length] = 10;
		System.out.println("s[" + s.length + "] = " + s[s.length]);
	}
}
