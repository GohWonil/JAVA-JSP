package ch03.sec02.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 85;
		
		/*점수가 90점이 아느므로 거짓부분이 실행됩니다.
		 * 거짓부분에서 다시 삼항연산자를 비교하고 있습니다,.
		 * 그결과 80 점보다 크므로 'B'값이 선택됩니다.*/
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(grade);
		
		
	}

}
