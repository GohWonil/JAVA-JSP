package toy.project.extra.quiz;

public class QuizExample {

	public static void main(String[] args) {
		GugudanQuiz quiz = new GugudanQuiz(); // 구구단 맞추기 퀴즈 
		
		System.out.println("문제: " + quiz.getQuestion() );
		System.out.println("힌트: " + quiz.getHint() );
		System.out.println("정답: " + quiz.getAnswer() );

	}

}
