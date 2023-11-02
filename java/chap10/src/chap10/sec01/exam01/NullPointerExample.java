package chap10.sec01.exam01;

public class NullPointerExample {

	String name = "황진이";
	String addr = "개성";
	String country = "한국";
	
	public String toString() {
		return "이름: " + name + "\n" +
				"주소: " + addr + "\n" +
				"국가: " + country + "\n";
	}
	
	
	public static void main(String[] args) {

//		String data = null;
//		System.out.println(data.toString());
		
		NullPointerException npe = new NullPointerException(
				);
		System.out.println(npe.toString());
	}

}
