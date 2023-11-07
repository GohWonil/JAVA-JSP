package ch02.sec03.exam03;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		double result = x / y ;
		System.out.println(result);
		
		// x, y를 강제로 더블형으로 변환
		result = (double) x / y;
		System.out.println(result);
		
		
		
	}

}
