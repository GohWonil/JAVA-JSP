package extra.sec04.exam03;

public class MemberService {
	
	boolean login(String id, String password) {
		//id와 password가 일치하는가를 확인하려면
		//데이터베잇와 연결 필요
		//userId="hong" userPassword="12345"로 가정
		String userId = "hong";
		String userPassword = "12345";
		
		if ((userId.equals(id)) && (userPassword.equals(password))){
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("로그아웃");
	}
}
