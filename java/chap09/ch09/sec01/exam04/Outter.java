package ch09.sec01.exam04;

public class Outter {
	public void method2(int arg) {
		// 로컬변수 
		int localVariable = 1;
		
		arg = 100;
		localVariable = 100;
		
	
		class Inner{
			int result = arg + localVariable;
		}
	}

}
