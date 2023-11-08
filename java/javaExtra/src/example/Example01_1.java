package example;

import java.util.Scanner;
 
public class Example01_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Example01 a = new Example01();
		
		System.out.println("학과: " );
		String name = sc.next();
		a.setName(name);
		
		System.out.println("학번: ");
		int num = sc.nextInt();
		a.setNum(num);
		
		System.out.println("학과: " + a.getName() + 
				 "\n" + "학번: " + a.getNum());
	}
}