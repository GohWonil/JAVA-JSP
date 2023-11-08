package referenceType;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
//		정수 배열 선언
//		변수를 선언할때 값을 대입하는 것
//		=초기화 ( 이니셜라이즈 = initialize )
		int[] scores = { 83, 90, 87 }; // 빈배열
//		scores[0] = 123; //0번째 변수 변경

//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);

		// 반복문을 이용하기
		int sum = 0;

		for (int i = 0; i < 3; i++) {
//			System.out.println(scores[index]);

			sum += scores[i];
			System.out.println(sum);
		}
		{
			double a = (double) sum / 3;
			System.out.println(a);
		}
	}
}
