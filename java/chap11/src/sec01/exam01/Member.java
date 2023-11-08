package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//보통 매개변수로 데이터를 넘길때
	//일반적인 부모클래스(주로 object)타입으로 작업
	//그래서 매개변수 형식을 검사
	//논리합 논리곱 등에서 사용하는 short circut (or 또는 and) 기법
	
		@Override // object 클래스의 equals메소드를 꼭 재정의해라
		public boolean equals(Object obj) {
			if (obj instanceof Member) {
				//obj Member타입이므로 실제 세부검사 시행
				Member member = (Member) obj;
				if(id.equals(member.id)) {
					return true;
				}
			}
			return false;
		}
}
