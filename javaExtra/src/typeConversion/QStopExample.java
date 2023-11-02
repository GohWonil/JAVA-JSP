package typeConversion;

public class QStopExample {

	public static void main(String[] args) throws Exception{

		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode ==97) {
				break;
			}
			}
		System.out.println("종료");
		}
		
	}