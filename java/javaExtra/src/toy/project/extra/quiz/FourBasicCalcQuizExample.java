package toy.project.extra.quiz;

public class FourBasicCalcQuizExample {

	public static void main(String[] args) {
		FourBasicCalcQuiz quiz = new FourBasicCalcQuiz(); 
		
		System.out.println("문제: " + quiz.getQuestion() );
		System.out.println("힌트: " + quiz.getHint() );
		System.out.println("정답: " + quiz.getAnswer() );

	}

}
