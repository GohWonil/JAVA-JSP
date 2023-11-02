package operator;

import java.util.Scanner;

public class QUiz2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
//		double firstNum;
//		double secondNum;
//		
//		System.out.println("첫 번째 수: ");
//		firstNum = scanner.nextDouble();
//
//
//		System.out.println("두 번째 수: ");
//		secondNum = scanner.nextDouble();
//		
//		System.out.println("----------------");
//		
//		if(secondNum == 0.0) 		
//		{System.out.print("결과: 무한대");} else { 
//		System.out.print("결과: " + (firstNum/secondNum) );}
		System.out.println("첫번째 수를 입력하세요");
		double number1 = Double.parseDouble(sc.nextLine());

		System.out.println("두번째 수를 입력하세요");
		double number2 = Double.parseDouble(sc.nextLine());

		if ( (number2 != 0.0) ) {
			double result = number1 / number2;
		System.out.println("결과: " + result);
		} else {  
		System.out.println("결과: 무한대");
		}

	}
}