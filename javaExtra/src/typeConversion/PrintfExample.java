package typeConversion;

public class PrintfExample {

	public static void main(String[] args) {

		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %10s | %10s\n", 1, name, job);
		
		
		String name1 = "감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		
		System.out.println("이름: " + name1);
		System.out.println("나이: " + age);
		System.out.println("전화: " + tel1 + "-" + tel2 + "-" + tel3);
		System.out.println();
		
		System.out.print("이름: " + name1 + "\n");
		System.out.print("나이: " + age + "\n");
		System.out.print("전화: " + tel1 + "-" + tel2 + "-" + tel3 + "\n");
		System.out.println();
		
		System.out.println("이름: " + name1);
		System.out.print("나이: " + age + "\n");
		System.out.printf("전화: %1$s-%2$s-%3$s", tel1, tel2, tel3);
		
	}

}