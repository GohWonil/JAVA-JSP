package extra.sec01.exam01;

public class DiceGame01App {

	public static void main(String[] args) {

//		/*
//		 * 주사위 눈금을 얻을려면 난수를 이용합니다. 
//		 * Math.random()이용 : 0<= 눈금 < 1 작은 실수 (int) 숫자 : 
//		 * 강제로 정수로
//		 * 바꿔주세요
//		 */

	

		while (true) {
			
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			System.out.println("첫" + a + "두" + b);

			if ((a + b) == 5)
			break;

		} 
		}
	}
