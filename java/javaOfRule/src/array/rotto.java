package array;

public class rotto {

	public static void main(String[] args) {

		int[] ball = new int[45];
		
		for(int i=0; i < ball.length; i++)
			ball[i] = i + 1;
			
		int a = 0;
		int b = 0;
		
		for(int i=0; i < 6; i++) {
			b = (int)(Math.random() * 45);
			
			a = ball[i];
			ball[i] = ball[b];
			ball[b] = a;
		}
		
		for(int i = 0; i < 6; i++) 
			System.out.println(ball[i]);
	}

}
