package baekjoon;

public class SumResult {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 1; i <=100; i++) {
			sum += i;
			
			if(i % 10 == 0) {
				System.out.print(i);
			} else {
				System.out.print(i + " + ");
			}
			
			if(i % 10 == 0) {
				System.out.println(" = " + sum);
			}
		}
	}

}
