package extra.sec04.exam03;

public class MemberServiceExample {

	public static void main(String[] args) {

		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		if(result == true) {
			System.out.println("로그인");
			memberService.logout("hong");
		} else { 
		System.out.println("실패");
	}
	}
}
