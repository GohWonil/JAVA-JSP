package operator;

public class CompareOperaExample {

	public static void main(String[] args) {
 
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f; //0.10000000149011612
		System.out.println(v4 == v5);
		System.out.println((double)v4 == v5);
		System.out.println((float)v4 == v5);


	}

}
