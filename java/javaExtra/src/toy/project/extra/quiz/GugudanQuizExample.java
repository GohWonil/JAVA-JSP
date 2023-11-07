package toy.project.extra.quiz;

public class GugudanQuizExample {

	public static void main(String[] args) {
		//문제 출제 객체 생성
		//추상클래스 퀴즈는 직접 객체를 생성할수 없음(중요)
		//하지만 퀴즈를 상속받는 실현클래스의 객체를 가르킬수있음
		//부모클래스 = 업캐스팅
		Quiz quiz = new GugudanQuiz();
		//다운캐스팅 = 부모가 자식을 가르킬때 이 참조를
		//다시 자식을 가르키도록 만들수있음
		//자식객체의 멤버를 다시 참조할 수 있음
		GugudanQuiz guguQuiz = (GugudanQuiz) quiz;
		//문제출제
		System.out.println(quiz.getQuestion());
		//정답출력
		System.out.println(quiz.getAnswer());
		System.out.println(guguQuiz);

		
	}

}
