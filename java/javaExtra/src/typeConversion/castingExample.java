package typeConversion;

public class castingExample {

	public static void main(String[] args) {
		
//		int 타입은 char 타입으로 변환하여 문자를 출력할 수 있다. 유니코드
		int intValue = 66;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
//		실수 타입은 정수 타입으로 변환하여 소수점을 뺸 정수로 출력할 수 있다.
		double doubleValue = 3.14;
		int intValue1 = (int) doubleValue;
		System.out.println(intValue1);
		
		int intValue3 = 44032;
		char charValue1 = (char) intValue3;
		System.out.println(charValue1);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

	}

}
