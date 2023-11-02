package preparationPrimiiveType;

public class FloatDoubleExample {

	public static void main(String[] args) {
//		float var1 = 3.14; float는 f를 끝에 붙여줘야한다 
		float var1 = 3.14f;
		double var2 = 3.14;
		double var3 = 314e-2;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		//실수값 저장
		//float var1 = 3.14;
		float var21 = 3.14f;
		double var31 = 3.14;
		
		//정밀도 테스트
		float  var4 = 0.1234567890123456789f; //8자리까지
		double var5 = 0.1234567890123456789;  //15자리까지
		
		System.out.println("var21: " + var21);
		System.out.println("var31: " + var31);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);


	}

}
