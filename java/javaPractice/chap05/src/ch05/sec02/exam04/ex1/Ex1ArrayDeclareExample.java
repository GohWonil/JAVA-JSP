package ch05.sec02.exam04.ex1;

public class Ex1ArrayDeclareExample {

	public static void main(String[] args) {

//		final int diceLength = 6;
//		int[] dice = new int[diceLength];
//		
//		for (int i = 0; i < 10; i++){
//			dice[0]++;
//			dice[(int)(Math.random() * (diceLength-1)) +1]++;
//			
//				System.out.println(dice);
				
		// 1. 주사위의 눈금의 수를 기호상수로 정의
				//     나중에 눈금의 수가 변하더라도 프로그램
				//     코드를 고칠필요 없습니다.
		        final int diceLength = 7; // 변수처럼보이지만 
		                                  // 상수이므로 기호상수  
				// 2. 주사위를 던져서 나온 눈(면)의 횟수를
				//      측정할 변수 diceCount를 선언한다
				//      이변수는 1의 눈 2의 눈 ... 6의 눈등에도
				//      공통(각주사위 눈을 얻어내는 방법이 동일)
				//      되게 작용하므로 이런경우 배열이 적격
		        //   index = 0 : 현재 주사위 던진 횟수
		        //   index = 1 : 1번 주사위를 던짐
		        //      ...
		        //   index = 6 : 6번 주사위를 던짐
		        // diceLength = total + 주사위의 눈금의 수
		        int[] diceCount = new int[diceLength];
		        
		        // 3. 각 주사위의 눈을 구하기 위해 주사위를 
		        //    반복해서 던져야 한다. 똑같은 동작을 반복하므로
		        //    반복문이 적격, 횟수가 정해져 있으므로 for사용
		        // i : 현재 주사위를 던진 횟수
		        for (int i = 0; i < 10_000; i++) {
		            // 4. 난수는 Math.random()으로 구하면 된다.
		        	//    주사위의 눈금은 
		        	//    (int)(Math.random() * diceLength) + 1
		        	// 배열의 인덱스가 주사위의 눈금을 이미
		        	// 배열은 그눈금의 출현횟수를 의미
		        	// diceCount[0] = 주사위를 던진 횟수
		        	diceCount[0]++;
		        	// diceCount[1 ~ 6] : 주사위 눈금이 나온 횟수 
		        	diceCount[
		        	    (int)(Math.random() * (diceLength - 1)) + 1 ]++;
		        }
		        
		        /// 5. 결과 출력 뷰
		        System.out.println("---------------------------");
		        System.out.println("면  빈도");
		        System.out.println("---------------------------");
		        
		        // 눈금(면)과 각 눈금이 출현한 횟수 출력
		        for (int i = 0; i < diceLength; i++) {
		        	// 배열의 인덱스 == 0이면 총 주사위를 던진 횟수
		        	//   아니면 각 주사위눈금별 출현 횟수
		        	if (i == 0) {
		        	   System.out.println(
		        			"" + i + " 총 던진 주사위 횟수:" + diceCount[0]);	
		        	} else {
		        	   System.out.println(
		        		   "" + (i) + "    " + diceCount[i]);
		        	}
		        }
		        
			}

		}