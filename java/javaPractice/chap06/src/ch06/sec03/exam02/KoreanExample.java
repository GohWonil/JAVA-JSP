package ch06.sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("박자바", "770901-1110100");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn); 
		
		Korean k2 = new Korean("김자바", "012345-6789011");
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn); 
		
	}
 
}
