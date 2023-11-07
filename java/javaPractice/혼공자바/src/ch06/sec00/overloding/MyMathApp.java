package ch06.sec00.overloding;

public class MyMathApp {

	public static void main(String[] args) {
		//MyMath형식의 myMath객체를 메모리에 만듦
		MyMath myMath = new MyMath();
		System.out.println("10 + 10 = " + myMath.square(10)); 
		System.out.println("10.0 + 10.0 = " + myMath.square(10.0)); 
		
		//MyMath형식의 myMath1객체를 메모리에 만듦
		MyMath myMath1 = new MyMath();
		System.out.println("10.0 + 10.0 = " + myMath.square(10.0));
		System.out.println("10 + 10 = " + myMath.square(10));
		
		//실제 다른객체
		if (myMath == myMath1) {
			System.out.println("myMath객체와 myMath1객체는 서로 같은객체입니다.");
		} else {
			System.out.println("myMath객체와 myMath1객체는 서로 다른객체입니다.");
		}
		
	}

}
