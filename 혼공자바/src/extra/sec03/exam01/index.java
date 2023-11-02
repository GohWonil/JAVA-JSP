package extra.sec03.exam01;

public class index {

	public static void main(String[] args) {

//		학생 5명이 있습니다 { 홍길동 홍이동 홍삼동 홍사동 홍오동 }
//		성적 관리 프로그램 만들기
//		
//		문제1. 학생 리스트를 대표변수를 이용하여 학생의 이름출력

//		문제2. 각학생의 국어 점수는 다음과 같습니다.
//		홍길동: 90점
//		홍이동: 85점
//		홍삼동: 93점
//		홍사동: 95점
//		홍오동: 87점
//		국어과목의 총점을 구하고 평균 점수를 구하시오
//		가장 높은 국어점수와 가장 낮은 국어 점수를 구하시오
//		가장 높은 국어점수를 기록한 학생 이름은 누구입니까?

		String[] student = {"홍길동", "홍이동", "홍삼동", "홍사동", "홍오동"};
//		String[] student = new String[5];
//		student = new String[] { "홍길동", "홍이동", "홍삼동", "홍사동", "홍오동" };

		int[] score = new int[5];
		score = new int[] { 90, 85, 93, 95, 87 };

		int tot = 0;
		int avg = 0;
		int max = -1;
		int min = 101;
		int index = -1;

		for (int i = 0; i < 5; i++) {

			tot += score[i];
			avg = (tot / 5);

			if (max < score[i]) {
				max = score[i];
				index = i;
			}

			if (min > score[i]) {
				min = score[i];
			}
			
		}

		String msg = """
		총점: #tot
		평균: #avg
		높은 점수: #max
		낮은 점수: #min
		최고 점수학생: #student[index]
				""";
		
		//chaining 패턴
		msg = msg.replace("#tot", "" + tot)
				.replace("#avg", "" + avg)
				.replace("#max", "" + max)
				.replace("#min", "" + min)
				.replace("#student[index]", "" + student[index]);	
		System.out.println(msg);
		
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		System.out.println("높은 점수: " + max);
		System.out.println("낮은 점수: " + min);
		System.out.println("최고 점수학생: " + student[index]);

	}
}
//public static void main(String[] args) {
//	String[] studentName = new String[5]; // 배열의 선언
//	studentName = new String[]{ "홍길동", "홍이동", "홍삼동", "홍사동", "홍오동" };
//	
//	int[] korScore = new int[] {90, 85, 93, 95, 87};
//
////-1로 두는 이유는 아직 비교하지 않았습니다란 뜻
//	int maxScore = -1; // 가장 높은 점수
//	int maxIndex = -1;  // 가장 높은 인덱스
//	int minScore = -1;
//	int minIndex = -1;
//	int total = 0;
//	int avg = 0;
//
//	for (int i = 0; i <= 4; i++) {
//	    // 총점구하기 
//	    total  = total + korScore[i];  
//
//	    // maxScore와 maxIndex구하기  
//	    if (maxScore < korScore[i]) {
//	        maxScore = korScore[i];
//	        maxIndex = i;
//	    }  
//	    
//	    // minScore와 minIndex 구하기
//	    if (minScore > korScore[i]) {
//	    	minScore = korScore[i];
//	    	minIndex = i;
//	    }
//	}
//
//	System.out.println("총점 : " + total);
//	avg = total / korScore.length;
//	System.out.println("평균 : " + avg);
//	
//	// 최고점수 출력
//	System.out.println("최고점수 : " + maxScore);
//	// 최고점수인 학생 출력
//	System.out.println("최고점수 학생 : " + studentName[maxIndex]);
//}
//
//} 