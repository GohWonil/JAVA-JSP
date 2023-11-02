package ch06.sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {

		Computer myCom = new Computer();
		//계산할 배열선언
		int[] values = {1, 2, 3};
		
		int result1 = myCom.sum1(values);
		System.out.println(result1);
		
		//즉석에서 배열생성하여 인수로 넘기기
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println(result2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println(result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println(result4);

	}

}
