package toy.project.extra.quiz;

import java.util.Random;

public class GugudanQuiz extends Quiz{
	GugudanQuiz() {
		createQuestion();
	}

	@Override
	public String getHint() {
		return "구구단\n";
	}

	@Override
	void createQuestion() {
		Random rnd = new Random();
		int dan = rnd.nextInt(10); // 몇 단인가 
		int qID = rnd.nextInt(10); // 보여주지 않을 번호 
		this.question = ""; // 문제문 변수
		
		for(int i = 0; i < 10; i++) {
			if (i == qID) { // 보여주지 않을 때
				this.question += "[●]";
			} else { // 보여줄 때 
				this.question += " " + (dan * i) + " ";
			}
		}
		
		this.question += "\n\n [●]에 들어갈 수는 몇일까요?\n"; // 문제 문자열
		this.answer = "" + (dan * qID); // 정답 문자열
		
	}

}
