package typeConversion;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) throws Exception{

		//Scanner를 이용해서 키보드로 입력한 두 수를 덧셈하여 결과를 출력하고자 함
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수");
		String strNum1 = scanner.nextLine();
				
				
		System.out.println("두번째 수");
		String strNum2 = scanner.nextLine();
				
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		
	}

}
