package ch04.sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {

		while(true) {
			int num = (int)(Math.random() * 10000) + 1;
			System.out.println(num);
			if(num == 10000) {
				break;}
			}
		System.out.println("종료");
		
	}

}
