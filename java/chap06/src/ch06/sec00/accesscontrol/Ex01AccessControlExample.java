package ch06.sec00.accesscontrol;

public class Ex01AccessControlExample {

	public static void main(String[] args) {

		A objA = new A(); //객체 생성
		objA.a = 10;//현재 연습으로 디폴트로 변경
					//다시 전용으로 바꾸면?
		objA.b = 20;//디폴트 접근가능
		objA.c = 30;//공용 접근가능
		
		System.out.println(objA.a);
		System.out.println(objA.b);
		System.out.println(objA.c);

	}

}


class A {
//	private
	int a; //a 전용 접근제어
	int b; // b 디폴트(패키지 레벨) 접근제어
	public int c; //공용
}
