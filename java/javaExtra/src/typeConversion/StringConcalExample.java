package typeConversion;

public class StringConcalExample {
public static void main(String[] args) {
	
	//숫자 연산
		int Value = 10 + 2 + 8;
		System.out.println(Value); //20
		
	//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println(str1); //128
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2); //1028
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3); //1028
		
		String str4 = "10" + (2 + 8);
		System.out.println(str4); //1010

}
}