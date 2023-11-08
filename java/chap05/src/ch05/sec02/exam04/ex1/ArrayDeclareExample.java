package ch05.sec02.exam04.ex1;

public class ArrayDeclareExample {

	public static void main(String[] args) {
//		배열 선언하기
//		10명의 학생성적 저장하는 배열
//		선언만 했습니다.
//		int[] score = new int[10]; //0값
//		float[] score = new float[10]; //0.0값
		String[] score = new String[10]; // null값
//		초기화는 new 타입[] {} 형식
//		기본타입은 초기화를 안하면 0에 가까운 값으로 자동 초기화
		
//		배열의 내용을 출력해보면
		for ( int i = 0; i < score.length; i++) {
						
			System.out.println("[" + i + "] = " + score[i]);
		
		
		}
		
	}

}
