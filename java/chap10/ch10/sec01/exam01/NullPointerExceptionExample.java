package ch10.sec01.exam01;

public class NullPointerExceptionExample {
	public String name = "황진이";
	public String addr = "개성";
	public String country = "한국";
	
	public NullPointerExceptionExample(String name,
			String addr, String country) {
		this.name = name;
		this.addr = addr;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "이름 : " + this.name + "\n" +
	           "주소 : " + this.addr + "\n" +
			   "국가 : " + this.country + "\n";
	}

	public static void main(String[] args) {
		// String data = null;
		// System.out.println(data.toString());
		
		// NullpointerExceptionExample 객체 생성
		NullPointerExceptionExample npe = 
		 	new NullPointerExceptionExample(
		 		"홍길동", "울릉도", "대한민국");
		System.out.println(npe.toString());

	}

}
