package sec02.exam00;

public class Child extends Parent{

	public String cstr1 = "1";
	private String cstr2 = "2";
	
	//생성자
		public Child() {
			
		}
		
		private Child(String str) {
			cstr1 = str;
		}
		
		//메소드

		public int method4() {
			System.out.println("method4: 매개변수 없음");
			return 0;
		}
		
		public int method4(int n) {
			System.out.println("method4: " + n);
			return n;
		}
		
		private int method5(int n) {
			System.out.println("method5: " + n);
			return n;
		}
	}
