package ch03.sec02.exam02.part01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;
		int z;
		
		System.out.println();
		x++;
		++x;
		System.out.println(x); //12
		
		System.out.println();
		y--;
		--y;
		System.out.println(y); //8
		
		System.out.println();
		z = x++;
		System.out.println(z); //12
		System.out.println(x); //13
		
		System.out.println();
		z = ++x;
		System.out.println(z); //14
		System.out.println(x); //14
		
		System.out.println();
		z = ++x + y++;
		System.out.println(z); //23
		System.out.println(x); //15
		System.out.println(y); //9

		
	}

}
