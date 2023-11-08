package ch06.sec05.exam05;

public class PersonExmaple {

	public static void main(String[] args) {

		Person p1 =  new Person("123456-123456", "홍길동");
		
		System.out.println("국가: " + p1.nation);
		System.out.println("주민번호: " + p1.ssn);
		System.out.println("이름: " + p1.name);
		
		System.out.println("=====================================");
		
		Person p2 = new Person("USA", "123456-1234567", "Jane");
		
		System.out.println("국가: " + p2.nation);
		System.out.println("주민번호: " + p2.ssn);
		System.out.println("이름: " + p2.name);
		
		System.out.println("=====================================");

//		p2.nation = "ENG";
	}

}
