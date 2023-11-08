package ch01.sec02.exam08;

public class BooleanExample {

	public static void main(String[] args) {
		
	
		{boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
			} else {
			System.out.println("시작합니다.");
			}
			
		//0과1을 가지고 0이 나오면 false, 1이 나오면 True
		
		{boolean a = false; //프로그램을 처음시작할때 보통 false를 둠
		// math.random() : 0:0 <=rand < 0.999999999난수
		// math.random() * 2 : 0.0 * 2 <= rand * 2 < 0.99999 * 2
		// (int) (Math.random() * 2) : 난수 값보다 작은 정수
		int b = (int) (Math.random() * 2);
		if(b==0) {
			System.out.println("진실");
		}
		else{
			System.out.println("거짓");
		}
		}
		
			boolean start = false;
			if(start) {
				System.out.println("중지합니다.");
				} else {
				System.out.println("시작합니다.");			
				}
}
}
}