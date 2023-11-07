package toy.project.extra.quiz;

public class abc {

	public static void main(String[] args) {
		FourBasicCalcQuiz quiz1 = new FourBasicCalcQuiz(); 
		
		System.out.println("문제: " + quiz1.getQuestion() );
		System.out.println("힌트: " + quiz1.getHint() );
		System.out.println("정답: " + quiz1.getAnswer() );

	}

}
