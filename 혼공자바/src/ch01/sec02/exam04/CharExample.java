package ch01.sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A';		//문자를 직접 저장
		char c2 = 65;		//10진수로 저장
		char c3 = '\u0041';	//16진수로 저장
		
		char c4 = '가';		//문자를 직접 저장
		char c5 = 44032;	//10진수로 저장
		char c6 = '\uac00';	//16진수로 저장
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);
		
		
		String gerrting = "안녕하세요\n \'Hello\'\t\t\"Hi\"";
		System.out.println(gerrting);
		
		
	/*	이스케이프 시퀀스( escape sequence) “문자의 문자)

		\”	:	“ 문자 출력

		\’	:	’ 문자 출력

		\\	:	\ 문자 출력

		\t	:	탭만큼 띄움

		\n	:	줄 바꿈

		\r	:	캐리지리턴 현재 라인의 제일 첫열로 이동 */
		
	}

}
