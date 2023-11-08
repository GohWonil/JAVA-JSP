package operator;

public class QUiz {

	public static void main(String[] args) {
 
		byte b = 5;
//		b = -b;
		int result = 10 / b;
		System.out.println(result);
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //11+20=31
		System.out.println(z);
		
		int var1 = 5;
		int var2 = 2; 
		double var3 = (double)var1 / var2;
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		int value = 356;
		System.out.println(value / 100 * 100);
		
		float a = 10f;
//		float b = a / 100;
		if(b == 0.1) { System.out.println("10%입니다.");}
		else {System.out.println("10%가 아닙니다.");
	
		int lengthTop = 5; 
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
		
	}
	}
}
