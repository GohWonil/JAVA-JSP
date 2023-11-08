package ch01.sec02.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2;
			v2 = v1 -10;
//		} 중괄호를 잘써야 오류가 안생긴다.
		
		int v3 = v1 + v2 + 5; 
		
		System.out.println(v3);}
	}

}
