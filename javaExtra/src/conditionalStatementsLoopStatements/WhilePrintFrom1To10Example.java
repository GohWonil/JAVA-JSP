package conditionalStatementsLoopStatements;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {

//		int i  = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
			
//System.out.println(java.util.stream.
//		IntStream.rangeClosed(1, 10).
//		mapToObj(Integer::toString).
//		collect(java.util.stream.
//				Collectors.joining(" ")));
		
		int sum = 0;
		
		int i = 1;
		
		while(i <= 1000) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i - 1) + "합: " + sum);
		
		}

	}


