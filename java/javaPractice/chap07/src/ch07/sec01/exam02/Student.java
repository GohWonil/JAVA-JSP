package ch07.sec01.exam02;

public class Student extends People {

	//Student 추가필드
	public int studentNo;  //학생번호 추가
	
//	//생성자에 추가 필드가 필요
//	public Student(String name, String ssn) {
//		super(name, ssn);
//	}

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
