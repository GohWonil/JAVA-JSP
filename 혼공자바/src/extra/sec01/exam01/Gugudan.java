package extra.sec01.exam01;

	public class Gugudan {
	    public static void main(String[] args) {
	        for (int i = 2; i < 10; i++) {
	            System.out.println(i + "단");
	            for (int j = 1; j < 10; j++) {
	                System.out.println(i + " x " + j + " = " + (i * j));
	            }
	            System.out.println(); // 한 단 출력 후 빈 줄 추가
	        }
	    }
	}
