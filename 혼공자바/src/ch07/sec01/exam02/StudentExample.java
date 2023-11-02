package ch07.sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("홍길동", "123456-789123", 1);
		
		//홍길동학생의 정보 출력
		//Student클래스는 실제로 name, ssn을 직접 가지고 있지 않고
		//부모 클래스를 통해서 상속을 받아 참조하고 있음
		
		System.out.println("학생이름: " + student.name);
		System.out.println("주민번호: " + student.ssn);
		System.out.println("학생번호: " + student.studentNo);
		
		
	}

}
