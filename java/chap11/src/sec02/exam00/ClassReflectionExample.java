package sec02.exam00;

public class ClassReflectionExample {

	public static void main(String[] args) throws ClassNotFoundException {
		//바이트코드(자바 기계어 실행파일) 분석을 위해 
		
		//1. 클래스(바이트코드) 파일을 읽어오는 방법
		Class clazz = Car.class;
		
		//바이트 코드 정보 출력
			System.out.println
				("### clazz 클래스 정보 얻기 ###");
			System.out.println
				("clazz 참조 클래스의 이름: " + clazz.getName() );
			System.out.println
				("clazz 클래스 이름: " + clazz.getSimpleName() );
			System.out.println
				("clazz 패키지 이름: " + clazz.getPackage().getName() );
		
		
		
		System.out.println();
		
		
		
		//2. 클래스(바이트코드)파일을 읽어오는 방법
		Class clazz2 = Class.forName("sec02.exam00.Car");
		
		//바이트 코드 정보 출력
			System.out.println
				("### clazz2 클래스 정보 얻기 ###");
			System.out.println
				("clazz2 참조 클래스의 이름: " + clazz2.getName() );
			System.out.println
				("clazz2 클래스 이름: " + clazz2.getSimpleName() );
			System.out.println
				("clazz2 패키지 이름: " + clazz2.getPackage().getName() );
			
		
		
		System.out.println();
		
		
		
		//3. 클래스(바이트코드)파일을 읽어오는 방법
		Car car = new Car();
		Class clazz3 = car.getClass();
			
		//바이트 코드 정보 출력
			System.out.println
				("### clazz3 클래스 정보 얻기 ###");
			System.out.println
				("clazz3 참조 클래스의 이름: " + clazz3.getName() );
			System.out.println
				("clazz3 클래스 이름: " + clazz3.getSimpleName() );
			System.out.println
				("clazz3 패키지 이름: " + clazz3.getPackage().getName() );
	}

}
