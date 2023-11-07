package ch10.sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		// 매개변수를 넘겨주지 않으면 예외발생
		//   따라서 예외가 날것으로 예상되는 지점은
		//   모조리 try ~ catch ~finally 하세요
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(
				"실행 매개변수의 수가 부족합니다.");
			return ;
			
		}
		
		/// 매개변수가 정상적으로 넘어왔으므로
		// 실제 알고리즘 처리
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(
    		   data1 + " + " + data2 + " = " + result);
		} catch(NumberFormatException e) {
			System.out.println(
				"숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행해주세요");
		}
		
		
		
		

	}

}
