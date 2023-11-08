package ch06.sec00.setterGetter;

public class SafeArrayExample01 {

	public static void main(String[] args) {

		int[] array = new int[] {0, 1, 2, 3};
		
		for (int i = 0; i <= array.length + 1; i++) {
			System.out.println("[" + i + "] = " + array[i]);
		}
		
		System.out.println("프로그램 END");
	}

}
