package typeConversion;

import java.util.Scanner;

public class Question2 {
	/* Scanner를 이용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드를 작성해보세요.
//	[필수 정보 입력]
//	1.  이름: 
//	2. 주민번호 앞 6자리: 
//	3. 전화번호: 
//	
//	[입력한 내용]
//	홍길동
//	123456
//	010-123-1234
//	*
////	*/
//}

//    public static void main(String[] args) {
    	
    	
//    	
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("[필수 정보 입력]");
//        
//        System.out.print("1. 이름: ");
//        String name = scanner.nextLine();
//        
//        System.out.print("2. 주민번호 앞 6자리: ");
//        String ssn = scanner.nextLine();
//        
//        System.out.print("3. 전화번호: ");
//        String tel = scanner.nextLine();
//        
//        System.out.println();
//        
//        System.out.println("[입력된 내용]");
//        System.out.printf("1. 이름: %s\n", name);
//        System.out.printf("2. 주민번호 앞 6자리: %s\n", ssn);
//        System.out.printf("3. 전화번호: %s\n", tel);
//    }
//}

//
//import java.util.Scanner;
//
//public class Question2 {
//
	public static void main(String[] args) throws Exception {

		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리: ");
		String ssn = scanner.nextLine();
		
		System.out.println("3. 전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		
//		System.out.println("[입력된 내용]");
//		System.out.println(name);
//		System.out.println(ssn);
//		System.out.println(tel);

		
		System.out.printf("%[입력된 내용]s \n 1. 이름: %1$s \n 2. 주민번호 앞 6자리: %2$d \n 3. 전화번호: %3$d \n", name, ssn, tel);
	}
}
		
//		
//		
//		
//		
//		
////		Scanner scanner = new Scanner(System.in);
////		String a = scanner.nextLine();
////		
////		while(true) {
////			System.out.println("[필수 정보 입력");
////			System.out.println("1.이름: " + a);
////			System.out.println("2.주민번호 앞 6자리: " + a);
////			System.out.println("3.전화번호: " + a);
////		if(a.equals("010")); { 
////		break;
////		}
////	}
////		System.out.println();
