package typeConversion;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		int Value1 = Integer.parseInt("10");
		double Value2 = Double.parseDouble("3.14");
		boolean Value3 = Boolean.parseBoolean("true");
		
		System.out.println(Value1);
		System.out.println(Value2);
		System.out.println(Value3);

		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str = String.valueOf(2133);
		System.out.println(str);
		
		
	}

}
